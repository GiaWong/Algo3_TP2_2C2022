package edu.fiuba.algo3.modelo.Partida;

import edu.fiuba.algo3.modelo.Exception.JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Partida {

    private Jugador jugadorUno;
    private Jugador jugadorDos;
    private final Mapa mapa;

    public Partida() {
        mapa = new Mapa(20 ,20);
    }

    public void asignarJugador(Jugador jugador)throws JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno {
        if(jugadorUno==null) {
            jugadorUno = jugador;
        }
        else if(jugadorUno.comparar(jugador)){
            jugadorDos = jugador;
        }
        else{
            throw new JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno();
        }
    }

    public void jugar() {
        while (jugadorUno.tieneConstrucciones(mapa) && jugadorDos.tieneConstrucciones(mapa)) { //Como verifico si un jugador tiene construcciones o no?
            jugadorUno.jugar(mapa);
            jugadorDos.jugar(mapa);
        }

        System.out.println("Juego terminado. Ganador "); //Debería poner que jugador salió ganador.
    }

    public void agregarJugador(String nombre,String color,Raza raza) {
        Jugador jugador = new Jugador(nombre, color, raza);
        asignarJugador(jugador);
    }

    public Jugador primerJugador() {return jugadorUno;
    }
}
