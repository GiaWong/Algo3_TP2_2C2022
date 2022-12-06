package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso31Test {

    @Test
    public void SeDestruyeUnPilonYSeDisminuyeLaCapacidadDeSuministro(){

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

    }
}
