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
        Protoss protoss = new Protoss();
        Mapa mapa = new Mapa(20,20);
        Coordenada coordPilon = new Coordenada(1,2);
        protoss.agregar(new Pilon(0),coordPilon,mapa);
        assertEquals(5,protoss.capacidadActual());
        mapa.destruirConstruccion(coordPilon);
        protoss.pilonDestruido();
        assertEquals(0,protoss.capacidadActual());
    }

    @Test
    public void SeDestruyeUnCriaderoYSeDisminuyeLaCapacidadDeSuministro(){
        Zerg zerg = new Zerg();
        Mapa mapa = new Mapa(20,20);
        Criadero criadero = new Criadero(0);
        Coordenada coordCriadero = new Coordenada(10,10);
        zerg.agregar(criadero,coordCriadero,mapa);
        assertEquals(5,zerg.capacidadActual());
        mapa.destruirConstruccion(coordCriadero);
        zerg.criaderoDestruido();
        assertEquals(0,zerg.capacidadActual());
    }

    @Test
    public void SeDestruyeUnAmoSupremoYSeDisminuyeLaCapacidadDeSuministro(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.agregar(new Criadero(0),new Coordenada(8,8),mapa);
        mapa.avanzarTurno();
        Coordenada coord = new Coordenada(10,10);
        AmoSupremo amo = new AmoSupremo();
        zerg.agregar(amo,coord,mapa);
        assertEquals(10,zerg.capacidadActual());
        mapa.destruirUnidad(coord);
        zerg.amoDestruido();
        assertEquals(5,zerg.capacidadActual());
    }
}
