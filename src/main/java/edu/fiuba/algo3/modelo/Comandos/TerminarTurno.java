package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Jugador.Jugador;

public class TerminarTurno implements  Accion{

    private final Jugador jugador;

    public TerminarTurno(Jugador unJugador){
        jugador = unJugador;
    }

    @Override
    public void ejecutar() {
        jugador.finalizarTurno();
    }
}
