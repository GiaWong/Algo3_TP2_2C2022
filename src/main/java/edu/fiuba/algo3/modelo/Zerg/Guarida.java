package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Guarida extends Construccion {

    private final int TIEMPO_CONSTRUCCION = 12;

    private int turnos;

    public Guarida() {
        super();

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
