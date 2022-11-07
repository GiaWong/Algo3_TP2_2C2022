package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Protoss.IConstruccionProtoss;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class PuertoEstelar implements IConstruccionProtoss {


    @Override
    public boolean estaDisponible() {
        return false;
    }

    @Override
    public void empezarAConstruirSegun(Turno turno) {

    }
}
