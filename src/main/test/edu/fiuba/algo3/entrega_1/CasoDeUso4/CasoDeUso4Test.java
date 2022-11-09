package edu.fiuba.algo3.entrega_1.CasoDeUso4;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.RefineriaGas.Asimilador;
import edu.fiuba.algo3.modelo.RefineriaGas.Extractor;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso4Test {
    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYAlNoTenerZanganoNoProduceGasVespeno() {

        int esperado = 0;
        Extractor extractor = new Extractor(new GasVespeno());
        Moho moho = new Moho(5);
        extractor.empezarAConstruirSegun( moho, new Turno(6));

        extractor.producirGas(new Zangano(0), new Turno(0));
        int resultado = extractor.conProduccionDeGas(); /*va a devolver la cantidad de produccion*/

        assertEquals(resultado, esperado);


    }
    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon1ZanganoProduce10GasVespeno() {

        int esperado = 10;
        Extractor extractor = new Extractor(new GasVespeno());
        Moho moho = new Moho(5);
        extractor.empezarAConstruirSegun( moho,new Turno(6));

        extractor.producirGas(new Zangano(1), new Turno(1));
        int resultado = extractor.conProduccionDeGas();

        assertEquals(resultado, esperado);


    }
    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon2ZanganoProduce20GasVespeno() {

        int esperado = 20;
        Extractor extractor = new Extractor(new GasVespeno());

        Moho moho = new Moho(5);
        extractor.empezarAConstruirSegun( moho, new Turno(6));

        extractor.producirGas(new Zangano(2), new Turno(1));
        int resultado = extractor.conProduccionDeGas();

        assertEquals(resultado, esperado);


    }
    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon3ZanganoProduce30GasVespeno() {

        int esperado = 30;
        Extractor extractor = new Extractor(new GasVespeno());
        Moho moho = new Moho(5);
        extractor.empezarAConstruirSegun( moho, new Turno(6));

        extractor.producirGas(new Zangano(3), new Turno(1));
        int resultado = extractor.conProduccionDeGas();

        assertEquals(resultado, esperado);


    }
    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon4ZanganoYaNoProduceGasVespeno() {

        int esperado = 30; /*al no producir mas gas que se mantenga con su valor actual¿?*/
        Extractor extractor = new Extractor(new GasVespeno());

        Moho moho = new Moho(5);
        extractor.empezarAConstruirSegun(moho, new Turno(6));

        extractor.producirGas(new Zangano(4), new Turno(1));
        int resultado = extractor.conProduccionDeGas();

        assertEquals(resultado, esperado);


    }
    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespenoYPor1TurnoProduce20GasVespeno() {

        int esperado = 20;
        Asimilador asimilador = new Asimilador(new GasVespeno());

        Pilon pilon = new Pilon(3);
        asimilador.empezarAConstruirSegun( pilon, new Turno(6));

        asimilador.prepararCapsulaDeGas(new Turno(1));
        int resultado = asimilador.conProduccionGas();

        assertEquals(resultado, esperado);


    }
    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespenoYPor2TurnoProduce40GasVespeno() {

        int esperado = 40;
        Asimilador asimilador = new Asimilador(new GasVespeno());

        Pilon pilon = new Pilon(3);
        asimilador.empezarAConstruirSegun( pilon, new Turno(6));

        asimilador.prepararCapsulaDeGas(new Turno(2));
        int resultado = asimilador.conProduccionGas();

        assertEquals(resultado, esperado);


    }
}
