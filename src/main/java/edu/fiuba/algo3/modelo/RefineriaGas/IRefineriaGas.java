package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Turno.Turno;

public interface IRefineriaGas {

    boolean estaDisponible();

    void empezarAConstruirSegun(Turno turno);
}
