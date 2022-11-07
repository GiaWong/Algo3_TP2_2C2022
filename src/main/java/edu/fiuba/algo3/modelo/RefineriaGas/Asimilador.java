package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.RefineriaGas.IRefineriaGas;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class  Asimilador implements IRefineriaGas {

    @Override
    public boolean estaDisponible() {
        return false;
    }

    @Override
    public void empezarAConstruirSegun(Turno turno) {

    }
}
