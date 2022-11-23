package edu.fiuba.algo3.entrega_1.CasoDeUso10;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.ConstruccionZerg.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso10Test {

    @Test
    public void SeDañaAUnCriaderoYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 500;
        ConstruccionZerg criadero = new Criadero();
        criadero.recibeDanio(30);
        criadero.avanzarTurno();
        criadero.avanzarTurno();
        criadero.avanzarTurno();
        int resultado = criadero.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnReservaReproduccionYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 1000;
        ConstruccionZerg reserva = new ReservaProduccion();
        reserva.recibeDanio(30);
        reserva.avanzarTurno();
        reserva.avanzarTurno();
        reserva.avanzarTurno();
        int resultado = reserva.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnExtractorYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 750;
        ConstruccionZerg extractor = new Extractor();
        extractor.recibeDanio(30);
        extractor.avanzarTurno();
        extractor.avanzarTurno();
        extractor.avanzarTurno();
        int resultado = extractor.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnGuaridaYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 1250;
        ConstruccionZerg guarida = new Guarida();
        guarida.recibeDanio(30);
        guarida.avanzarTurno();
        guarida.avanzarTurno();
        guarida.avanzarTurno();
        int resultado = guarida.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnEspiralYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 1300;
        ConstruccionZerg espiral = new Espiral();
        espiral.recibeDanio(30);
        espiral.avanzarTurno();
        espiral.avanzarTurno();
        espiral.avanzarTurno();
        int resultado = espiral.obtenerVida();
        assertEquals(resultado, esperado);
    }
}
