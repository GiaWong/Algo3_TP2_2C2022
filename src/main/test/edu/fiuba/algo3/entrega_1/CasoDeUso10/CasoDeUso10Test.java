package edu.fiuba.algo3.entrega_1.CasoDeUso10;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso10Test {


    @Test
    public void SeDañaAUnCriaderoYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 500;
        Criadero criadero = new Criadero();
        for (int i = 0; i < 4; i++) {
            criadero.avanzarTurno();
        }
        criadero.recibirDanio(new Danio(30));
        for (int i = 0; i < 3; i++) {
            criadero.avanzarTurno();
        }
        int resultado = criadero.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnReservaReproduccionYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 1000;
        ReservaProduccion reserva = new ReservaProduccion();
        for (int i = 0; i < 12; i++) {
            reserva.avanzarTurno();
        }
        reserva.recibirDanio(new Danio(30));
        for (int i = 0; i < 3; i++) {
            reserva.avanzarTurno();
        }
        int resultado = reserva.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnExtractorYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 750;
        Extractor extractor = new Extractor();
        for (int i = 0; i < 6; i++) {
            extractor.avanzarTurno();
        }
        extractor.recibirDanio(new Danio(30));
        for (int i = 0; i < 3; i++) {
            extractor.avanzarTurno();
        }
        int resultado = extractor.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnGuaridaYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 1250;
        Guarida guarida = new Guarida();
        for (int i = 0; i < 12; i++) {
            guarida.avanzarTurno();
        }
        guarida.recibirDanio(new Danio(30));
        for (int i = 0; i < 3; i++) {
            guarida.avanzarTurno();
        }
        int resultado = guarida.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnEspiralYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 1300;
        Espiral espiral = new Espiral();
        for (int i = 0; i < 10; i++) {
            espiral.avanzarTurno();
        }
        espiral.recibirDanio(new Danio(30));
        for (int i = 0; i < 3; i++) {
            espiral.avanzarTurno();
        }
        int resultado = espiral.obtenerVida();
        assertEquals(resultado, esperado);
    }
}
