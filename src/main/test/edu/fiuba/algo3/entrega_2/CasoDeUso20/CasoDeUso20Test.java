package edu.fiuba.algo3.entrega_2.CasoDeUso20;

import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Scout;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso20Test {

    @Test
    public void UnidadTerrestreNoPuedePasarCasillaEspacial(){
        Mapa mapa= new Mapa();
        mapa.inicializarConUnaFranjaEspacial();
        Zerling zerling = new Zerling();
        mapa.agregar(zerling,4,1);
        assertEquals(false,mapa.hayUnidad(4,1));

    }
    @Test
    public void UnidadAereaPuedePasarCasillaEspacial(){
        Mapa mapa= new Mapa();
        mapa.inicializarConUnaFranjaEspacial();
        Scout scout = new Scout();
        mapa.agregar(scout,4,1);
        assertEquals(true,mapa.hayUnidad(4,1));

    }

    @Test
    public void UnidadTerrestrePuedePasarCasillaTerrestre(){
        Mapa mapa= new Mapa();
        mapa.inicializarConUnaFranjaEspacial();
        Zerling zerling = new Zerling();
        mapa.agregar(zerling,1,2);
        assertEquals(true,mapa.hayUnidad(1,2));

    }

    @Test
    public void UnidadAereaPuedePasarCasillaTerrestre(){
        Mapa mapa= new Mapa();
        mapa.inicializarConUnaFranjaEspacial();
        Scout scout = new Scout();
        mapa.agregar(scout,1,2);
        assertEquals(true,mapa.hayUnidad(1,2));

    }

}
