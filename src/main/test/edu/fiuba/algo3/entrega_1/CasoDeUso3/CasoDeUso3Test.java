package edu.fiuba.algo3.entrega_1.CasoDeUso3;

import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.RefineriaGas.Asimilador;
import edu.fiuba.algo3.modelo.RefineriaGas.Extractor;
import edu.fiuba.algo3.modelo.Turno.Turno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso3Test {

    @Test
    public void AsimiladorTieneGasVespeno() {

        boolean esperado = true;
        Asimilador asimilador = new Asimilador();
        asimilador.conGasVespeno(new GasVespeno());
        boolean resultado = asimilador.contieneGas();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespeno() {

        boolean esperado = true;
        Asimilador asimilador = new Asimilador();
        asimilador.conGasVespeno(new GasVespeno());
        asimilador.empezarAConstruirSegun(new Turno(6));
        boolean resultado = asimilador.estaDisponible();

        assertEquals(resultado, esperado);


    }
    @Test
    public void ExtractorTieneGasVespeno() {

        boolean esperado = true;
        Extractor extractor = new Extractor();
        extractor.conGasVespeno(new GasVespeno());
        boolean resultado = extractor.contieneGas();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespeno() {

        boolean esperado = true;
        Extractor extractor = new Extractor();
        extractor.conGasVespeno(new GasVespeno());
        extractor.empezarAConstruirSegun(new Turno(6));
        boolean resultado = extractor.estaDisponible();

        assertEquals(resultado, esperado);


    }
}
