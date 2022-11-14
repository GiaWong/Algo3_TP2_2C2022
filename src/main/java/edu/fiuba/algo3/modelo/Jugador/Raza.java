package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Unidades.Unidad;
import java.util.List;

public abstract class Raza {

    protected List<Unidad> unidades;

    public abstract void agregarConstruccion();

    public abstract void recolectar();

    public abstract void evolucionar();
}
