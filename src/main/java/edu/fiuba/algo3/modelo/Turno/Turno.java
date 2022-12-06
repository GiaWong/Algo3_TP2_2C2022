package edu.fiuba.algo3.modelo.Turno;


public class Turno {
    private int turnos = 0;
    private boolean estaJugando = false;

    public void aumentarTurno(){
        turnos += 1;
    }

    public void jugar(){
        estaJugando = true;
    }

    public void dejarDeJugar() {
        estaJugando = false;
    }

    public boolean sigueJugando(){ return estaJugando; }

}
