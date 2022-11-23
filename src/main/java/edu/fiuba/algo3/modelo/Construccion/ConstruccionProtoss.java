package edu.fiuba.algo3.modelo.Construccion;

import java.util.ArrayList;
import java.util.List;

public abstract class ConstruccionProtoss {

    protected int vidaTotal;
    protected int escudoTotal;
    protected int vida;
    protected int escudo;
    protected int tiempoConstruccion;
    protected List<Integer> costos = new ArrayList<>();


    public void construir() {
        tiempoConstruccion--;
    }

    public List<Integer> costo() {
        return costos;
    }

    public boolean estaDisponible() {
        return tiempoConstruccion<=0;
    }

    public abstract void avanzarTurno();
}
