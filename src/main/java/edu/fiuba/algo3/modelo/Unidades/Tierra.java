package edu.fiuba.algo3.modelo.Unidades;

public class Tierra implements Superficie{

    @Override
    public boolean esPosibleSerAtacadoPorAtaqueTierra() {
        return true;
    }

    @Override
    public boolean esPosibleSerAtacadoPorAtaqueAire() {
        return false;
    }
}
