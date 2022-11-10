package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Zerg.Larva;
import edu.fiuba.algo3.modelo.Zerg.Zangano;

import java.util.ArrayList;
import java.util.List;

public class Mapa {

    private List<List<Casilla>> Fila = new ArrayList<>();

    private List<Casilla> Columna = new ArrayList<>();


    public void Mapa(){
        Fila.add(Columna);
        List<Casilla> Col = Fila.get(0);
        Col.get(1).agregarVolcan();
        Col.get(3).agregarNodoMineral();

    }

    public void agregar(Construccion construccion, int fila, int columna) {

        List<Casilla> Col = Fila.get(0);
        Col.get(columna).agregarConstruccion(construccion);
    }

    public void vaciar(int i, int i1) {
    }

    public boolean sePuedeConstruirProtoss(int i, int i1) {
    }

    public boolean hayMoho(int i, int i1) {
    }

    public void agregarUnidad(Zangano zangano, int i, int i1) {
    }

    public boolean estaVacia(int i, int i1) {

    }
}
