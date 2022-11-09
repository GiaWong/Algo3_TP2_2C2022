package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Turno.Turno;

public abstract class Construccion {
    protected boolean ESTADO_CONSTRUCCION = false;
    public boolean estaDisponible() {
        return this.ESTADO_CONSTRUCCION;
    }

    public abstract void avanzarTurno(int i);

    public abstract void empezarAConstruirSegun(Alcance alcance, Turno turno);

}
