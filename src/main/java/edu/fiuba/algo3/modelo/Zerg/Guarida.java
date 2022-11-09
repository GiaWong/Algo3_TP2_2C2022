package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Guarida extends Construccion {

    public Guarida() {
        super();

    }

    @Override
    public void avanzarTurno(int i) {
        if(i == 12){
            this.ESTADO_CONSTRUCCION = true;
        }
    }

    @Override
    public void empezarAConstruirSegun(Alcance alcance, Turno turno) {
        if(alcance.estaEnRangoDelRadio()){
            if(turno.getCantidad() == 12){
                this.ESTADO_CONSTRUCCION = true;
            }
        }

    }


}
