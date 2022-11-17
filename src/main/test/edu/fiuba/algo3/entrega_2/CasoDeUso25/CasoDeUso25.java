package edu.fiuba.algo3.entrega_2.CasoDeUso25;

import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Partida.Partida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso25 {

    @Test
    public void ChequearInicializacionDeUnJugador(){
        Partida partida = new Partida();
        Zerg raza = new Zerg();
        partida.agregarJugador("Matias","Azul",raza);



        assertEquals(partida.primerJugador().obtenernombre(),"Matias");
        assertEquals(partida.primerJugador().obtenercolor(),"Azul");
        assertEquals(partida.primerJugador().obtenerraza(),raza.getClass());

    }
}
