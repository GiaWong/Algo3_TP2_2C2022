package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Exception.HasLlegadAlLimiteDeUnidadesCreadas;
import edu.fiuba.algo3.modelo.Exception.NoTienesSuministroParaCrearMasUnidades;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.AmoSupremo;
import edu.fiuba.algo3.modelo.Unidades.Scout;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class CasoDeUso30Test {

    Coordenada coordenada = mock(Coordenada.class);
    Mapa mapa = mock(Mapa.class);


    @Test
    public void SiSeTienenLaCapacidadMaximaOcupadaNoSePuedeCrearUnaNuevaUnidad(){
        Zerg zerg = new Zerg();
        zerg.aumentarMineral(10000);
        zerg.aumentarGas(10000);

        zerg.agregar(new Criadero(0), new Coordenada(1,2), mapa);
        mapa.avanzarTurno();
        for (int i =0 ;i<39;i++) {
            zerg.agregar(new AmoSupremo(),coordenada,mapa);
        }

        for (int i =0 ;i<200;i++) {
            zerg.agregar(new Zangano(),coordenada,mapa);
        }

        assertThrows( NoTienesSuministroParaCrearMasUnidades.class, ()-> {
            zerg.agregar(new Zangano(),coordenada,mapa) ;
        });

    }


}
