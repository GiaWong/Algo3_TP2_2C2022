package edu.fiuba.algo3.entrega_1.CasoDeUso3;

import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.ConRecurso;
import edu.fiuba.algo3.modelo.Recursos.Volcan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso3Test {



    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespeno() {
        ConRecurso conRecurso = new ConRecurso();
        conRecurso.setRecurso(new Volcan);
        assertThrows(Error,()->conRecurso.agregarConstruccion(new Asimilador()));



    }
    /*
    @Test
    public void ExtractorTieneGasVespeno() {

        boolean esperado = true;
        Extractor extractor = new Extractor(new GasVespeno());
        boolean resultado = extractor.contieneGas();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespeno() {

        boolean esperado = true;
        Extractor extractor = new Extractor(new GasVespeno());
        extractor.empezarAConstruirSegun(new Pilon(3),new Turno(6));
        boolean resultado = extractor.estaDisponible();

        assertEquals(resultado, esperado);
    }
    */
}

