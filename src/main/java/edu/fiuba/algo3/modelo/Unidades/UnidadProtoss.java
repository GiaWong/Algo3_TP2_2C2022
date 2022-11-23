package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionProtoss;

import java.util.ArrayList;
import java.util.List;

public abstract class UnidadProtoss {

    protected Vida vida;

    protected int tiempoConstruccion;

    protected int rango;

    protected Defendible defendible;

    protected Superficie superficie;

    protected List<Integer> costos = new ArrayList<>();

    public void construir() {
        tiempoConstruccion--;
    }

    public void atacar(ConstruccionProtoss construccion) {
        construccion.recibeDanio(defendible.danioTierra());

    }
    public void atacar(Unidad unidad) {
        unidad.recibirDanio(defendible);
    }

    public void recibirDanio(Defendible defendible){
        if(defendible.esPosibleAtacar(superficie)){
            defendible.recibirDanioZerg(vida);
        }
    }

    public int rango() {
        return rango;
    }

    public int vida() {return vida.vidaActual();}

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
