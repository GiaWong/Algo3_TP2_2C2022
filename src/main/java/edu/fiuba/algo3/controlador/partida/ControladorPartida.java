package edu.fiuba.algo3.controlador.partida;

import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Partida.Partida;

public class ControladorPartida {
    private final Partida partida;
    public ControladorPartida(Partida partida) {
        this.partida = partida;

    }

    public boolean tieneMismaRaza(Zerg zerg) {
        return partida.tieneMismaRaza(zerg);
    }

    public void empezarAJugar() {
        //this.partida.jugar();

        /*
         * Ahora partida puede controlar como juegan los jugadores...
         * Y tambien cuando se pasa el turno y demás.
         *
         * No estoy seguro si es necesario este método de "empezar a jugar"
         * dado que la partida no se empieza a jugar, sino que el controlador de
         * partida controla el juego y las acciones de los jugadores.
         *
         */
    }
}
