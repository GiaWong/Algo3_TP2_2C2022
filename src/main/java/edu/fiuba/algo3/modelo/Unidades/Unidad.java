package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.ArrayList;
import java.util.List;

public abstract class Unidad implements Defendible{

    protected Vida vida;

    protected int tiempoConstruccion;

    protected int rango;

    protected Defendible defensa;

    protected Superficie superficie;

    protected List<Integer> costos = new ArrayList<>();

    public void construir() {
        tiempoConstruccion--;
    }

    public int rango() {
        return rango;
    }
    public int vida() {return vida.vidaActual();}

    public List<Integer> costo() {
        return costos;
    }

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    public abstract void modificarEstadisticas(int danio); //Este metodo no deberia existir

    public abstract void recibirDanio(Danio danio);


}
