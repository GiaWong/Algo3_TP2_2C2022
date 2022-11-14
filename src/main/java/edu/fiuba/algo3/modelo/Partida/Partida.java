package edu.fiuba.algo3.modelo.Partida;

import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Partida {

    private Jugador jugadorUno;

    private Jugador jugadorDos;

    private Mapa mapa;

    private Turno turno;

    public Partida() {
        mapa = new Mapa();
    }

    public void asignarNombresAJugadores(String nombreUno, String nombreDos) {
        jugadorUno.setNombre(nombreUno);
        jugadorDos.setNombre(nombreDos);
    }

    public void asignarColorAJugadores(String colorUno, String colorDos) {
        jugadorUno.setColor(colorUno);
        jugadorDos.setColor(colorDos);
    }

    public void asignarRazaAJugadores(Raza unaRaza, Raza otraRaza) {
        jugadorUno.setRaza(unaRaza);
        jugadorDos.setRaza(otraRaza);
    }

    public void jugar() {

    }
}
