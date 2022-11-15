package edu.fiuba.algo3.modelo.Construccion;

public  interface Construccion {

    public abstract void construir();
    public abstract void quitarVida(int cant);
    public abstract void avanzarTurno();
    public abstract boolean estaDisponible();

}
