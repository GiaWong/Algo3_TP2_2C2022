package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionZerg;

import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Protoss.Criadero;
import edu.fiuba.algo3.modelo.Protoss.Espiral;
import edu.fiuba.algo3.modelo.Protoss.Guarida;
import edu.fiuba.algo3.modelo.Protoss.ReservaProduccion;
import edu.fiuba.algo3.modelo.RefineriaGas.Extractor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstruccionZergTests {

    /*
    Supuesto: - Cada construccion va a tener predefinido en un atributo
    la cantidad de turnos que se requiera para que este disponible.

     */

    /* Construcciones Zerg */
    @Test
    public void SeArrancaAConstruirCriaderoYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Criadero criadero = new Criadero();
        criadero.conTurno(new Turno(1));
        boolean resultado = criadero.estaDisponible();/* checkear que no viole el tell dont ask */

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeElCriaderoYDeberiaEstarActivo() {


        boolean esperado = true;
        Criadero criadero = new Criadero();
        criadero.conTurno(new Turno(4));
        boolean resultado = criadero.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirReservaReproduccionYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.conTurno(new Turno(1));
        boolean resultado = reserva.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeReservaReproduccionYDeberiaEstarActivo() {


        boolean esperado = true;
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.conTurno(new Turno(12));
        boolean resultado = reserva.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirExtractorYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Extractor extractor = new Extractor();
        extractor.conTurno(new Turno(1));
        boolean resultado = extractor.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeExtractorYDeberiaEstarActivo() {


        boolean esperado = true;
        Extractor extractor = new Extractor();
        extractor.conTurno(new Turno(6));
        boolean resultado = extractor.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirGuaridaYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Guarida guarida = new Guarida();
        guarida.conTurno(new Turno(1));
        boolean resultado = guarida.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeGuaridaYDeberiaEstarActivo() {


        boolean esperado = true;
        Guarida guarida = new Guarida();
        guarida.conTurno(new Turno(12));
        boolean resultado = guarida.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirEspiralYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Espiral espiral = new Espiral();
        espiral.conTurno(new Turno(1));
        boolean resultado = espiral.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeEspiralYDeberiaEstarActivo() {


        boolean esperado = true;
        Espiral espiral = new Espiral();
        espiral.conTurno(new Turno(10));
        boolean resultado = espiral.estaDisponible();

        assertEquals(resultado, esperado);
    }

    /* Construccion Protoss */




}
