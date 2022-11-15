package edu.fiuba.algo3.modelo.Construccion;

public interface Construccion {

    void construir();
    void quitarVida(int cant);
    void avanzarTurno();
    boolean estaDisponible();

}
