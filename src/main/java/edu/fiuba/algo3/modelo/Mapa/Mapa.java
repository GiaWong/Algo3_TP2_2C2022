package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Exception.FaltaEdificioParaCrearUnidad;
import edu.fiuba.algo3.modelo.Exception.ObjetivoFueraDeRango;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.Area;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.UnidadProtoss;
import edu.fiuba.algo3.modelo.Unidades.UnidadZerg;

public class Mapa {

    private final int base;
    private final int altura;
    private final Casilla [][] mapa;

    private int edificiosProtoss = 0, edificiosZerg = 0;

    public Mapa(int unaBase, int unaAltura){
        base = unaBase;
        altura = unaAltura;
        mapa = new Casilla[base][altura];
        for(int i=0; i < base; i++){
            for(int j=0; j < altura;j++){
                mapa[i][j] = new Casilla(new Coordenada(i, j));
            }
        }
    }

    public Casilla buscar(Coordenada coordenada) {
        return coordenada.buscar(mapa);
    }

    public void inicializarMapaConDosBases(){
        Pilon pilon = new Pilon();
        Criadero criadero =new Criadero();
        Coordenada coordenadaP = new Coordenada(5,5);
        Coordenada coordenadaC = new Coordenada(17,17);
        agregar(pilon,coordenadaP);
        agregar(criadero,coordenadaC);

    }
    public void agregar(Construccion construccion, Coordenada coord){
        Casilla casilla = this.buscar(coord);
        construccion.asignarPosicion(coord);
        casilla.agregar(construccion,this);

    }


    public void agregar(UnidadProtoss unidad, Coordenada coord){
        Casilla casilla = this.buscar(coord);
        unidad.asignarPosicion(coord);
        if(cumplePrerequisito(unidad)){
            casilla.agregar(unidad);
        } else {
            throw new FaltaEdificioParaCrearUnidad();
        }
    }

    public void agregar(UnidadZerg unidad, Coordenada coord){
        Casilla casilla = this.buscar(coord);
        unidad.asignarPosicion(coord);
        if(cumplePrerequisito(unidad)){
            if(hayCriaderosDisponibles()){
                casilla.agregar(unidad);
                unidad.detectarUnidadesInvisibles(this,coord);
            }
        } else {
            throw new FaltaEdificioParaCrearUnidad();
        }
    }

    public void agregar(Unidad unidad, Coordenada coord){
        Casilla casilla = this.buscar(coord);
        unidad.asignarPosicion(coord);
        casilla.agregar(unidad);

    }

    private boolean hayCriaderosDisponibles() {
        int i = 0;
        int j = 0;
        boolean encontrado = false;
        while (i < base && !encontrado){
            while (j < altura && !encontrado){
                encontrado = mapa[i][j].hayCriaderoConLarvas();
                j++;
            }
            i++;
            j = 0;
        }
        return encontrado;
    }

    public boolean cumplePrerequisito(Unidad unidad){
        int i = 0;
        int j = 0;
        boolean encontrado = false;
        while (i < base && !encontrado){
            while (j < altura && !encontrado){
                encontrado = mapa[i][j].esPrerequisito(unidad);
                j++;
            }
            i++;
            j = 0;
        }
        return encontrado;
    }

    public boolean cumplePrerequisito(Construccion construccion){
        int i = 0;
        int j = 0;
        boolean encontrado = false;
        while (i < base && !encontrado){
            while (j < altura && !encontrado){
                encontrado = mapa[i][j].esPrerequisito(construccion);
                j++;
            }
            i++;
            j = 0;
        }
        return encontrado;
    }

    public void atacar (Unidad unidadAtacante, Coordenada coord){
        Casilla casillaAtacada = this.buscar(coord);
        if (unidadAtacante.estaEnRango(coord)){
            casillaAtacada.atacar(unidadAtacante);
        } else {
            throw new ObjetivoFueraDeRango();
        }
    }


    public void inicializarConUnaFranjaEspacial(){
        for(int i=0; i < 5; i++) {
            Area area = new AreaEspacial();
            mapa[4][i].setArea(area);
        }
    }

    public void setearRadio(Coordenada coordenada, int radio, Terreno unTerreno){
        int filaSuperior = coordenada.calculoFilaSuperior(radio,altura);
        int filaInferior = coordenada.calculoFilaInferior(radio,base);
        int columnaSuperior = coordenada.calculoColumnaSuperior(radio,altura);
        int columnaInferior = coordenada.calculoColumnaInferior(radio,base);

        for(int i = filaInferior; i < filaSuperior; i++){
            for(int j = columnaInferior; j < columnaSuperior; j++){

                mapa[i][j].setTerreno(unTerreno);
            }
        }
    }

    public void destruirConstruccion(Coordenada unaCoordenada) {
        Casilla casilla = this.buscar(unaCoordenada);
        casilla.destruirConstruccion(this);
    }

    public void destruirUnidad(Coordenada unaCoordenada) {
        Casilla casilla = this.buscar(unaCoordenada);
        casilla.destruirUnidad();
    }

    public boolean hayUnidad(int fila, int columna) {
        return (mapa [fila][columna]).hayUnidad();
    }

    public boolean hayConstruccion(Coordenada coordenada) {
        Casilla casilla = this.buscar(coordenada);
        return casilla.hayConstruccion();
    }

    public Unidad devolverUnidad(Coordenada coord){
        Casilla casilla = this.buscar(coord);
        return casilla.devolverUnidad();
    }


    /*public boolean tipoTerreno (Terreno terreno,int fila, int columna){ //Se usa solo para el CasoDeUso9
        return (mapa[fila][columna]).tipoTerreno(terreno);
    }

     */

    public void avanzarTurno(){
        for(int i=0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                mapa[i][j].avanzarTurno(this);
            }
        }
    }

    public boolean tieneConstruccionesProtoss(){
        return (edificiosProtoss > 0);
    }

    public boolean tieneConstruccionesZerg(){
        return (edificiosZerg > 0);
    }

    public void aumentarEdificioProtoss(){
        edificiosProtoss += 1;
    }

    public void aumentarEdificioZerg(){
        edificiosZerg += 1;
    }

    public void disminuirEdificioProtoss() { edificiosProtoss -= 1; }

    public void disminuirEdificioZerg() { edificiosZerg -= 1; }

    public void setearTerrenoCoordenada(Coordenada coordenada, ConMoho conMoho) {
        coordenada.setTerreno(mapa,conMoho);
    }

    public void setearArea(Coordenada coordenada, Area area) {
        coordenada.setArea(mapa,area);
    }

    public void detectarInvisibles(Coordenada coordenada, int radio) {
        int filaSuperior = coordenada.calculoFilaSuperior(radio,altura);
        int filaInferior = coordenada.calculoFilaInferior(radio,base);
        int columnaSuperior = coordenada.calculoColumnaSuperior(radio,altura);
        int columnaInferior = coordenada.calculoColumnaInferior(radio,base);

        for(int i = filaInferior; i < filaSuperior; i++){
            for(int j = columnaInferior; j < columnaSuperior; j++){

                mapa[i][j].detectarInvisible();
            }
        }
    }
}
