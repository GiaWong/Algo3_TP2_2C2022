package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Extractor extends Construccion{

    private boolean contieneGas = false;
    @Override
    public void empezarAConstruirSegun(Turno turno) {
        if(turno.getCantidad() == 6){
            this.ESTADO_CONSTRUCCION = true;
        }

    }
    public void conGasVespeno(GasVespeno gasVespeno) {
        this.contieneGas = true;
    }

    public boolean contieneGas() {
        return this.contieneGas;
    }
}
