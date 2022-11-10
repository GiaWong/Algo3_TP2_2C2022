package edu.fiuba.algo3.modelo.Construccion;

public abstract class Construccion {

    public abstract boolean estaDisponible();

    public abstract void avanzarTurno(int i);

    public abstract boolean sePuedeConstruir(boolean hayMoho, int energia);

    public abstract boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral);


}
