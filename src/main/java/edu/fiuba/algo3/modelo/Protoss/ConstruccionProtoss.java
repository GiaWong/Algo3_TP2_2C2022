package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Turno.Turno;

public interface ConstruccionProtoss {

    boolean estaDisponible();

    void empezarAConstruirSegun(Turno turno);
}
