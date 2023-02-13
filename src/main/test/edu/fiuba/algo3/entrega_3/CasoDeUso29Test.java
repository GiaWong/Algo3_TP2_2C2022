package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CasoDeUso29Test {
    Coordenada coordenada = mock(Coordenada.class);
    Mapa mapa = mock(Mapa.class);


    @Test
    public void LaCapacidadLlegaA200Con40AmosSupremos() {
        Zerg zerg = new Zerg();
        zerg.aumentarMineral(10000);
        zerg.aumentarGas(10000);

        for (int i =0 ;i<40;i++) {
            zerg.agregar(new AmoSupremo(),coordenada,mapa);
        }

        assertEquals(200,zerg.capacidadActual());
    }

    @Test
    public void LaCapacidadNoAumentaMasAllaDe200Agregando41Amos() {
        Zerg zerg = new Zerg();
        zerg.aumentarMineral(10000);
        zerg.aumentarGas(10000);

        for (int i =0 ;i<41;i++) {
            zerg.agregar(new AmoSupremo(),coordenada,mapa);
        }

        assertEquals(200,zerg.capacidadActual());
    }

    @Test
    public void LaCapacidadLlegaA200Con40Pilones() {
        Protoss protoss = new Protoss();
        protoss.aumentarMineral(10000);
        protoss.aumentarGas(10000);

        for (int i =0 ;i<40;i++) {
            protoss.agregar(new Pilon(),coordenada,mapa);
        }

        assertEquals(200,protoss.capacidadActual());

    }

    @Test
    public void LaCapacidadNoAumentaMasAllaDe200Agregando41Pilones() {
        Protoss protoss = new Protoss();
        protoss.aumentarMineral(10000);
        protoss.aumentarGas(10000);

        for (int i =0 ;i<41;i++) {
            protoss.agregar(new Pilon(),coordenada,mapa);
        }

        assertEquals(200,protoss.capacidadActual());

    }


}

