package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CasoDeUso29 {
    BancoDeRecursos banco = mock(BancoDeRecursos.class);
    Coordenada coordenada = mock(Coordenada.class);
    Mapa mapa = mock(Mapa.class);
    @Test
    public void testLaCapacidadActualLlegaA160Con40Scouts() {
        Protoss protoss = new Protoss(banco);
        for (int i =0 ;i<40;i++) {
            protoss.agregar(new Scout(),coordenada,mapa);
        }

        assertEquals(160,protoss.capacidadActual());
    }

    @Test
    public void testLaCapacidadTotalLlegaA400Con40Amos() {
        Zerg zerg = new Zerg(banco);
        for (int i =0 ;i<40;i++) {
            zerg.agregar(new AmoSupremo(),coordenada,mapa);
        }

        assertEquals(400,zerg.capacidadTotal());
    }

    @Test
    public void testLaCapacidadTotalLlegaA200Con40Pilones() {
        Protoss protoss = new Protoss(banco);

        for (int i =0 ;i<40;i++) {
            protoss.agregar(new Pilon(),coordenada,mapa);
        }

        assertEquals(200,protoss.capacidadTotal());
    }

    @Test
    public void testLaCapacidadActualLlegaA40Con40Dragones() {
        Zerg zerg = new Zerg(banco);
        for (int i =0 ;i<40;i++) {
            zerg.agregar(new Zerling(),coordenada,mapa);
        }

        assertEquals(40,zerg.capacidadActual());
    }

}

