package edu.fiuba.algo3.modelo.Partida;

import edu.fiuba.algo3.modelo.Exception.JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno;
import edu.fiuba.algo3.modelo.Exception.NombreDeberiaTener6caracteresComoMinimo;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;
import javafx.scene.paint.Color;

public class Partida {

    private Jugador jugadorUno;

    private Jugador jugadorDos;

    private Mapa mapa;

    private Turno turno;

    public Partida() {

        mapa = new Mapa(20,20);
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

        // while jugadorUno.tengaConstrucciones() && jugadorDos.tengaConstrucciones()
            jugadorUno.jugar(turno, mapa);
            jugadorDos.jugar(turno, mapa);


    }

    public void agregarJugador(String nombre,String color,Raza raza) {
        Jugador jugador = new Jugador(nombre, color, raza);
        asignarJugador(jugador);
    }

    public Jugador primerJugador() { return jugadorUno; }
}
