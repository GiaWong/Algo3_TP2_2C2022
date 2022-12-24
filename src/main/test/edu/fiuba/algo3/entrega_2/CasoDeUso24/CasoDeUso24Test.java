package edu.fiuba.algo3.entrega_2.CasoDeUso24;

import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class CasoDeUso24Test {

    Mapa mapa = new Mapa(20,20);
    Coordenada coordenadaBaseJugadorUno = new Coordenada(5,5);
    Coordenada coordenadaBaseJugadorDos = new Coordenada(17,17);

    @Test
    public void LosJugadoresEmpiezanEnBasesEnExtremosDeMapa(){
        mapa.inicializarMapaConDosBases();
        assertTrue(mapa.hayConstruccion(coordenadaBaseJugadorUno));
        assertTrue(mapa.hayConstruccion(coordenadaBaseJugadorDos));
        /*
        Mapa mapa = new Mapa(20,20);
        mapa.inicializarMapa2ConBases();  //    SEGURAMENTE NECESITE MOCK OBJECTS!!
        assertEquals(true,mapa.hayConstruccion(5,5));
        assertEquals(true,mapa.hayConstruccion(17,17));

         */
    }
}
