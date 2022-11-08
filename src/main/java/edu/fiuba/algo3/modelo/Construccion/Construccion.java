package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Turno.Turno;

public abstract class Construccion {
    protected boolean ESTADO_CONSTRUCCION = false;
    public boolean estaDisponible() {
        return this.ESTADO_CONSTRUCCION;
    }

    public abstract void empezarAConstruirSegun(Turno turno);
}
