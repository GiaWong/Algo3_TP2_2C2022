package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.ArrayList;
import java.util.List;

public abstract class Unidad {

    protected int vida;


    protected int tiempoConstruccion;

    protected int rango;

    protected Danio danio;

    protected Superficie superficie;

    protected List<Integer> costos = new ArrayList<>();

    public void construir() {
        tiempoConstruccion--;
    }

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
    public int rango() {
        return rango;
    }

    public int vida() {return vida;}

    public boolean esSuperficie(Superficie otraSuperficie) {
        return (superficie.getClass().equals(otraSuperficie.getClass()));
    }

    public List<Integer> costo() {
        return costos;
    }

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    public abstract void modificarEstadisticas(int danio);


}
