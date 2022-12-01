package edu.fiuba.algo3.entrega_1.CasoDeUso10;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso10Test {


    @Test
    public void SeDañaAUnCriaderoYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 500;
        Criadero criadero = new Criadero(0);
        Zealot zealot = new Zealot();

        zealot.atacar(criadero);
        for (int i = 0; i < 3; i++) {
            criadero.avanzarTurno();
        }
        int resultado = criadero.obtenerVida();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnReservaReproduccionYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 1000;
        ReservaProduccion reserva = new ReservaProduccion(0);
        Zealot zealot = new Zealot();

        zealot.atacar(reserva);
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
        Zealot zealot = new Zealot();

        zealot.atacar(extractor);
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
        Zealot zealot = new Zealot();

        zealot.atacar(guarida);
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
        Zealot zealot = new Zealot();

        zealot.atacar(espiral);
        for (int i = 0; i < 3; i++) {
            espiral.avanzarTurno();
        }
        int resultado = espiral.obtenerVida();
        assertEquals(resultado, esperado);
    }
}
