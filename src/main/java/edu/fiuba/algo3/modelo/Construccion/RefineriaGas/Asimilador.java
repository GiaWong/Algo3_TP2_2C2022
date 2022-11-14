package edu.fiuba.algo3.modelo.Construccion.RefineriaGas;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class  Asimilador implements RefineriaGas {

    private boolean tieneGas = false;
    private int cantidadGas=0;

    public Asimilador(GasVespeno gasVespeno) {
        this.tieneGas = true;
        costeMineral = 100 ;
        costeGasVespeno = 0;
    }

    public Asimilador() {
        costeMineral = 50 ;
        costeGasVespeno = 0;

    }


    public boolean contieneGas() {

        return this.tieneGas;
    }

    public void prepararCapsulaDeGas(Turno turno) {
        if(turno.getCantidad() != 0){
            int GAS_FIJO = 20;
            this.cantidadGas = turno.getCantidad() * GAS_FIJO;
        }

    }

    public int conProduccionGas() {
        return this.cantidadGas;
    }

    @Override
    public void avanzarTurno(int i) {
        if (i == 6) {
            this.ESTADO_CONSTRUCCION = true;
        }
    }

    @Override
    public void empezarAConstruirSegun(Alcance alcance, Turno turno) {
        if(alcance.estaEnRangoDelRadio()) {
            if (turno.getCantidad() == 6) {
                this.ESTADO_CONSTRUCCION = true;
            }
        }
    }
}