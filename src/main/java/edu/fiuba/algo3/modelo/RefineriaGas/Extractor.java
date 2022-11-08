package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Turno.Turno;

public class Extractor implements RefineriaGas {

    private boolean ESTADO_CONSTRUCCION = false;


    @Override
    public boolean estaDisponible() {
        return this.ESTADO_CONSTRUCCION;
    }

    @Override
    public void empezarAConstruirSegun(Turno turno) {
        int TIEMPO_CONSTRUCCION = 6;
        if(turno.getCantidad() == TIEMPO_CONSTRUCCION){
            this.ESTADO_CONSTRUCCION = true;
        }

    }
}
