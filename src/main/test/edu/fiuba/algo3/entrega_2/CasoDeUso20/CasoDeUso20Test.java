package edu.fiuba.algo3.entrega_2.CasoDeUso20;

import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Exception.EstaUnidadNoSeMuevePorAreaEspacial;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Scout;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso20Test {

    @Test
    public void UnidadTerrestreNoPuedePasarCasillaEspacial(){
        Mapa mapa= new Mapa(20,20);
        mapa.inicializarConUnaFranjaEspacial();
        Zerling zerling = new Zerling();
        assertThrows( EstaUnidadNoSeMuevePorAreaEspacial.class,()->{mapa.agregar(zerling, new Coordenada(4,1));});

    }
    @Test
    public void UnidadAereaPuedePasarCasillaEspacial(){
        Mapa mapa= new Mapa(20,20);
        mapa.inicializarConUnaFranjaEspacial();
        Scout scout = new Scout();
        mapa.agregar(scout, new Coordenada(4,1));
        assertEquals(true,mapa.hayUnidad(4,1));

    }

    @Test
    public void UnidadTerrestrePuedePasarCasillaTerrestre(){
        Mapa mapa= new Mapa(20,20);
        mapa.inicializarConUnaFranjaEspacial();
        Zerling zerling = new Zerling();
        mapa.agregar(zerling, new Coordenada(1,2));
        assertEquals(true,mapa.hayUnidad(1,2));

    }

    @Test
    public void UnidadAereaPuedePasarCasillaTerrestre(){
        Mapa mapa= new Mapa(20,20);
        mapa.inicializarConUnaFranjaEspacial();
        Scout scout = new Scout();
        mapa.agregar(scout, new Coordenada(1,2));
        assertEquals(true,mapa.hayUnidad(1,2));

    }

}
