package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConMoho;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.RefineriaGas.Extractor;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Zerg.ReservaProduccion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstruccionConMohoTest {
    @Test
    public void SeConstruyeCriaderoDentroDelRangoMoho() {

        boolean esperado = true;
        Moho moho = new Moho(5);


        Criadero criadero = new Criadero(1);
        criadero.empezarAConstruirSegun(moho, new Turno(4));
        boolean resultado = moho.estaEnRango();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeReservaProduccionDentroDelRangoMoho() {

        boolean esperado = true;
        Moho moho = new Moho(5);


        ReservaProduccion reserva = new ReservaProduccion(2);
        reserva.empezarAConstruirSegun(moho, new Turno(12));
        boolean resultado = moho.estaEnRango();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeExtractorDentroDelRangoMoho() {

        boolean esperado = true;
        Moho moho = new Moho(5);


        Extractor extractor = new Extractor(3);
        extractor.empezarAConstruirSegun(moho, new Turno(6));
        boolean resultado = moho.estaEnRango();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeGuaridaDentroDelRangoMoho() {

        boolean esperado = true;
        Moho moho = new Moho(5);


        Guarida guarida = new Guarida(4);
        guarida.empezarAConstruirSegun(moho, new Turno(12));
        boolean resultado = moho.estaEnRango();

        assertEquals(resultado, esperado);

    }

    @Test
    public void SeConstruyeEspiralDentroDelRangoMoho() {

        boolean esperado = true;
        Moho moho = new Moho(5);


        Espiral espiral = new Espiral(5);
        espiral.empezarAConstruirSegun(moho, new Turno(10));
        boolean resultado = moho.estaEnRango();

        assertEquals(resultado, esperado);
    }
}
