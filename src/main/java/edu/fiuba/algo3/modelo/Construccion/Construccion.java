package edu.fiuba.algo3.modelo.Construccion;

import java.util.List;

public interface Construccion {

    void construir();
    void recibeDanio(int cant);
    void avanzarTurno();
    boolean estaDisponible();

    List<Integer> costo();

    int obtenerVida();
}
