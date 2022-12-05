package edu.fiuba.algo3.TestUnitarios;

import edu.fiuba.algo3.modelo.Comandos.Acciones;
import edu.fiuba.algo3.modelo.Comandos.CreacionPilon;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class TestComandos {
    //Mapa map = mock(Mapa.class);
    Suministro suministro = mock(Suministro.class);
    @Test
    public void testDeCreacionPilonAtravesDeComandos(){
        Raza protoss = new Protoss(suministro);
        Jugador jugador1 = new Jugador("Matias","azul",protoss);
        Mapa mapa = new Mapa(20,20);

        Coordenada coordenada =new Coordenada(2,2);
        Acciones accion = new CreacionPilon(protoss,coordenada,mapa);
        jugador1.asignarComando(accion);
        jugador1.ejecutarComando();
        Assertions.assertEquals(true,mapa.hayConstruccion(coordenada));

    }

}
