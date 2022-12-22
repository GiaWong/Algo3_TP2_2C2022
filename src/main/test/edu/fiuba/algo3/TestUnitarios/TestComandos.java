package edu.fiuba.algo3.TestUnitarios;

import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Comandos.CreacionConstrucciones.CreacionPilon;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class TestComandos {
    //Mapa map = mock(Mapa.class);
    Suministro suministro = mock(Suministro.class);
    @Test
    public void testDeCreacionPilonAtravesDeComandos(){
        Raza protoss = new Protoss(suministro);
        Jugador jugador = new Jugador("Matias","azul",protoss);
        Mapa mapa = new Mapa(20,20);

        Coordenada coordenada = new Coordenada(2,2);
        Accion accion = new CreacionPilon(protoss,coordenada,mapa);
        jugador.asignarAccion(accion);
        jugador.ejecutarAccion();
        assertTrue(mapa.hayConstruccion(coordenada));

    }

}
