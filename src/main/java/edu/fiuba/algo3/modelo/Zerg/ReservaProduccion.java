package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;


public class ReservaProduccion extends Construccion {

    private final int TIEMPO_CONSTRUCCION = 12;

    private int turnos;

    public ReservaProduccion() {
        super();
        this.turnos = 0;

    }

    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return (hayMoho);
    }

    public boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral){
        return (!hayVolcan && !hayNodoMineral);
    }
    @Override
    public void avanzarTurno(int i) {
        this.turnos += i;
    }

    @Override
    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }

    public void recibeDanio(int i) {
    }

    public int obtenerVida() {
        return 0;
    }
}
