package edu.fiuba.algo3.modelo.Construccion;

public class Construccion {
    private boolean ESTADO_CONSTRUCCION = false;

    private int vida;
    private int costeMineral;
    private int costeGasVespeno;

    public boolean estaDisponible() {
        return this.ESTADO_CONSTRUCCION;
    }
}
