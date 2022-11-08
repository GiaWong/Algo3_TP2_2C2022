package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Turno.Turno;

public interface RefineriaGas {

    boolean estaDisponible();

    void empezarAConstruirSegun(Turno turno);
}
