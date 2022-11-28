package edu.fiuba.algo3.modelo.Unidades;

public class Translucida implements Superficie{

    @Override
    public boolean esPosibleSerAtacadoPorAtaqueTierra() {
        return false;
    }

    @Override
    public boolean esPosibleSerAtacadoPorAtaqueAire() {
        return false;
    }
}
