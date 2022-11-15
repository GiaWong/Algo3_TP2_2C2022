package edu.fiuba.algo3.entrega_1.CasoDeUso4;

import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.ConNodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.ConVolcan;
import edu.fiuba.algo3.modelo.Recursos.Volcan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso4Test {
    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYAlNoTenerZanganoNoProduceGasVespeno() {
        int esperado = 0;
        Extractor extractor = new Extractor();
        ConVolcan conVolcan = new ConVolcan();
        Volcan volcan = new Volcan();
        for (int i = 0; i < 6; i++){ //Esto lo hago porque supongo que solo se pueden meter zanganos a extractor una vez que esta construida.
            extractor.construir();
        }
        //No le meto ningun zangano
        conVolcan.agregarConstruccion(extractor);
        int resultado = extractor.recolectar(volcan);
        assertEquals(resultado, esperado);

        //Recordatorio: hay que crear las Unidades para resolver este test, para poder usar Zangano porque Extractor tiene una lista de estos.

    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon1ZanganoProduce10GasVespeno() {



    }
    /*
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

        int esperado = 30;

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
    */
}
