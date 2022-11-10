package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Zerg.Larva;
import edu.fiuba.algo3.modelo.Zerg.Zangano;


import java.util.ArrayList;
import java.util.List;

public class Mapa {

   public Casilla [][] mapa = new Casilla[30][30];


    public  Mapa(){

        for(int i = 0; i<20; i++){
            for(int j = 0; j<20; j++) {
                mapa [i][j] = new Casilla();
            }


        }

        mapa[0][1].agregarVolcan();
        mapa[0][3].agregarNodoMineral();


    }

    public void agregar(Construccion construccion, int fila, int col) {

        mapa[fila][col].agregarConstruccion(construccion);
    }

    public void vaciar(int i, int j) {

        mapa[i][j].vaciar();

    }

    public void fijarMoho(int i, int j){

        mapa[i][j].fijarMoho();

    }

    public void sumarEnergia(int i, int j){

        mapa[i][j].sumarEnergia();

    }

    public boolean sePuedeConstruirProtoss(int i, int j) {
        return  mapa[i][j].energizado();
    }

    public boolean hayMoho(int i, int j) {

        return  mapa[i][j].hayMoho();
    }

    public void agregarUnidad(Zangano zangano, int i, int j) {

    }

    public boolean estaVacia(int i, int j) {

        return ( mapa[i][j].estaVacia());

    }
}
