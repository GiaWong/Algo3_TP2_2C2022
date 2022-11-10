package edu.fiuba.algo3.entrega_1.CasoDeUso14;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Zerg.ReservaProduccion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MohoNoSeExpandePorAreaEdificadaTest {

    @Test
    public void MohoSeExpandePorAreaAfectadaPorPilonYObtengoLaRespuestaEsperada() {

        //si hay un edificio protoss no puede tener moho
        //si tiene energía sí puede


        //a donde se va a expnadir el moho? donde haya nada porque sino habría un edificio zerg que YA tiene moho
        //o un ed protoss o un recurso
        // se puede expandir moho sobre los nodos y volcanes?

        boolean respuestaEsperada = true;
        Mapa mapa = new Mapa();
        int radio = 5;
        Moho moho = new Moho(0,1,mapa); //moho se tiene que encargadar de pintar casillas
        Pilon pilon = new Pilon();
        mapa.agregar(pilon,0,8);
        moho.avanzarTurno(5); //se expandió 2 veces
        pilon.avanzarTurno(5); //empieza a energizar casillas
        boolean respuestaObtenida = mapa.hayMoho(0,6); //se puede construir en los mismos casos donde moho se puede expandir
        assertEquals(respuestaEsperada, respuestaObtenida);
    }


    //cuando se contruye un edificio Zerg diferente a Criadero la casilla deja de tener moho?

    @Test
    public void ConstruyoUnaReservaYPasanCiertosTurnosYMohoNoSeExpandeSobreLaZonaYObtengoRespuestaEsperada() {

        boolean respuestaEsperada = false;
        Mapa mapa = new Mapa();
        Moho moho = new Moho(0,1,mapa); //moho se tiene que encargadar de pintar casillas
        moho.avanzarTurno(5); //se expandió 2 veces
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.agregar(reserva,0,10); //en la casilla si hay moho deja de haber
        moho.avanzarTurno(8);
        boolean respuestaObtenida = mapa.hayMoho(0,10); //no hay pq hay un edificio
        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    public void ConstruyoUnAccesoYPasanCiertosTurnosYMohoNoSeExpandeSobreLaZonaYObtengoRespuestaEsperada() {

        boolean respuestaEsperada = false;
        Mapa mapa = new Mapa();
        int radio = 5;
        Moho moho = new Moho(0,1,mapa); //moho se tiene que encargadar de pintar casillas
        Pilon pilon = new Pilon();
        mapa.agregar(pilon,0,10);
        moho.avanzarTurno(5); //se expandió 2 veces
        pilon.avanzarTurno(5); //empieza a energizar casillas
        Acceso acceso = new Acceso();
        mapa.agregar(acceso,0,11); //debe saltar error si ya hay moho
        moho.avanzarTurno(8);
        boolean respuestaObtenida = mapa.hayMoho(0,11); //no hay pq hay un edificio
        assertEquals(respuestaEsperada, respuestaObtenida);
    }
}
