package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.Area;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

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

    public void inicializarMapaCon2Bases(){
        Pilon pilon = new Pilon();
        Criadero criadero =new Criadero();
        Coordenada coordenadaP = new Coordenada(6,6);
        Coordenada coordenadaC = new Coordenada(14,14);
        agregar(pilon,coordenadaP);
        agregar(criadero,coordenadaC);

    }
    public void agregar(Construccion construccion, Coordenada coord){
        Casilla casilla = this.buscar(coord);
        construccion.asignarPosicion(coord);
        casilla.agregar(construccion,this);
    }


    public void agregar(Unidad unidad, Coordenada coord){
        Casilla casilla = this.buscar(coord);
        unidad.asignarPosicion(coord);
        casilla.agregar(unidad);
    }

    public boolean cumplePrerequisito(Construccion construccion){
        int i = 10;
        int j = 10;
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

    public void atacar (Unidad unidadAtacante, Coordenada coord){ //Puede ser que se ocupe Raza de esto...
        Casilla casillaAtacada = this.buscar(coord);
        if (unidadAtacante.estaEnRango(coord)){
            casillaAtacada.atacar(unidadAtacante);
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
        if(casilla.esConstruccion(new Pilon())){
            casilla.destruirConstruccion();
            this.setearRadio(unaCoordenada, 3, new SinTerreno());
        }else{
            casilla.destruirConstruccion();
        }
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

    public void cantidadEdificios(){
        edificiosProtoss =0;
        edificiosZerg=0;
        for(int i=0; i < base; i++){
            for(int j=0; j < altura;j++){
                if(mapa[i][j].hayConstruccion()) {
                    try {
                        mapa[i][j].construccionProtoss();
                    } catch (Exception EstaConstruccionEsProtoss) {
                        edificiosProtoss += 1;
                    }
                    try {
                        mapa[i][j].construccionZerg();
                    } catch (Exception EstaConstruccionEsZerg) {
                        edificiosZerg += 1;
                    }
                }
            }
        }
    }

    public boolean finJuego(){
        cantidadEdificios();
        return (edificiosProtoss == 0 || edificiosZerg == 0);
    }


    public boolean tipoTerreno (Terreno terreno,int fila, int columna){
        return (mapa[fila][columna]).tipoTerreno(terreno);
    }

    public void avanzarTurno(){
        for(int i=0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                    mapa[i][j].avanzarTurno(this);
            }
        }
    }

}
