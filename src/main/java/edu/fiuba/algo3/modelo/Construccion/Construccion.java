package edu.fiuba.algo3.modelo.Construccion;

import java.util.ArrayList;
import java.util.List;

public abstract class Construccion {

    protected List<Integer> costos = new ArrayList<>();

    public abstract void recibeDanio(int cant);
    public List<Integer> costo() {
        return costos;
    }



}
