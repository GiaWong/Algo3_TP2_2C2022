package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Exception.UnidadNoTargeteable;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.AmoSupremo;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CasoDeUso28Test {

    @Test
    public void  NoSepuedeAtacarAlZelotCuandoEstaInvisible(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        zerg.agregar(new Criadero(0), new Coordenada(1,1), mapa);
        zerg.agregar(new Criadero(0), new Coordenada(0,1), mapa);
        mapa.avanzarTurno();
        zerg.agregar(new ReservaProduccion(0), new Coordenada(1,2), mapa);
        Zerling zerling = new Zerling();
        Zerling zerling1 = new Zerling();
        Zerling zerling2 = new Zerling();
        Zerling zerling3 = new Zerling();
        zerg.agregar(zerling, new Coordenada(1,3),mapa);
        zerg.agregar(zerling1, new Coordenada(1,4),mapa);
        zerg.agregar(zerling2, new Coordenada(1,5),mapa);
        zerg.agregar(zerling3, new Coordenada(1,6),mapa);

        Protoss protoss = new Protoss();
        protoss.aumentarGas(1000);
        protoss.aumentarMineral(1000);
        protoss.agregar(new Pilon(0), new Coordenada(15,15), mapa);
        mapa.avanzarTurno();
        protoss.agregar(new Acceso(0), new Coordenada(15,17), mapa);
        Zealot zealot = new Zealot();
        protoss.agregar(zealot, new Coordenada(15,18), mapa);
        for(int i = 0 ; i <= 15 ; i++) {
            mapa.avanzarTurno();
        }
        for(int i=0 ; i<=4 ; i++) {
            zealot.atacar(zerling);
            zealot.atacar(zerling1);
            zealot.atacar(zerling2);
        }
        assertThrows(UnidadNoTargeteable.class,()->zerling3.atacar(zealot));

    }


    @Test

    public void  SepuedeAtacarAlZelotCuandoEstaInvisiblePeroHayUnAmoSupremoEnRango(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        zerg.agregar(new Criadero(0), new Coordenada(1,1), mapa);
        zerg.agregar(new Criadero(0), new Coordenada(0,1), mapa);
        mapa.avanzarTurno();
        zerg.agregar(new ReservaProduccion(0), new Coordenada(1,2), mapa);
        Zerling zerling = new Zerling();
        Zerling zerling1 = new Zerling();
        Zerling zerling2 = new Zerling();
        Zerling zerling3 = new Zerling();
        zerg.agregar(zerling, new Coordenada(1,3),mapa);
        zerg.agregar(zerling1, new Coordenada(1,4),mapa);
        zerg.agregar(zerling2, new Coordenada(1,5),mapa);
        zerg.agregar(zerling3, new Coordenada(1,6),mapa);

        Protoss protoss = new Protoss();
        protoss.aumentarGas(1000);
        protoss.aumentarMineral(1000);
        protoss.agregar(new Pilon(0), new Coordenada(15,15), mapa);
        mapa.avanzarTurno();
        protoss.agregar(new Acceso(0), new Coordenada(15,17), mapa);
        Zealot zealot = new Zealot();
        protoss.agregar(zealot, new Coordenada(15,18), mapa);


        for(int i = 0 ; i <= 15 ; i++) {
            mapa.avanzarTurno();
        }
        for(int i=0 ; i<=4 ; i++) {
            zealot.atacar(zerling);
            zealot.atacar(zerling1);
            zealot.atacar(zerling2);
        }

        AmoSupremo amo = new AmoSupremo();
        zerg.agregar(amo, new Coordenada(15,19),mapa);

        assertDoesNotThrow(() -> {
            zerling3.atacar(zealot);
        });

    }





}
