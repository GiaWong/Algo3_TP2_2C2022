package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Exception.NoEstaEnElMapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.Area;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
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
        casilla.agregar(construccion);
    }

    public void agregar(Unidad unidad, Coordenada coord){
        Casilla casilla = this.buscar(coord);
        unidad.asignarPosicion(coord);
        casilla.agregar(unidad);
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
            Casilla casilla = new Casilla();
            casilla.asignarArea(area);
            mapa[4][i]= casilla;
        }
   }

    public void casillaConTerrenoMoho(int fila, int columna){

        (mapa[fila][columna]).setTerreno(new ConMoho());
    }

    public void expandirMoho(Coordenada coordenada, int radio){
        int filaSuperior = coordenada.calculoFilaSuperior(radio,altura);
        int filaInferior = coordenada.calculoFilaInferior(radio,base);
        int columnaSuperior = coordenada.calculoColumnaSuperior(radio,altura);
        int columnaInferior = coordenada.calculoColumnaInferior(radio,base);
        for(int i=filaInferior; i < filaSuperior; i++){
            for(int j=columnaInferior; j < columnaSuperior;j++){
                mapa[i][j].setTerreno(new ConMoho());
            }
        }
    }

    public void destruirConstruccion(int fila, int columna) { //Puede ser que se ocupe Raza de esto...

        if((mapa [fila][columna]).esConstruccion(new Pilon())){

            int radio = (mapa [fila][columna]).obtenerRadio();
            this.setearRadioTerreno(radio,fila, columna, new SinTerreno());
            (mapa [fila][columna]).destruirConstruccion();
            this.setearRadio();

        }else{
            (mapa [fila][columna]).destruirConstruccion();
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

    public void setearRadio() { //Puede ser que se ocupe Raza de esto...
        int radio;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if ((mapa[i][j]).esConstruccion(new Criadero())) {
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
