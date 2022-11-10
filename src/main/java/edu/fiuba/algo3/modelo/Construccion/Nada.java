package edu.fiuba.algo3.modelo.Construccion;

public class Nada extends Construccion {


    @Override
    public boolean estaDisponible() {
        return false;
    }

    @Override
    public void avanzarTurno(int i) {

    }

    @Override
    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return false;
    }

    @Override
    public boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral) {
        return false;
    }
}
