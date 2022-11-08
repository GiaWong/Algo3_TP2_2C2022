package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Criadero extends Construccion {
    /*private boolean ESTADO_CONSTRUCCION = false;*/
    private Larva larva;


    public void iniciar(Larva larva) {
        this.larva = larva;
    }

    public void evolucionar(Zangano zangano) {
        this.larva.restarCantidadLarva(zangano.getCantidad());
    }

    public int obtenerCantidadLarvas() {
        return this.larva.getCantidad();
    }


    @Override
    public void empezarAConstruirSegun(Turno turno) {
        if(turno.getCantidad() == 4){
            this.ESTADO_CONSTRUCCION = true;
        }
    }


    public void agregarMasLarvasSegun(Turno turno) {

        this.larva.agreegarMasLarvas(turno.getCantidad());
    }
}
