package edu.fiuba.algo3.modelo.Unidades;

public class Aire implements Superficie{
    @Override
    public boolean esPosibleAgregar(Unidad unidad) {;
        return (unidad.esSuperficie(this));
    }
}
