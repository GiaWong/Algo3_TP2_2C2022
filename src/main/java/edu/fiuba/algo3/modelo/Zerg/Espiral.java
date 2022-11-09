package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Espiral extends Construccion {


    public Espiral() {
        costeMineral = 150 ;
        costeGasVespeno = 100;

    }



    @Override
    public void avanzarTurno(int i) {

    }

    @Override
    public void empezarAConstruirSegun(Alcance alcance, Turno turno) {
        if(alcance.estaEnRangoDelRadio()){
            if(turno.getCantidad() == 10){
                this.ESTADO_CONSTRUCCION = true;
            }
        }


    }


}
