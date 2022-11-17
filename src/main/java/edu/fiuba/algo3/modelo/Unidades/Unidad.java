package edu.fiuba.algo3.modelo.Unidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Unidad {

    protected int vida;
    protected int tiempoConstruccion;
    protected int rango;
    protected Superficie superficie;
    protected List<Integer> costos = new ArrayList<>();

}
