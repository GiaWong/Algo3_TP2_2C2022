package edu.fiuba.algo3.entrega_1.CasoDeUso3;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
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
        Asimilador asimilador = new Asimilador(1);
        asimilador.conGasVespeno(new GasVespeno());
        boolean resultado = asimilador.contieneGas();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespeno() {

        boolean esperado = true;
        Asimilador asimilador = new Asimilador(1);
        asimilador.conGasVespeno(new GasVespeno());
        Pilon pilon = new Pilon(3);
        asimilador.empezarAConstruirSegun(pilon, new Turno(6));
        boolean resultado = asimilador.estaDisponible();

        assertEquals(resultado, esperado);


    }
    @Test
    public void ExtractorTieneGasVespeno() {

        boolean esperado = true;
        Extractor extractor = new Extractor(1);
        extractor.conGasVespeno(new GasVespeno());
        boolean resultado = extractor.contieneGas();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespeno() {

        boolean esperado = true;
        Extractor extractor = new Extractor(1);
        extractor.conGasVespeno(new GasVespeno());
        Pilon pilon = new Pilon(3);
        extractor.empezarAConstruirSegun(pilon, new Turno(6));
        boolean resultado = extractor.estaDisponible();

        assertEquals(resultado, esperado);


    }
}
