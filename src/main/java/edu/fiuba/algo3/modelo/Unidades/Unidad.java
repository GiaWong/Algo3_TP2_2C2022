package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.ArrayList;
import java.util.List;

public abstract class Unidad {

    protected int vida;
    protected Danio danio;
    protected int tiempoConstruccion;
    protected int rango;
    protected Superficie superficie;
    protected List<Integer> costos = new ArrayList<>();

    public abstract void construir();

    public void atacar(Construccion construccion) {
        construccion.recibeDanio(danio.danioTierra());

    }
    public void atacar(Unidad unidad) {
        unidad.recibirDanio(danio);
    }

    public void recibirDanio(Danio danio){
        if(danio.esPosibleAtacar(superficie)){
            this.modificarEstadisticas(danio.danioAInfligir());
        }
    }
    public abstract void modificarEstadisticas(int danio);
    public abstract List<Integer> costo();

    public int rango() {
        return rango;
    }

    public int vida() {return vida;
    }

    public Boolean esSuperficie(Superficie otraSuperficie) {
        return (superficie.getClass().equals(otraSuperficie.getClass()));
    }
}
