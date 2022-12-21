package edu.fiuba.algo3.controlador.partida;

import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Partida.Partida;

public class ControladorPartida {
    private Partida partida;
    public ControladorPartida(Partida partida) {
        this.partida = partida;

    }

    public boolean tieneMismaRaza(Zerg zerg) {
        return this.partida.tieneMismaRaza(zerg);
    }

    public void empezarAJugar() {
        this.partida.jugar();
    }
}
