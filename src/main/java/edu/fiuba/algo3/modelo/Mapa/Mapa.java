package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;

import java.util.List;

public class Mapa {

    public Casilla [][] casillas = new Casilla[20][20];


    public Mapa(){
        for(int i=0; i<20; i++){
            for(int j=0; j<20;j++){
                casillas[i][j]= new Casilla();
            }
        }
    }
    public void casillaConTerrenoMoho(int fila, int columna){

        (casillas[fila][columna]).setTerreno(new ConMoho());
    }
    public void agregarConstruccion(Construccion construccion,int fila, int columna){

        (casillas [fila][columna]).agregarConstruccion(construccion);



    }

    public void destruirConstruccion(int fila, int columna) {
        (casillas [fila][columna]).destruirConstruccion();
    }

    public boolean hayConstruccion(int fila, int columna) {
        return (casillas [fila][columna]).hayConstruccion();
    }

    public void ampliarRadio(){

        for(int i=0; i<20; i++){
            for(int j=0; j<20;j++){

                if((casillas[i][j]).esConstruccion(new Criadero())){
                    //System.out.println(i);
                    //System.out.println(j);
                    int radio =(casillas[i][j]).obtenerRadio();
                    this.setearRadioTerreno(radio, i,j);
                }

            }
        }
    }

    private void setearRadioTerreno(int radio, int fila, int columna) {
        //System.out.println(radio);
        for (int i=0; i<radio; i++){
            for(int j=0; j<radio; j++){

                casillas[fila + i][columna + j].setTerreno(new ConMoho());
                casillas[fila - i][columna - j].setTerreno(new ConMoho());
            }
        }

    }
}
