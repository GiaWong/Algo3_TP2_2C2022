package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinNada;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zerling;

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

    public void setearRadio(){
        int radio;
        for(int i=0; i<20; i++){
            for(int j=0; j<20;j++){


                if((casillas[i][j]).esConstruccion(new Criadero())){
                    radio =(casillas[i][j]).obtenerRadio();
                    this.setearRadioTerreno(radio, i,j, new ConMoho());

                }else if ((casillas[i][j]).esConstruccion(new Pilon())){
                    radio =(casillas[i][j]).obtenerRadio();
                    this.setearRadioTerreno(radio, i,j, new ConEnergia());
                }

            }
        }
    }

    private void setearRadioTerreno(int radio, int fila, int columna, Terreno terreno) {

        for (int i=0; i<radio; i++){
            for(int j=0; j<radio; j++){

                if(!(casillas[fila + i][columna + j].tipoTerreno(new ConMoho()))){//si en esa posicion tiene moho

                    casillas[fila + i][columna + j].setTerreno(terreno);

                }

                if(!(casillas[fila - i][columna - j].tipoTerreno(new ConMoho()))){

                    casillas[fila - i][columna - j].setTerreno(terreno);

                }

                //casillas[fila + i][columna + j].setTerreno(terreno);
                //casillas[fila - i][columna - j].setTerreno(terreno);
            }
        }

    }

    public boolean tipoTerreno(Terreno terreno, int fila, int columna) {
        return (casillas[fila][columna]).tipoTerreno(terreno);

    }

    public void atacar(Unidad unidad, int fila, int colum) {
        Casilla casilla = (casillas[fila][colum]);
        casilla.atacar(unidad);
    }
}
