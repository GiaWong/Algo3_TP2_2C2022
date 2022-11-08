package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class  Asimilador extends Construccion {

    @Override
    public void empezarAConstruirSegun(Turno turno) {
        if(turno.getCantidad() == 6){
            this.ESTADO_CONSTRUCCION = true;
        }

    }
}
