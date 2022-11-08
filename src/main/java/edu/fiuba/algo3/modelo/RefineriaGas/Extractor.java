package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.Zangano;

public class Extractor extends Construccion{

    private boolean contieneGas = false;

    private Zangano zangano;
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

    public void producirGas(Zangano zangano, Turno turno) {
        this.zangano = zangano;
    }
    public int conProduccionDeGas() {
        return  this.zangano.getCantidad();
    }
}
