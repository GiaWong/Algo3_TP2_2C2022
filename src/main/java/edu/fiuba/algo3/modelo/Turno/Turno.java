package edu.fiuba.algo3.modelo.Turno;


public class Turno {

    private boolean estaJugando = false;

    public void jugar(){
        estaJugando = true;
    }

    public void dejarDeJugar() {
        estaJugando = false;
    }

    public boolean sigueJugando(){ return estaJugando; }

}
