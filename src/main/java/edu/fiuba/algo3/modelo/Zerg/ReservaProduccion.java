package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Turno.Turno;

public class ReservaProduccion implements ConstruccionZerg {
    private boolean ESTADO_CONSTRUCCION = false;
    @Override
    public boolean estaDisponible() {
        return this.ESTADO_CONSTRUCCION;
    }

    @Override
    public void empezarAConstruirSegun(Turno turno) {
        int TIEMPO_CONSTRUCCION = 12;
        if(turno.getCantidad() == TIEMPO_CONSTRUCCION){
            this.ESTADO_CONSTRUCCION = true;
        }
    }

}
