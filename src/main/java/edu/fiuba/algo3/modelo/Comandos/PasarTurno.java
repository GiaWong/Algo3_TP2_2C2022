package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Partida.Partida;

public class PasarTurno implements Accion{

    private final Partida partida;

    public PasarTurno(Partida unaPartida){
        partida = unaPartida;
    }

    @Override
    public void ejecutar() {
        partida.pasarTurno();
    }
}
