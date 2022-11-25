package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionProtoss;

import java.util.ArrayList;
import java.util.List;

public abstract class UnidadProtoss extends Unidad{

    protected Escudo escudo;

    public void recibirDanio(Danio danio) {
        danio.quitarVida(escudo, vida); //Esto despues analiza como le saca vida a que cosa, si le tiene que sacar al escudo o a la vida.
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

    public abstract void modificarEstadisticas(int danio);
}
