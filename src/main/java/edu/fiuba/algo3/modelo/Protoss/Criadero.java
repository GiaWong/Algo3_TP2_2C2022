package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.IConstruccionZerg;
import edu.fiuba.algo3.modelo.Zerg.Larva;
import edu.fiuba.algo3.modelo.Zerg.Zangano;

public class Criadero implements IConstruccionZerg {
    public void iniciar(Larva larva) {
    }

    public void evolucionar(Zangano zangano) {
    }

    public int obtenerCantidadLarvas() {
        return 0;
    }




    @Override
    public boolean estaDisponible() {
        return false;
    }

    @Override
    public void empezarAConstruirSegun(Turno turno) {

    }


    public void agregarMasLarvasSegun(Turno turno) {
    }
}
