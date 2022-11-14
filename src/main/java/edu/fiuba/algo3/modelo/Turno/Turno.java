package edu.fiuba.algo3.modelo.Turno;

import edu.fiuba.algo3.modelo.Jugador.Jugador;

public class Turno {
    private int cantidad;
    public Turno(int cantidad) {
        this.cantidad = cantidad;
    }

    public void avanzarTurno(Jugador jugador){
        jugador.avanzarturno();
    }

    public void jugar(Jugador jugador){
        jugador.jugar();
    }

    public int getCantidad (){
        return this.cantidad;
    }
}
