package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Pilon extends Construccion {

    @Override
    public void empezarAConstruirSegun(Turno turno) {
        if(turno.getCantidad() == 5){
            this.ESTADO_CONSTRUCCION= true;
        }
    }
}
