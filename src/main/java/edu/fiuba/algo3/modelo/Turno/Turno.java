package edu.fiuba.algo3.modelo.Turno;

import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class Turno {

    private final Mapa mapa;
    private Jugador jugador;

    public Turno(Jugador unJugador) {
        this.jugador = unJugador;
        this.mapa = new Mapa(20,20);
    }

    public void cambiarTurno(Jugador unJugador, Jugador otroJugador){

        if(!jugador.comparar(unJugador)){
            this.jugador = unJugador;
            System.out.print("\n=>Turno del jugador 1");
        }

        if(!jugador.comparar(otroJugador)){
            this.jugador = otroJugador;
            System.out.print("\n=>Turno del jugador 2");
        }
    }

    public void jugar(){
        jugador.jugar(mapa);
    }

    public boolean sigueJugando(){ //Verificar si el jugador tiene construcciones activas
        return jugador.tieneConstrucciones(mapa);
    }

    public boolean tieneMismaRaza(Zerg zerg) {
        return jugador.tieneMismaRaza(zerg);
    }
}
