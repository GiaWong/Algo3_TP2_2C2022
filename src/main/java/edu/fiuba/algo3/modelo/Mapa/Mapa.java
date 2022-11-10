package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Zerg.Larva;
import edu.fiuba.algo3.modelo.Zerg.Zangano;

import java.util.ArrayList;
import java.util.List;

public class Mapa {

    private List<List<Casilla>> fila;
    private List<Casilla> columna ;


    public void Mapa(){
        fila = new ArrayList<List<Casilla>>();
        columna = new ArrayList<Casilla>();


        for(int i = 0; i<20; i++){

            Casilla casilla = new Casilla();
            columna.add(casilla);


        }
        fila.add(columna);
        columna.get(1).agregarVolcan();
        columna.get(3).agregarNodoMineral();

    }

    public void agregar(Construccion construccion, int fila, int col) {

        //List<Casilla> Col = Fila.get(0);
        this.columna.get(2).agregarConstruccion(construccion);
    }

    public void vaciar(int i, int j) {
        List<Casilla> Col = fila.get(0);
        Col.get(j).vaciar();

    }

    public void fijarMoho(int i, int j){
        List<Casilla> Col = fila.get(0);
        Col.get(j).fijarMoho();

    }

    public void sumarEnergia(int i, int j){
        List<Casilla> Col = fila.get(0);
        Col.get(j).sumarEnergia();

    }

    public boolean sePuedeConstruirProtoss(int i, int j) {
        Casilla casilla= this.devolverCasilla(i,j);
        return casilla.energizado();
    }

    public boolean hayMoho(int i, int j) {
        Casilla casilla= this.devolverCasilla(i,j);
        return casilla.hayMoho();
    }

    public Casilla devolverCasilla(int i, int j){
        List<Casilla> Col = fila.get(0);
        return Col.get(j);
    }
    public void agregarUnidad(Zangano zangano, int i, int j) {

    }

    public boolean estaVacia(int i, int j) {
        List<Casilla> Col = fila.get(0);
        return (Col.get(j).estaVacia());

    }
}
