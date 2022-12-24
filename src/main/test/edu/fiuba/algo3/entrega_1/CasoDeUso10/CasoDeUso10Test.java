package edu.fiuba.algo3.entrega_1.CasoDeUso10;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class CasoDeUso10Test {

    Mapa mapa = mock(Mapa.class);

    @Test
    public void SeDaniaAUnCriaderoYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 500;
        Construccion criadero = new Criadero(0);
        Unidad zealot = new Zealot();
        for (int i = 0; i < 10; i++) {
            zealot.construir();
        }
        assertTrue(zealot.estaDisponible());

        zealot.atacar(criadero);
        for (int i = 0; i < 3; i++) {
            criadero.avanzarTurno(mapa);
        }
        int resultado = criadero.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDaniaAUnReservaReproduccionYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 1000;
        Construccion reserva = new ReservaProduccion(0);
        Unidad zealot = new Zealot();
        for (int i = 0; i < 10; i++) {
            zealot.construir();
        }
        assertTrue(zealot.estaDisponible());

        zealot.atacar(reserva);
        for (int i = 0; i < 3; i++) {
            reserva.avanzarTurno(mapa);
        }
        int resultado = reserva.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDaniaAUnExtractorYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 750;
        Construccion extractor = new Extractor();
        Unidad zealot = new Zealot();
        for (int i = 0; i < 10; i++) {
            zealot.construir();
        }
        assertTrue(zealot.estaDisponible());

        zealot.atacar(extractor);
        for (int i = 0; i < 3; i++) {
            extractor.avanzarTurno(mapa);
        }
        int resultado = extractor.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDaniaAUnGuaridaYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 1250;
        Construccion guarida = new Guarida();
        Unidad zealot = new Zealot();
        for (int i = 0; i < 10; i++) {
            zealot.construir();
        }
        assertTrue(zealot.estaDisponible());

        zealot.atacar(guarida);
        for (int i = 0; i < 3; i++) {
            guarida.avanzarTurno(mapa);
        }
        int resultado = guarida.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDaniaAUnEspiralYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 1300;
        Construccion espiral = new Espiral();
        Unidad zealot = new Zealot();
        for (int i = 0; i < 10; i++) {
            zealot.construir();
        }
        assertTrue(zealot.estaDisponible());

        zealot.atacar(espiral);
        for (int i = 0; i < 3; i++) {
            espiral.avanzarTurno(mapa);
        }
        int resultado = espiral.obtenerVida();
        assertEquals(resultado, esperado);
    }
}
