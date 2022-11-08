package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class NexoMineral extends Construccion {

    @Override
    public void empezarAConstruirSegun(Turno turno) {

        if(turno.getCantidad() == 4){
            this.ESTADO_CONSTRUCCION = true;
        }

    }
}
