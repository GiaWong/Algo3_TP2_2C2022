package edu.fiuba.algo3.entrega_1.CasoDeUso4;

import edu.fiuba.algo3.modelo.Exceptions.ErrorExtractorCompleto;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Zerg.Extractor;
import edu.fiuba.algo3.modelo.Zerg.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExtractorYAsimiladorFuncionanCorrectamenteTest {
    @Test
    public void SeConstruyeUnExtractorSobreUnVolcanYAlNoTenerZanganoNoRecolectaGasVespeno() {

        int gasEsperado = 0;
        Mapa mapa = new Mapa(); //hay un volcan en 0,1
        Extractor extractor = new Extractor();
        mapa.agregar(extractor,0,1);
        extractor.avanzarTurno(6);
        extractor.recolectar();
        int gasObtenido = extractor.gasRecolectado();
        assertEquals(gasObtenido,gasEsperado);
    }

    @Test
    public void SeConstruyeUnExtractorSobreUnVolcanYConUnZanganoRecolecta10GasVespeno() {

        int gasEsperado = 10;
        Mapa mapa = new Mapa(); //hay un volcan en 1,2

        Extractor extractor = new Extractor();

        mapa.agregar(extractor,0,1);
        extractor.avanzarTurno(6);
        Zangano zangano = new Zangano();
        extractor.cargarZerg(zangano);

        extractor.recolectar();

        int gasObtenido = extractor.gasRecolectado();
        assertEquals(gasObtenido,gasEsperado);

    }

    @Test
    public void SeConstruyeUnExtractorSobreUnVolcanYConDosZanganosRecolecta20GasVespeno() {

        int gasEsperado = 20;
        Mapa mapa = new Mapa(); //hay un volcan en 0,1
        Extractor extractor = new Extractor();
        mapa.agregar(extractor,0,1);
        extractor.avanzarTurno(6);
        Zangano zangano1 = new Zangano();
        Zangano zangano2 = new Zangano();
        extractor.cargarZerg(zangano1);
        extractor.cargarZerg(zangano2);
        extractor.recolectar();
        int gasObtenido = extractor.gasRecolectado();
        assertEquals(gasObtenido,gasEsperado);

    }

    @Test
    public void SeConstruyeUnExtractorSobreUnVolcanYConTresZanganosRecolecta30GasVespeno() {

        int gasEsperado = 30;
        Mapa mapa = new Mapa(); //hay un volcan en 1,2
        Extractor extractor = new Extractor();
        mapa.agregar(extractor,0,1);
        extractor.avanzarTurno(6);
        Zangano zangano1 = new Zangano();
        Zangano zangano2 = new Zangano();
        Zangano zangano3 = new Zangano();
        extractor.cargarZerg(zangano1);
        extractor.cargarZerg(zangano2);
        extractor.cargarZerg(zangano3);
        extractor.recolectar();
        int gasObtenido = extractor.gasRecolectado();
        assertEquals(gasObtenido,gasEsperado);

    }

    @Test
    public void SeConstruyeUnExtractorSobreUnVolcanYSeIntentaAgregarUnCuartoZanganoYSeLanzaError() {

        Mapa mapa = new Mapa(); //hay un volcan en 1,2
        Extractor extractor = new Extractor();
        mapa.agregar(extractor,0,1);
        extractor.avanzarTurno(6);
        Zangano zangano1 = new Zangano();
        Zangano zangano2 = new Zangano();
        Zangano zangano3 = new Zangano();
        Zangano zangano4 = new Zangano();
        extractor.cargarZerg(zangano1);
        extractor.cargarZerg(zangano2);
        extractor.cargarZerg(zangano3);
        assertThrows(ErrorExtractorCompleto.class,()->extractor.cargarZerg(zangano4));

    }
    @Test
    public void SeConstruyeUnAsimiladorSobreUnVolcaYPasaUnTurnoYDevuelveElGasEsperado() {

        int gasEsperado = 20;
        Mapa mapa = new Mapa(); //hay un volcan en 1,2
        Asimilador asimilador = new Asimilador();
        mapa.agregar(asimilador,0,1);
        asimilador.avanzarTurno(7); //6 turnos para que funciona + 1 para que recolecte una vez
        int gasObtenido = asimilador.gasRecolectado();
        assertEquals(gasEsperado,gasObtenido);
    }
}
