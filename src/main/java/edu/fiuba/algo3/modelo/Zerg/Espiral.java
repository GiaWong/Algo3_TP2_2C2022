package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Espiral extends Construccion {

    private final int TIEMPO_CONSTRUCCION = 10;

    private int turnos;


    public Espiral() {
        this.turnos = 0;
    }

    @Override
    public void avanzarTurno(int i) {
        this.turnos++;
    }


    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return (hayMoho);
    }

    public boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral){
        return (!hayVolcan && !hayNodoMineral);
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
