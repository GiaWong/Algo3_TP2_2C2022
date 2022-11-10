package edu.fiuba.algo3.modelo.Construccion;

public abstract class Construccion {

    public abstract boolean estaDisponible();

    public abstract void avanzarTurno(int i);

    public boolean sePuedeConstruir(boolean hayMoho, int energia);

    public boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral);


}
