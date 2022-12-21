package edu.fiuba.algo3.controlador.turnos;

import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Partida.Partida;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class ControladorTurnos {

    private Turno turno;
    public ControladorTurnos(Partida partida) {

        //this.turno = new Turno(partida);
    }

    /**
     * Este método lo uso en la clase PantallaMapa
     * */
    public boolean esDeRaza(Zerg zerg) {

        //turno.elejirAlJugadorQueComienzaPrimero();
        return this.turno.esDeRaza(zerg);

    }
    
}
