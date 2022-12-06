package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Jugador.Jugador;

import java.time.temporal.JulianFields;

public class TerminarTurno implements  Accion{

    private  Jugador jugador;

    public TerminarTurno(Jugador unJugador){
        jugador = unJugador;
    }

    @Override
    public void ejecutar() {
        jugador.finalizarTurno();
    }
}
