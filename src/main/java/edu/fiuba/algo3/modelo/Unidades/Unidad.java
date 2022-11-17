package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.ArrayList;
import java.util.List;

public abstract class Unidad {

    protected int vida;
    protected int danio;
    protected int tiempoConstruccion;
    protected int rango;
    protected Superficie superficie;
    protected List<Integer> costos = new ArrayList<>();

    public abstract void construir();

    public void atacar(Construccion construccion) {
        construccion.recibeDanio(danio);

    }
    public void atacar(Unidad unidad) {
        unidad.recibirDanio(danio);
    }

    public abstract void recibirDanio(int danio);
    public abstract List<Integer> costo();

    public int rango() {
        return rango;
    }
}
