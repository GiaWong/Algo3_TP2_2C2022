package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class PuertoEstelar extends Construccion {

    private final int tamanio;
    public PuertoEstelar(int tamanio) {
        super();
        this.tamanio = tamanio;
    }

    @Override
    public void empezarAConstruirSegun(Alcance alcance, Turno turno) {
        if(alcance.estaEnRangoDelRadio(this.tamanio)) {
            if (turno.getCantidad() == 10) {
                this.ESTADO_CONSTRUCCION = true;
            }
        }
    }
}
