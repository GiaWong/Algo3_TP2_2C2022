package edu.fiuba.algo3.modelo.Partida;

import edu.fiuba.algo3.modelo.Exception.JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Partida {

    private Jugador jugadorUno;
    private Jugador jugadorDos;

    private Turno turno;

    public void asignarJugador(Jugador jugador)throws JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno {
        if(jugadorUno==null) {
            jugadorUno = jugador;
        }
        else if(!jugadorUno.comparar(jugador)){
            jugadorDos = jugador;
        }
        else{
            throw new JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno();
        }
    }

    private void elejirAlJugadorQueComienzaPrimero(){

        double numeroRandom = Math.random();
        if(numeroRandom<0.5){

            //asignar turno del jugador 1*
            turno = new Turno(jugadorUno);
            System.out.print("\n-Turno del jugador 1\n");

        }else{

            //asignar turno del jugador 2*
            turno = new Turno(jugadorDos);
            System.out.print("\n-Turno del jugador 2\n");
        }

    }

    public void jugar() {
        elejirAlJugadorQueComienzaPrimero();
        while (turno.sigueJugando()) {
            turno.jugar();
            turno.cambiarTurno(jugadorUno, jugadorDos);
        }
        //Jugador jugadorGanador = this.seleccionarJugadorQueGano(jugadorUno, jugadorDos);
        //System.out.println("Juego terminado. Ganador "); //Debería poner que jugador salió ganador.
    }

    private Jugador seleccionarJugadorQueGano(Jugador jugadorUno, Jugador jugadorDos) {
        /*
        if (jugadorUno.tieneConstrucciones(mapa)){
            return jugadorUno;
        }

         */
        return jugadorDos;
    }

    public void agregarJugador(String nombre,String color,Raza raza) {
        Jugador jugador = new Jugador(nombre, color, raza);
        asignarJugador(jugador);
    }

    public Jugador primerJugador() { return jugadorUno; }
    public Jugador segundoJugador() { return jugadorDos; }

    public boolean tieneMismaRaza(Zerg zerg) {
        return turno.tieneMismaRaza(zerg);
    }
}
