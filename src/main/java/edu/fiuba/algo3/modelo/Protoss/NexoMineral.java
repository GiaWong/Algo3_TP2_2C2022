package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class NexoMineral extends Construccion {


    public NexoMineral() {

    }

    @Override
    public void avanzarTurno(int i) {

    }

    @Override
    public void empezarAConstruirSegun(Alcance alcance, Turno turno) {
        if(alcance.estaEnRangoDelRadio()) {
            if (turno.getCantidad() == 4) {
                this.ESTADO_CONSTRUCCION = true;
            }
        }

    }
}
