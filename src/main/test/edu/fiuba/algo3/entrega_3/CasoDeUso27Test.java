package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
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
        zerg.agregar(mutalisco,new Coordenada(5,6),mapa);

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
        zerg.aumentarGas(300);
        zerg.aumentarMineral(600);
        Criadero criadero = new Criadero(0);
        zerg.agregar(criadero,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        zerg.agregar(new ReservaProduccion(0),new Coordenada(4,7),mapa);
        zerg.agregar(new Guarida(0),new Coordenada(4,8),mapa);
        zerg.agregar(new Espiral(0),new Coordenada(4,9),mapa);
        Mutalisco mutalisco = new Mutalisco();
        zerg.agregar(mutalisco,new Coordenada(5,6),mapa);

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows(NoHayRecursosSuficientes.class,()-> zerg.evolucionarDevorador(mutalisco,mapa));

    }


    @Test
    public void DevoradorAtacaAUnZealotYNoLeDeberiaHacerDanio(){
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
        zerg.agregar(mutalisco,new Coordenada(5,6),mapa);

        Protoss protoss = new Protoss();
        protoss.aumentarGas(1000);
        protoss.aumentarMineral(1000);
        Pilon pilon = new Pilon(0);
        protoss.agregar(pilon,new Coordenada(15,15),mapa);
        mapa.avanzarTurno();
        protoss.agregar(new Acceso(0),new Coordenada(15,16),mapa);
        Zealot zealot = new Zealot();
        protoss.agregar(zealot,new Coordenada(15,17),mapa);


        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }


        Devorador devorador = zerg.evolucionarDevorador(mutalisco,mapa);

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        devorador.atacar(zealot);
        assertEquals(100,zealot.obtenerEscudo());
    }


    @Test
    public void DevoradorAtacaAUnScoutYLeDeberiaHacerDanio(){
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
        zerg.agregar(mutalisco,new Coordenada(5,6),mapa);

        Protoss protoss = new Protoss();
        protoss.aumentarGas(1000);
        protoss.aumentarMineral(1000);
        Pilon pilon = new Pilon(0);
        protoss.agregar(pilon,new Coordenada(15,15),mapa);
        mapa.avanzarTurno();
        protoss.agregar(new Acceso(0),new Coordenada(15,16),mapa);
        protoss.agregar(new PuertoEstelar(0),new Coordenada(16,16),mapa);
        Scout scout = new Scout();
        protoss.agregar(scout,new Coordenada(15,17),mapa);


        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }


        Devorador devorador = zerg.evolucionarDevorador(mutalisco,mapa);

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        devorador.atacar(scout);
        assertEquals(85,scout.obtenerEscudo());
    }

}
