package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class  Asimilador extends Construccion {

    private boolean contieneGas = false;
    private Turno turno;
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

    public void prepararCapsulaDeGas(Turno turno) {
        this.turno = turno;
    }

    public int conProduccionGas() {
        return this.turno.getCantidad();
    }
}
