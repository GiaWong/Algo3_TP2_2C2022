package edu.fiuba.algo3.entrega_2.CasoDeUso19;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CasoDeUso19Test {

    //Mapa y coordenadas
    Mapa mapa = new Mapa(20,20);
    Coordenada coordCriadero = new Coordenada(2,2);
    Coordenada coordReserva = new Coordenada(3,2);
    Coordenada coordGuarida = new Coordenada(2,3);
    Coordenada coordEspiral = new Coordenada(3,3);

    Coordenada coordPilon = new Coordenada(18,18);
    Coordenada coordAcceso = new Coordenada(19,18);
    Coordenada coordPuerto = new Coordenada(18,19);

    //Construcciones usadas
    Construccion criadero = mock(Criadero.class);
    Construccion reserva = mock(ReservaProduccion.class);
    Construccion guarida = mock(Guarida.class);
    Construccion espiral = mock(Espiral.class);

    Construccion pilon = mock(Pilon.class);
    Construccion acceso = mock(Acceso.class);
    Construccion puerto = mock(PuertoEstelar.class);

    //Unidades usadas
    UnidadZerg zerling = mock(Zerling.class);
    UnidadZerg muta = mock(Mutalisco.class);
    UnidadZerg hidralisco = mock(Hidralisco.class);
    UnidadProtoss scout = mock(Scout.class);

    @Test
    public void zerlingAtacaUnScoutYNoDeberiaHacerleDanio(){ //Esto es para checkear lo de los AtaqueAire y AtaqueTierra
        Coordenada coordAtacada = new Coordenada(11,10);

        //Creo primero un criadero y un pilon
        mapa.agregar(criadero, coordCriadero);
        mapa.agregar(pilon, coordPilon);
        for(int i = 0; i < 8; i++){
            mapa.avanzarTurno();
        }

        //Luego creo las demas construcciones para poder hacer las unidades que quiero
        mapa.agregar(reserva, coordReserva);
        mapa.agregar(acceso, coordAcceso);
        mapa.agregar(puerto, coordPuerto);
        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }

        //Cuando se agrega un zerling le saca una larva al criadero
        mapa.agregar(zerling,new Coordenada(10,10)); //Me tira error, me dice que no se cumple el prerequisito de la Reserva...??
        mapa.agregar(scout,coordAtacada);
        //Se avanzan los turnos para que las unidades puedan estar disponibles
        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(zerling,coordAtacada);

        assertEquals(100,scout.escudo());
    }

    @Test
    public void mutaAtacaUnZerlingYDeberiaHacerleDanio(){ //Supuesto: Se puede hacer daño amigo, es decir a la propia raza
        Coordenada coordAtacada = new Coordenada(10,10);

        //Creo primero un criadero, luego una reserva, porque es el prerequisito de la Guarida
        //Luego creo la Guarida, que es el prerequisito del Espiral
        //Y finalmente creo el Espiral, que es prerequisito del Mutalisco
        while(criadero.estaDisponible() && reserva.estaDisponible() && guarida.estaDisponible() && espiral.estaDisponible()){
            criadero.avanzarTurno(mapa);
            reserva.avanzarTurno(mapa);
            guarida.avanzarTurno(mapa);
            espiral.avanzarTurno(mapa);
        }
        mapa.agregar(criadero, coordCriadero);
        mapa.agregar(reserva, coordReserva);
        mapa.agregar(guarida, coordGuarida);
        mapa.agregar(espiral, coordEspiral);

        //Creo el zerling y el mutalisco
        while(zerling.estaDisponible() && muta.estaDisponible()){
            zerling.construir();
            muta.construir();
        }

        mapa.agregar(muta,new Coordenada(11,10));
        mapa.agregar(zerling,coordAtacada);
        mapa.atacar(muta,coordAtacada);

        assertEquals(26,zerling.vida());
    }

    @Test
    public void mutaliscoAtacaUnScoutYNoDeberiaHacerleDanio(){
        Coordenada coordAtacada = new Coordenada(10,10);

        //Creo primero un criadero, luego una reserva, porque es el prerequisito de la Guarida
        //Luego creo la Guarida, que es el prerequisito del Espiral
        //Y finalmente creo el Espiral, que es prerequisito del Mutalisco
        while(criadero.estaDisponible() && reserva.estaDisponible() && guarida.estaDisponible() && espiral.estaDisponible()){
            criadero.avanzarTurno(mapa);
            reserva.avanzarTurno(mapa);
            guarida.avanzarTurno(mapa);
            espiral.avanzarTurno(mapa);
        }
        mapa.agregar(criadero, coordCriadero);
        mapa.agregar(reserva, coordReserva);
        mapa.agregar(guarida, coordGuarida);
        mapa.agregar(espiral, coordEspiral);


        while(muta.estaDisponible() && scout.estaDisponible()){
            muta.construir();
            scout.estaDisponible();
        }

        mapa.agregar(scout, coordAtacada);
        mapa.agregar(muta, new Coordenada(11,10));
        mapa.atacar(muta, coordAtacada);

        assertEquals(150,scout.vida());
    }



    @Test
    public void zerlingAtacaUnHidraliscoYDeberiaHacerleDanio(){
        Coordenada coordAtacada = new Coordenada(10,10);

        while(zerling.estaDisponible() && hidralisco.estaDisponible()){
            zerling.construir();
            hidralisco.estaDisponible();
        }

        mapa.agregar(hidralisco, coordAtacada);
        mapa.agregar(zerling, new Coordenada(11,10));
        mapa.atacar(zerling, coordAtacada);

        assertEquals(76,hidralisco.vida());
    }

}
