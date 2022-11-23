package edu.fiuba.algo3.modelo.ConstruccionZerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.ArrayList;
import java.util.List;

public abstract class ConstruccionZerg extends Construccion {
    protected int vida;
    protected int Vida_Total,tiempoConstruccion;


    public abstract void avanzarTurno();
    @Override
    public void recibeDanio(int cant) {
        vida  -= cant;
    }

    public void construir() {
        tiempoConstruccion--;
    }

    public int obtenerVida() {return vida; }
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }


}
