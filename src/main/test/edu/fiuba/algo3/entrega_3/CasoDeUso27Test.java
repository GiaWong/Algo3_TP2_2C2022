package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Construccion.Guarida;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class CasoDeUso27Test {
    BancoDeRecursos banco = mock(BancoDeRecursos.class);
    @Test
    public void MutaliscoPuedeEvolucionarADevoradorAlHaberRecursosSuficientes(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Criadero criadero = new Criadero(0);
        zerg.agregar(criadero,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        zerg.agregar(new ReservaProduccion(0),new Coordenada(4,7),mapa);
        zerg.agregar(new Guarida(0),new Coordenada(4,8),mapa);
        zerg.agregar(new Espiral(0),new Coordenada(4,9),mapa);
        Mutalisco mutalisco = new Mutalisco();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertDoesNotThrow(() -> {
            zerg.evolucionarDevorador(mutalisco,mapa);
        });
    }

    @Test
    public void MutaliscoNoPuedeEvolucionarADevoradorAlNoHaberRecursosSuficientes(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Criadero criadero = new Criadero(0);
        zerg.agregar(criadero,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        zerg.agregar(new ReservaProduccion(0),new Coordenada(4,7),mapa);
        zerg.agregar(new Guarida(0),new Coordenada(4,8),mapa);
        zerg.agregar(new Espiral(0),new Coordenada(4,9),mapa);
        Mutalisco mutalisco = new Mutalisco();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows(NoHayRecursosSuficientes.class,()-> zerg.evolucionarDevorador(mutalisco,mapa));

    }

    /*
    @Test
    public void testUnDevoradorAtacaAUnZealotYNoLeDeberiaHacerDanio(){
        Mutalisco mutalisco = new Mutalisco();
        Unidad devorador = mutalisco.evolucionarDevorador(banco);
        Zealot zealot = new Zealot();
        devorador.atacar(mutalisco);
        assertEquals(100,zealot.obtenerEscudo());
    }

    @Test
    public void testUnDevoradorAtacaAUnScoutLeDeberiaHacerDanio(){
        Mutalisco mutalisco = new Mutalisco();
        Unidad devorador = mutalisco.evolucionarDevorador(banco);
        Scout scout = new Scout();
        devorador.atacar(scout);
        assertEquals(85,scout.obtenerEscudo());
    }

     */
}
