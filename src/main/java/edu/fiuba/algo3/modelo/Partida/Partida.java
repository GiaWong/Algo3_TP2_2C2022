package edu.fiuba.algo3.modelo.Partida;

import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Exception.FinDelJuego;
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

    public Partida(Mapa mapa){
        //elejirAlJugadorQueComienzaPrimero(mapa);
    }

    public Partida(Mapa mapa, Jugador unJugador, Jugador otroJugador){
        //elejirAlJugadorQueComienzaPrimero(mapa);
        asignarJugador(unJugador);
        asignarJugador(otroJugador);
        this.turno = new Turno(jugadorUno, mapa);
    }

    private void elejirAlJugadorQueComienzaPrimero(Mapa mapa){

        double numeroRandom = Math.random();
        if(numeroRandom<0.5){

            //asignar turno del jugador 1*
            turno = new Turno(jugadorUno, mapa);
            System.out.print("\n-Turno del jugador 1\n");

        }else{

            //asignar turno del jugador 2*
            turno = new Turno(jugadorDos, mapa);
            System.out.print("\n-Turno del jugador 2\n");
        }

    }

    public void asignarJugador(Jugador jugador) throws JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno {
        if(jugadorUno==null) {
            jugadorUno = jugador;

        } else if (!jugadorUno.esIgualA(jugador)){
            jugadorDos = jugador;

        } else {
            throw new JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno();
        }
    }

    public void ejecutarAccionDeJugador() {
        turno.ejecutarAccion();
    }

    public void agregarJugador(String nombre,String color,Raza raza) {
        Jugador jugador = new Jugador(nombre, color, raza);
        asignarJugador(jugador);
    }

    public Jugador primerJugador() { return jugadorUno; }

    public boolean tieneMismaRaza(Zerg zerg) {
        return turno.tieneMismaRaza(zerg);
    }

    public void pasarTurno(){
        turno.avanzarTurno(); //Esto avanza el turno de todas las cosas que hay dentro del mapa.
        turno.cambiarTurno(jugadorUno, jugadorDos); //Esto cambia el turno al jugador que le toque.
    }

    public void verificarFinDelJuego(){
        /*
         * Si el jugador del turno no tiene más construcciones, el juego termino.
         */
        if(turno.finDelJuego()){
            throw new FinDelJuego();
        }
    }

    public Jugador obtenerJugadorGanador(){
        try{
            verificarFinDelJuego();

        } catch (FinDelJuego e){
            return turno.seleccionarJugadorQueGano(jugadorUno, jugadorDos);
        }
        return null;
    }

    public void asignarAccionAlJugador(Accion accion){
        turno.asignarAccion(accion);
    }

    /*
    public void jugar() {
        elejirAlJugadorQueComienzaPrimero();

        while (turno.sigueJugando()) {
            turno.jugar();
            turno.cambiarTurno(jugadorUno, jugadorDos);
        }
        Jugador jugadorGanador = turno.seleccionarJugadorQueGano(jugadorUno, jugadorDos);
        System.out.println("Juego terminado. Ganador "); //Debería poner que jugador salió ganador.
    }
    */
}
