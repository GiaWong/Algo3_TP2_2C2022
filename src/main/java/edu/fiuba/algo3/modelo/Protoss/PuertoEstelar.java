package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class PuertoEstelar extends Construccion {


    public PuertoEstelar() {

    }

    @Override
    public void avanzarTurno(int i) {
        if (i == 10) {
            this.ESTADO_CONSTRUCCION = true;
        }
    }

    @Override
    public void empezarAConstruirSegun(Alcance alcance, Turno turno) {
        if(alcance.estaEnRangoDelRadio()) {
            if (turno.getCantidad() == 10) {
                this.ESTADO_CONSTRUCCION = true;
            }
        }
    }

    public boolean estaOperativo() {
    }

    public void recibeDanio(int i) {
    }

    public int obtenerEscudo() {
    }

    public int obtenerVida() {
    }
}
