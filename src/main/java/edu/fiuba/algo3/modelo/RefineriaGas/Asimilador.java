package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Turno.Turno;

public class  Asimilador implements RefineriaGas {

    private boolean estadoConstruccion = false;
    @Override
    public boolean estaDisponible() {
        return this.estadoConstruccion;
    }

    @Override
    public void empezarAConstruirSegun(Turno turno) {
        int tiempoConstruccion = 6;
        if(turno.getCantidad() == tiempoConstruccion){
            this.estadoConstruccion = true;
        }

    }
}
