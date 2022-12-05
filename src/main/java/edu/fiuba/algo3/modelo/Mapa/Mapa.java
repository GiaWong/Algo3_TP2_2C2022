package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Exception.NoEstaEnElMapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.Area;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class Mapa {

    private int base;
    private int altura;
    private Casilla [][] mapa;

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

    public void atacar (Unidad unidadAtacante, Coordenada coord){ //Puede ser que se ocupe Raza de esto...
        Casilla casillaAtacada = this.buscar(coord);
        if (unidadAtacante.estaEnRango(coord)){
            casillaAtacada.atacar(unidadAtacante);
        }
    }

    /*
   public void inicializarMapa2ConBases(){
        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        this.agregar(pilon,5,5);
        this.agregar(criadero,17,17);
   }
   */

   public void inicializarConUnaFranjaEspacial(){
        for(int i=0; i < 5; i++) {
            Area area = new AreaEspacial();
            mapa[4][i].setArea(area);
        }
   }

    public void casillaConTerrenoMoho(Coordenada coordenada){

       coordenada.setTerreno(mapa,new ConMoho());

    }

    public void setearRadio(Coordenada coordenada, int radio, Terreno unTerreno){
        int filaSuperior = coordenada.calculoFilaSuperior(radio,altura);
        int filaInferior = coordenada.calculoFilaInferior(radio,base);
        int columnaSuperior = coordenada.calculoColumnaSuperior(radio,altura);
        int columnaInferior = coordenada.calculoColumnaInferior(radio,base);
        for(int i=filaInferior; i < filaSuperior; i++){
            for(int j=columnaInferior; j < columnaSuperior;j++){

                mapa[i][j].setTerreno(unTerreno);
            }
        }
    }

    public void destruirConstruccion(Coordenada unaCoordenada) { //Puede ser que se ocupe Raza de esto...
        Casilla casilla = this.buscar(unaCoordenada);
        if(casilla.esConstruccion(new Pilon())){
            casilla.destruirConstruccion();
            this.setearRadio(unaCoordenada, 3, new SinTerreno());
        }else{
            casilla.destruirConstruccion();
        }
    }

    public boolean hayConstruccion(int fila, int columna) {
        return (mapa [fila][columna]).hayConstruccion();
    }

    public boolean hayUnidad(int fila, int columna) {
        return (mapa [fila][columna]).hayUnidad();
    }
    public int[] buscarUnidad(Unidad unidad) throws NoEstaEnElMapa{ //Puede ser que se ocupe Raza de esto...
        int [] pos = new int[10];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if ((mapa[i][j]).esUnidad(unidad)) {
                    pos[0]=i;
                    pos[1]=j;
                    return pos;
                }
            }
        }
        throw new NoEstaEnElMapa();
    }
/*
    public void setearRadio() { //Puede ser que se ocupe Raza de esto... y que se ocupe construccionConRadio de esto
        int radio;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if ((mapa[i][j]).esConstruccion(new Criadero())) { //Se tiene que hacer de una mejor manera... Capaz con el nuevo modelo tentativo puedo solucionar esto mas facil
                    radio = (mapa[i][j]).obtenerRadio();
                    this.setearRadioTerreno(radio, i, j, new ConMoho());

                } else if ((mapa[i][j]).esConstruccion(new Pilon())) {
                    radio = (mapa[i][j]).obtenerRadio();
                    this.setearRadioTerreno(radio, i, j, new ConEnergia());
                }
            }
        }
    }

    private void setearRadioTerreno ( int radio, int fila, int columna, Terreno terreno){

        for (int i = 0; i < radio; i++) {
            for (int j = 0; j < radio; j++) {

                if (!(mapa[fila + i][columna + j].tipoTerreno(new ConMoho()))) {//si en esa posicion tiene moho

                    mapa[fila + i][columna + j].setTerreno(terreno);

                }

                if (!(mapa[fila - i][columna - j].tipoTerreno(new ConMoho()))) {

                    mapa[fila - i][columna - j].setTerreno(terreno);

                }
            }
        }
    }

 */

    public boolean tipoTerreno (Terreno terreno,int fila, int columna){
        return (mapa[fila][columna]).tipoTerreno(terreno);
    }

    public void detectar(Unidad unidad){
        int[]pos = this.buscarUnidad(unidad); //falta terminar de codear esta parte
        for(int i = 0; i <   4; i++){
            for(int j = 0; j <  4; j++){
                if(mapa[pos[0]+i][pos[0]+j].hayUnidad()){
                    mapa[pos[0]+i][pos[0]+j].unidad.detectado();
                }
            }
        }
    }

    public void energizar(Coordenada coordenada, int radio) {
    }

}
