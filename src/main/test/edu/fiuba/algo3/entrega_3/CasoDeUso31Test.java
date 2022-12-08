package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.AmoSupremo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso31Test {

    @Test
    public void SeDestruyeUnPilonYSeDisminuyeLaCapacidadDeSuministro(){
        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon(0);
        Coordenada coord = new Coordenada(10,10);
        Protoss protoss = new Protoss();
        mapa.agregar(pilon,coord);
        protoss.comprar(pilon);
        assertEquals(5,protoss.capacidadActual());
        mapa.destruirConstruccion(coord);
        protoss.pilonDestruido();
        assertEquals(0,protoss.capacidadActual());
    }

    @Test
    public void SeDestruyeUnCriaderoYSeDisminuyeLaCapacidadDeSuministro(){
        Mapa mapa = new Mapa(20,20);
        Criadero criadero = new Criadero(0);
        Coordenada coord = new Coordenada(10,10);
        Zerg zerg = new Zerg();
        mapa.agregar(criadero,coord);
        zerg.comprar(criadero);
        assertEquals(5,zerg.capacidadActual());
        mapa.destruirConstruccion(coord);
        zerg.criaderoDestruido();
        assertEquals(0,zerg.capacidadActual());
    }

    @Test
    public void SeDestruyeUnAmoSupremoYSeDisminuyeLaCapacidadDeSuministro(){
        Mapa mapa = new Mapa(20,20);
        Coordenada coord = new Coordenada(10,10);
        AmoSupremo amo = new AmoSupremo();
        Zerg zerg = new Zerg();
        mapa.agregar(amo,coord);
        zerg.comprar(amo);
        assertEquals(5,zerg.capacidadActual());
        mapa.destruirUnidad(coord);
        zerg.amoDestruido();
        assertEquals(0,zerg.capacidadActual());
    }
}
