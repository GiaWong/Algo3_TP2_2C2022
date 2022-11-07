package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Protoss.Criadero;
import edu.fiuba.algo3.modelo.Protoss.Espiral;
import edu.fiuba.algo3.modelo.Protoss.Guarida;
import edu.fiuba.algo3.modelo.Protoss.ReservaProduccion;
import edu.fiuba.algo3.modelo.RefineriaGas.Asimilador;
import edu.fiuba.algo3.modelo.RefineriaGas.Extractor;
import edu.fiuba.algo3.modelo.Zerg.Acceso;
import edu.fiuba.algo3.modelo.Zerg.NexoMineral;
import edu.fiuba.algo3.modelo.Zerg.Pilon;
import edu.fiuba.algo3.modelo.Zerg.PuertoEstelar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso2Test {

    /*
    Supuesto: - Cada construccion va a tener predefinido en un atributo
    la cantidad de turnos que se requiera para que este disponible.

     */

    /* Construcciones Zerg */
    @Test
    public void SeArrancaAConstruirCriaderoYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean resultado = false;
        Criadero criadero = new Criadero();
        criadero.conTurno(new Turno(1));
        boolean esperado = criadero.estaDisponible();/* checkear que no viole el tell dont ask */

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyeElCriaderoYDeberiaEstarActivo() {


        boolean resultado = true;
        Criadero criadero = new Criadero();
        criadero.conTurno(new Turno(4));
        boolean esperado = criadero.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeArrancaAConstruirReservaReproduccionYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean resultado = false;
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.conTurno(new Turno(1));
        boolean esperado = reserva.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyeReservaReproduccionYDeberiaEstarActivo() {


        boolean resultado = true;
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.conTurno(new Turno(12));
        boolean esperado = reserva.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeArrancaAConstruirExtractorYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean resultado = false;
        Extractor extractor = new Extractor();
        extractor.conTurno(new Turno(1));
        boolean esperado = extractor.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyeExtractorYDeberiaEstarActivo() {


        boolean resultado = true;
        Extractor extractor = new Extractor();
        extractor.conTurno(new Turno(6));
        boolean esperado = extractor.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeArrancaAConstruirGuaridaYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean resultado = false;
        Guarida guarida = new Guarida();
        guarida.conTurno(new Turno(1));
        boolean esperado = guarida.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyeGuaridaYDeberiaEstarActivo() {


        boolean resultado = true;
        Guarida guarida = new Guarida();
        guarida.conTurno(new Turno(12));
        boolean esperado = guarida.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeArrancaAConstruirEspiralYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean resultado = false;
        Espiral espiral = new Espiral();
        espiral.conTurno(new Turno(1));
        boolean esperado = espiral.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyeEspiralYDeberiaEstarActivo() {


        boolean resultado = true;
        Espiral espiral = new Espiral();
        espiral.conTurno(new Turno(10));
        boolean esperado = espiral.estaDisponible();

        assertEquals(esperado, resultado);
    }

    /* Construccion Protoss */

    @Test
    public void SeArrancaAConstruirNexoMineralYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean resultado = false;
        NexoMineral nexo = new NexoMineral();
        nexo.conTurno(new Turno(1));
        boolean esperado = nexo.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyeNexoMineralYDeberiaEstarActivo() {


        boolean resultado = true;
        NexoMineral nexo = new NexoMineral();
        nexo.conTurno(new Turno(4));
        boolean esperado = nexo.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeArrancaAConstruirPilonYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean resultado = false;
        Pilon pilon = new Pilon();
        pilon.conTurno(new Turno(1));
        boolean esperado = pilon.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyePilonYDeberiaEstarActivo() {


        boolean resultado = true;
        Pilon pilon = new Pilon();
        pilon.conTurno(new Turno(5));
        boolean esperado = pilon.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeArrancaAConstruirAsimiladorYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean resultado = false;
        Asimilador asimilador = new Asimilador();
        asimilador.conTurno(new Turno(1));
        boolean esperado = asimilador.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyeAsimiladorYDeberiaEstarActivo() {


        boolean resultado = true;
        Asimilador asimilador = new Asimilador();
        asimilador.conTurno(new Turno(6));
        boolean esperado = asimilador.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeArrancaAConstruirAccesoYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean resultado = false;
        Acceso acceso = new Acceso();
        acceso.conTurno(new Turno(1));
        boolean esperado = acceso.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyeAccesoYDeberiaEstarActivo() {


        boolean resultado = true;
        Acceso acceso = new Acceso();
        acceso.conTurno(new Turno(8));
        boolean esperado = acceso.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeArrancaAConstruirPuertoEstelarYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean resultado = false;
        PuertoEstelar puerto = new PuertoEstelar();
        puerto.conTurno(new Turno(1));
        boolean esperado = puerto.estaDisponible();

        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyePuertoEstelarYDeberiaEstarActivo() {


        boolean resultado = true;
        PuertoEstelar puerto = new PuertoEstelar();
        puerto.conTurno(new Turno(10));
        boolean esperado = puerto.estaDisponible();

        assertEquals(esperado, resultado);
    }


}
