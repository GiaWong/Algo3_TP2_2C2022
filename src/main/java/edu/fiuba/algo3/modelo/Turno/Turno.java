package edu.fiuba.algo3.modelo.Turno;


import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Partida.Partida;

public class Turno {

    private Partida partida;
    private Jugador jugador;
    private boolean estaJugando = false;

    public Turno(Partida partida) {
        this.partida = partida;
    }

    /**
     * Se elije al azar el que comienza primero (jugador 1 o jugador 2) y
     * luego siga, ej: Si selecciono aleatoriamente que comienza el jugador numero 2,
     * luego dice que continué el jugador numero 1,luego el 2 y así hasta acabar el juego.
     * */
    public void elejirAlJugadorQueComienzaPrimero(){

        double numeroRandom = Math.random();
        if(numeroRandom<0.5){

            //asignar turno del jugador 1*
            this.jugador = this.partida.primerJugador();
            System.out.print("\n-Turno del jugador 1\n");

        }else{

            //asignar turno del jugador 2*
            this.jugador = this.partida.segundoJugador();
            System.out.print("\n-Turno del jugador 2\n");
        }

    }

    /**
     * Usar este método cada vez que termina un turno de un jugador
     * */
    public void cambiarTurno(){

        if(this.jugador==this.partida.primerJugador()){
            this.jugador= this.partida.segundoJugador();
            System.out.print("\n=>Turno del jugador 2");
        }

        if(this.jugador==this.partida.segundoJugador()){
            this.jugador= this.partida.primerJugador();
            System.out.print("\n=>Turno del jugador 1");
        }
    }

    public boolean esDeRaza(Zerg zerg) {
        return this.jugador.tieneMismaRaza(zerg);
    }

    /*
    public void jugar(){
        estaJugando = true;
    }
     */

    public void jugar(){
        //jugador.jugar();
        this.cambiarTurno();
    }

    public void dejarDeJugar() {

        estaJugando = false;
    }

    public boolean sigueJugando(){ return estaJugando; }


}
