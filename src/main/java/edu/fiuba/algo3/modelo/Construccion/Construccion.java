package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Mapa.Casilla;

public abstract class Construccion {

    protected Casilla casilla;
    protected int vida;

    public void pasarCasilla(Casilla casilla){
        this.casilla = casilla;
    }

    public abstract boolean estaDisponible();

    public abstract void avanzarTurno(int i);

    public abstract boolean sePuedeConstruir(boolean hayMoho, int energia);

    public abstract boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral);

    public int obtenerVida(){
        return vida;
    }

}
