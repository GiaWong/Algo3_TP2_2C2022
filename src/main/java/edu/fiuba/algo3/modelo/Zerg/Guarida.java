package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Guarida extends Construccion {

    @Override
    public void empezarAConstruirSegun(Turno turno) {
        if(turno.getCantidad() == 12){
            this.ESTADO_CONSTRUCCION = true;
        }
    }


}
