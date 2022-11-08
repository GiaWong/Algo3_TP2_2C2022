package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.IConstruccionZerg;
import edu.fiuba.algo3.modelo.Zerg.Larva;
import edu.fiuba.algo3.modelo.Zerg.Zangano;

public class Criadero implements IConstruccionZerg {
    private Larva larva;
    private Zangano zangano;


    public void iniciar(Larva larva) {
        this.larva = larva;
    }

    public void evolucionar(Zangano zangano) {
        this.zangano = zangano;
        this.larva.restarCantidadLarva(this.zangano.getCantidad());
    }

    public int obtenerCantidadLarvas() {
        return this.larva.getCantidad();
    }




    @Override
    public boolean estaDisponible() {
        return false;
    }

    @Override
    public void empezarAConstruirSegun(Turno turno) {

    }


    public void agregarMasLarvasSegun(Turno turno) {

        this.larva.agreegarMasLarvas(turno.getCantidad());
    }
}
