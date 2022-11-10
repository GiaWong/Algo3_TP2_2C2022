package edu.fiuba.algo3.entrega_1.CasoDeUso10;

import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Zerg.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DanioConstruccionZergTest {

    @Test
    public void CriaderoRecibeDanioYTieneLaVidaEsperada() {

        int vidaEsperada = 300;
        Mapa mapa = new Mapa();
        Criadero criadero = new Criadero();
        mapa.agregar(criadero,0,1);
        criadero.avanzarTurno(4); //empieza a estarDisponible y tiene vida max
        criadero.recibeDanio(200); //exception: no es 500 o más pq sino lo destruiría
        int vidaObtenida = criadero.obtenerVida();
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void CriaderoRecibeDanioYPasanCiertosTurnosYTieneVidaMaxima() {

        int vidaEsperada = 500; //poner constante?
        Mapa mapa = new Mapa();
        Criadero criadero = new Criadero();
        mapa.agregar(criadero,0,1);
        criadero.avanzarTurno(4); //empieza a estarDisponible y tiene vida max
        criadero.recibeDanio(200); //exception: no es 500 o más pq sino lo destruiría
        criadero.avanzarTurno(3); //internamente hay que aumentarle cierta cantidad de vida por turno
        //vida ya está max
        int vidaObtenida = criadero.obtenerVida();
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void ReservaDeProduccionRecibeDanioYTieneLaVidaEsperada() {

        int vidaEsperada = 700;
        Mapa mapa = new Mapa();
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.agregar(reserva,0,1);
        reserva.avanzarTurno(12); //empieza a estarDisponible y tiene vida max
        reserva.recibeDanio(300); //exception: no es 1000 o más pq sino lo destruiría
        int vidaObtenida = reserva.obtenerVida();
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void ReservaDeProduccionRecibeDanioYPasanCiertosTurnosYTieneVidaMaxima() {

        int vidaEsperada = 1000;
        Mapa mapa = new Mapa();
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.agregar(reserva,0,1);
        reserva.avanzarTurno(12); //empieza a estarDisponible y tiene vida max
        reserva.recibeDanio(300); //exception: no es 1000 o más pq sino lo destruiría
        reserva.avanzarTurno(4); //internamente hay que aumentarle cierta cantidad de vida por turno DECIDIDO POR NOSOTROS?
        //vida ya está max
        int vidaObtenida = reserva.obtenerVida();
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void ExtractorRecibeDanioYTieneLaVidaEsperada() {

        int vidaEsperada = 450;
        Mapa mapa = new Mapa();
        Extractor extractor = new Extractor();
        mapa.agregar(extractor,0,1);
        extractor.avanzarTurno(6); //empieza a estarDisponible y tiene vida max
        extractor.recibeDanio(300); //exception: no es 750 o más pq sino lo destruiría
        int vidaObtenida = extractor.obtenerVida();
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void ExtractorRecibeDanioYPasanCiertosTurnosYTieneVidaMaxima() {

        int vidaEsperada = 750;
        Mapa mapa = new Mapa();
        Extractor extractor = new Extractor();
        mapa.agregar(extractor,0,1);
        extractor.avanzarTurno(6); //empieza a estarDisponible y tiene vida max
        extractor.recibeDanio(300); //exception: no es 750 o más pq sino lo destruiría
        extractor.avanzarTurno(4); //internamente hay que aumentarle cierta cantidad de vida por turno DECIDIDO POR NOSOTROS?
        //vida ya está max
        int vidaObtenida = extractor.obtenerVida();
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void GuaridaRecibeDanioYTieneLaVidaEsperada() {

        int vidaEsperada = 950;
        Mapa mapa = new Mapa();
        Guarida guarida = new Guarida();
        mapa.agregar(guarida,0,1);
        guarida.avanzarTurno(12); //empieza a estarDisponible y tiene vida max
        guarida.recibeDanio(300); //exception: no es 1250 o más pq sino lo destruiría
        int vidaObtenida = guarida.obtenerVida();
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void GuaridaRecibeDanioYPasanCiertosTurnosYTieneVidaMaxima() {

        int vidaEsperada = 1250;
        Mapa mapa = new Mapa();
        Guarida guarida = new Guarida();
        mapa.agregar(guarida,0,1);
        guarida.avanzarTurno(12); //empieza a estarDisponible y tiene vida max
        guarida.recibeDanio(300); //exception: no es 1250 o más pq sino lo destruiría
        guarida.avanzarTurno(4); //internamente hay que aumentarle cierta cantidad de vida por turno DECIDIDO POR NOSOTROS?
        //vida ya está max
        int vidaObtenida = guarida.obtenerVida();
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void EspiralRecibeDanioYTieneLaVidaEsperada() {

        int vidaEsperada = 1000;
        Mapa mapa = new Mapa();
        Espiral espiral = new Espiral();
        mapa.agregar(espiral,0,1);
        espiral.avanzarTurno(10); //empieza a estarDisponible y tiene vida max
        espiral.recibeDanio(300); //exception: no es 1300 o más pq sino lo destruiría
        int vidaObtenida = espiral.obtenerVida();
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void EspiralRecibeDanioYPasanCiertosTurnosYTieneVidaMaxima() {
        int vidaEsperada = 1300;
        Mapa mapa = new Mapa();
        Espiral espiral = new Espiral();
        mapa.agregar(espiral,0,1);
        espiral.avanzarTurno(10); //empieza a estarDisponible y tiene vida max
        espiral.recibeDanio(300); //exception: no es 1300 o más pq sino lo destruiría
        espiral.avanzarTurno(4); //internamente hay que aumentarle cierta cantidad de vida por turno DECIDIDO POR NOSOTROS?
        //vida ya está max
        int vidaObtenida = espiral.obtenerVida();
        assertEquals(vidaEsperada,vidaObtenida);
    }
}