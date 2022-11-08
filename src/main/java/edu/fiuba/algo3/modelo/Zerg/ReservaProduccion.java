package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class ReservaProduccion extends Construccion {

    private final int tamanio;
    public ReservaProduccion(int tamanio) {
        super();
        this.tamanio = tamanio;
    }

    @Override
    public void empezarAConstruirSegun(Alcance alcance, Turno turno) {
        if(alcance.estaEnRangoDelRadio(this.tamanio)){
            if(turno.getCantidad() == 12){
                this.ESTADO_CONSTRUCCION = true;
            }

        }

    }

}
