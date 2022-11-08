package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Turno.Turno;

public class PuertoEstelar implements ConstruccionProtoss {

    private boolean estadoConstruccion = false;

    @Override
    public boolean estaDisponible() {
        return this.estadoConstruccion;
    }

    @Override
    public void empezarAConstruirSegun(Turno turno) {
        int tiempoConstruccion = 10;
        if(turno.getCantidad() == tiempoConstruccion){
            this.estadoConstruccion = true;
        }
    }
}
