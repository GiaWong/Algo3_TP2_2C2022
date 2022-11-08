package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Turno.Turno;

public class Criadero implements ConstruccionZerg {
    private boolean ESTADO_CONSTRUCCION = false;
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
    public boolean estaDisponible() {
        return this.ESTADO_CONSTRUCCION;
    }

    @Override
    public void empezarAConstruirSegun(Turno turno) {
        int TIEMPO_CONSTRUCCION = 4;
        if(turno.getCantidad() == TIEMPO_CONSTRUCCION){
            this.ESTADO_CONSTRUCCION = true;
        }
    }


    public void agregarMasLarvasSegun(Turno turno) {

        this.larva.agreegarMasLarvas(turno.getCantidad());
    }
}
