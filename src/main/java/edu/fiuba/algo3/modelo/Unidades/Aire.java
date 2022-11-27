package edu.fiuba.algo3.modelo.Unidades;

public class Aire implements Superficie {

    @Override
    public boolean esPosibleSerAtacadoPorAtaqueTierra() {
        return false;
    }

    @Override
    public boolean esPosibleSerAtacadoPorAtaqueAire() {
        return true;
    }

}
