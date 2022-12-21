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

    public void cambiarTurno(Jugador jugadorUno, Jugador jugadorDos){

        if(jugador.esIgualA(jugadorDos)){
            this.jugador = jugadorUno;
            System.out.print("\n=>Turno del jugador 1");

        } else {

            this.jugador = jugadorDos;
            System.out.print("\n=>Turno del jugador 2");
        }
    }

    public void jugar(){
        jugador.elegirAccion();
        jugador.ejecutarAccion();
        while (jugador.sigueJugando()){
            jugador.elegirAccion();
            jugador.ejecutarAccion();
        }
        mapa.avanzarTurno();
    }

    public boolean sigueJugando(){
        return jugador.tieneConstrucciones(mapa);
    }

    public boolean tieneMismaRaza(Zerg zerg) {
        return jugador.tieneMismaRaza(zerg);
    }

    public Jugador seleccionarJugadorQueGano(Jugador jugadorUno, Jugador jugadorDos) {
        /*
        El jugador que termina quedando en esta clase Turno, es el jugador que perdio.
        Por lo tanto tiene que devolver el jugador contrario.
         */
        if (jugador.esIgualA(jugadorUno)){
            return jugadorDos;
        }
        return jugadorUno;
    }

}
