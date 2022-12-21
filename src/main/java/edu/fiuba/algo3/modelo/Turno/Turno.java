package edu.fiuba.algo3.modelo.Turno;


import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Partida.Partida;

public class Turno {

    //private Partida partida;

    private Mapa mapa;
    private Jugador jugador;
    //private boolean estaJugando = false;

    public Turno(Jugador unJugador) {
        this.jugador = unJugador;
        this.mapa = new Mapa(20,20);
    }

    /*
    public Turno(Partida partida) {
        this.partida = partida;
    }

     */


    public void cambiarTurno(Jugador unJugador, Jugador otroJugador){

        if(jugador.comparar(unJugador)){
            this.jugador = unJugador;
            System.out.print("\n=>Turno del jugador 2");
        }

        if(jugador.comparar(otroJugador)){
            this.jugador = otroJugador;
            System.out.print("\n=>Turno del jugador 1");
        }
    }

    public void jugar(){
        jugador.jugar(mapa);
    }

    public boolean esDeRaza(Zerg zerg) {
        //return this.jugador.tieneMismaRaza(zerg);
        return false;
    }

    /*
    public void jugar(){
        estaJugando = true;
    }
     */

    public void dejarDeJugar() {

        //estaJugando = false;
    }

    //public boolean sigueJugando(){ return estaJugando; }

    public boolean sigueJugando(){
        return false;
    }

}
