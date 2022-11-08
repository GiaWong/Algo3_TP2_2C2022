package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionZerg;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Zerg.ReservaProduccion;
import edu.fiuba.algo3.modelo.RefineriaGas.Extractor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstruccionZergTests {

    /*
    Supuesto: - Cada construccion va a tener predefinido en un atributo
    la cantidad de turnos que se requiera para que este disponible.
     */

    @Test
    public void SeArrancaAConstruirCriaderoYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Criadero criadero = new Criadero(1);
        Moho moho = new Moho(5);
        criadero.empezarAConstruirSegun(moho, new Turno(1));
        boolean resultado = criadero.estaDisponible();/* checkear que no viole el tell dont ask */

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeElCriaderoYDeberiaEstarActivo() {


        boolean esperado = true;
        Criadero criadero = new Criadero(1);
        Moho moho = new Moho(5);
        criadero.empezarAConstruirSegun(moho, new Turno(4));
        boolean resultado = criadero.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirReservaReproduccionYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        ReservaProduccion reserva = new ReservaProduccion(2);
        Moho moho = new Moho(5);
        reserva.empezarAConstruirSegun(moho, new Turno(1));
        boolean resultado = reserva.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeReservaReproduccionYDeberiaEstarActivo() {


        boolean esperado = true;
        ReservaProduccion reserva = new ReservaProduccion(2);
        Moho moho = new Moho(5);
        reserva.empezarAConstruirSegun(moho, new Turno(12));
        boolean resultado = reserva.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirExtractorYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Extractor extractor = new Extractor(3);
        Moho moho = new Moho(5);
        extractor.empezarAConstruirSegun(moho, new Turno(1));
        boolean resultado = extractor.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeExtractorYDeberiaEstarActivo() {


        boolean esperado = true;
        Extractor extractor = new Extractor(3);
        Moho moho = new Moho(5);
        extractor.empezarAConstruirSegun(moho, new Turno(6));
        boolean resultado = extractor.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirGuaridaYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Guarida guarida = new Guarida(4);
        Moho moho = new Moho(5);
        guarida.empezarAConstruirSegun(moho, new Turno(1));
        boolean resultado = guarida.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeGuaridaYDeberiaEstarActivo() {


        boolean esperado = true;
        Guarida guarida = new Guarida(4);
        Moho moho = new Moho(5);
        guarida.empezarAConstruirSegun(moho, new Turno(12));
        boolean resultado = guarida.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirEspiralYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Espiral espiral = new Espiral(5);
        Moho moho = new Moho(5);
        espiral.empezarAConstruirSegun(moho, new Turno(1));
        boolean resultado = espiral.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeEspiralYDeberiaEstarActivo() {


        boolean esperado = true;
        Espiral espiral = new Espiral(5);
        Moho moho = new Moho(5);
        espiral.empezarAConstruirSegun(moho, new Turno(10));
        boolean resultado = espiral.estaDisponible();

        assertEquals(resultado, esperado);
    }


}
