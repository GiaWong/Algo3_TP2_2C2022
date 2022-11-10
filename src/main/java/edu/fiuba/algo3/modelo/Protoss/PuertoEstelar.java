package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

public class PuertoEstelar extends Construccion {

    private final int TIEMPO_CONSTRUCCION = 10;

    private int turnos;

    public PuertoEstelar() {
        this.turnos = 0;
    }

    @Override
    public void avanzarTurno(int i) {
        this.turnos++;
    }

    @Override
    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }


    public boolean estaOperativo() {
        return true;
    }

    public void recibeDanio(int i) {
    }

    public int obtenerEscudo() {
        return 0;
    }

    public int obtenerVida() {
        return 0;
    }
}
