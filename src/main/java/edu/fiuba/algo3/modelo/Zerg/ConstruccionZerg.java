package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Turno.Turno;

public interface ConstruccionZerg {
    boolean estaDisponible();

    void empezarAConstruirSegun(Turno turno);
}