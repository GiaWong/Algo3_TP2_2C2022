package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Exception.NoEstaEnElMapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinNada;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class Mapa {

    public Casilla [][] casillas = new Casilla[20][20];


    public Mapa(){
        for(int i=0; i<20; i++){
            for(int j=0; j<20;j++){
                casillas[i][j]= new Casilla();
            }
        }
    }
   public void inicializarMapa2ConBases(){
        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        this.agregar(pilon,5,5);
        this.agregar(criadero,17,17);
   }
    public void casillaConTerrenoMoho(int fila, int columna){

        (casillas[fila][columna]).setTerreno(new ConMoho());
    }
    public void agregar(Construccion construccion, int fila, int columna){
        (casillas [fila][columna]).agregar(construccion);

    }
    public void agregar(Unidad unidad, int fila, int columna){
        (casillas [fila][columna]).agregar(unidad);
    }

    public void destruirConstruccion(int fila, int columna) {

        if((casillas [fila][columna]).esConstruccion(new Pilon())){

            int radio = (casillas [fila][columna]).obtenerRadio();
            this.setearRadioTerreno(radio,fila, columna, new SinNada());
            (casillas [fila][columna]).destruirConstruccion();
            this.setearRadio();

        }else{
            (casillas [fila][columna]).destruirConstruccion();
        }


    }

    public boolean hayConstruccion(int fila, int columna) {
        return (casillas [fila][columna]).hayConstruccion();
    }


    public int[] buscarUnidad(Unidad unidad) throws NoEstaEnElMapa{
        int [] pos = new int[10];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if ((casillas[i][j]).esUnidad(unidad)) {
                    pos[0]=i;
                    pos[1]=j;
                    return pos;
                }
            }
        }
         throw new NoEstaEnElMapa();
    }
        public void setearRadio() {
            int radio;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {


                    if ((casillas[i][j]).esConstruccion(new Criadero())) {
                        radio = (casillas[i][j]).obtenerRadio();
                        this.setearRadioTerreno(radio, i, j, new ConMoho());

                    } else if ((casillas[i][j]).esConstruccion(new Pilon())) {
                        radio = (casillas[i][j]).obtenerRadio();
                        this.setearRadioTerreno(radio, i, j, new ConEnergia());
                    }

                }
            }
        }

        private void setearRadioTerreno ( int radio, int fila, int columna, Terreno terreno){

            for (int i = 0; i < radio; i++) {
                for (int j = 0; j < radio; j++) {

                    if (!(casillas[fila + i][columna + j].tipoTerreno(new ConMoho()))) {//si en esa posicion tiene moho

                        casillas[fila + i][columna + j].setTerreno(terreno);

                    }

                    if (!(casillas[fila - i][columna - j].tipoTerreno(new ConMoho()))) {

                        casillas[fila - i][columna - j].setTerreno(terreno);

                    }
                }
            }

        }

        public boolean tipoTerreno (Terreno terreno,int fila, int columna){
            return (casillas[fila][columna]).tipoTerreno(terreno);

        }

        public void atacar (Unidad unidad,int fila, int colum){
            int[]pos = this.buscarUnidad(unidad);
            int rango = unidad.rango();
            if((pos[0]+rango>fila && pos[1]+rango>colum)||(pos[0]+rango>fila && pos[1]+rango>colum)) {
                Casilla casilla = (casillas[fila][colum]);
                casilla.atacar(unidad);
            }
        }
    }
