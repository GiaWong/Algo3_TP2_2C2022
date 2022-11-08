package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Espiral extends Construccion {

    @Override
    public void empezarAConstruirSegun(Turno turno) {
        if(turno.getCantidad() == 10){
            this.ESTADO_CONSTRUCCION = true;
        }

    }


}
