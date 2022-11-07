package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUsoDosTest {

    /*
    Supuesto: - Cada construccion va a tener predefinido en un atributo
    la cantidad de turnos que se requiera para que este disponible.

              - En el assertEquals(), ver el tema de no violar el tell dont ask
    en el metodo 'estaDisponible()', porque se esta pidiendo un estado del objeto requerido.
     */

    /* Construcciones Zerg */
    @Test
    public void SeArrancaAConstruirCriaderoYDeberiaEstarInactivoPorFaltaDeTurnos() {

         /* Arrange */
        boolean resultadoEsperado = false;
        Criadero criadero = new Criadero();

        /* Act */
        criadero.pasar(new Turno(1));

        /* Assert */
        assertEquals(criadero.estaDisponible(), resultadoEsperado); /* checkear que no viole el tell dont ask */
    }

    @Test
    public void SeConstruyeElCriaderoYDeberiaEstarActivo() {

        /* Arrange */
        boolean resultadoEsperado = true;
        Criadero criadero = new Criadero();

        /* Act */
        criadero.pasar(new Turno(4));

        /* Assert */
        assertEquals(criadero.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirReservaReproduccionYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        boolean resultadoEsperado = false;
        ReservaProduccion reserva = new ReservaProduccion();

        /* Act */
        reserva.pasar(new Turno(1));

        /* Assert */
        assertEquals(reserva.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeReservaReproduccionYDeberiaEstarActivo() {

        /* Arrange */
        boolean resultadoEsperado = true;
        ReservaProduccion reserva = new ReservaProduccion();

        /* Act */
        reserva.pasar(new Turno(12));

        /* Assert */
        assertEquals(reserva.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirExtractorYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        boolean resultadoEsperado = false;
        Extractor extractor = new Extractor();

        /* Act */
        extractor.pasar(new Turno(1));

        /* Assert */
        assertEquals(extractor.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeExtractorYDeberiaEstarActivo() {

        /* Arrange */
        boolean resultadoEsperado = true;
        Extractor extractor = new Extractor();

        /* Act */
        extractor.pasar(new Turno(6));

        /* Assert */
        assertEquals(extractor.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirGuaridaYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        boolean resultadoEsperado = false;
        Guarida guarida = new Guarida();

        /* Act */
        guarida.pasar(new Turno(1));

        /* Assert */
        assertEquals(guarida.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeGuaridaYDeberiaEstarActivo() {

        /* Arrange */
        boolean resultadoEsperado = true;
        Guarida guarida = new Guarida();

        /* Act */
        guarida.pasar(new Turno(12));

        /* Assert */
        assertEquals(guarida.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirEspiralYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        boolean resultadoEsperado = false;
        Espiral espiral = new Espiral();

        /* Act */
        espiral.pasar(new Turno(1));

        /* Assert */
        assertEquals(espiral.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeEspiralYDeberiaEstarActivo() {

        /* Arrange */
        boolean resultadoEsperado = true;
        Espiral espiral = new Espiral();

        /* Act */
        espiral.pasar(new Turno(10));

        /* Assert */
        assertEquals(espiral.estaDisponible(), resultadoEsperado);
    }

    /* Construccion Protoss */

    @Test
    public void SeArrancaAConstruirNexoMineralYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        boolean resultadoEsperado = false;
        NexoMineral nexo = new NexoMineral();

        /* Act */
        nexo.pasar(new Turno(1));

        /* Assert */
        assertEquals(nexo.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeNexoMineralYDeberiaEstarActivo() {

        /* Arrange */
        boolean resultadoEsperado = true;
        NexoMineral nexo = new NexoMineral();

        /* Act */
        nexo.pasar(new Turno(4));

        /* Assert */
        assertEquals(nexo.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirPilonYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        boolean resultadoEsperado = false;
        Pilon pilon = new Pilon();

        /* Act */
        pilon.pasar(new Turno(1));

        /* Assert */
        assertEquals(pilon.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyePilonYDeberiaEstarActivo() {

        /* Arrange */
        boolean resultadoEsperado = true;
        Pilon pilon = new Pilon();

        /* Act */
        pilon.pasar(new Turno(5));

        /* Assert */
        assertEquals(pilon.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirAsimiladorYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        boolean resultadoEsperado = false;
        Asimilador asimilador = new Asimilador();

        /* Act */
        asimilador.pasar(new Turno(1));

        /* Assert */
        assertEquals(asimilador.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeAsimiladorYDeberiaEstarActivo() {

        /* Arrange */
        boolean resultadoEsperado = true;
        Asimilador asimilador = new Asimilador();

        /* Act */
        asimilador.pasar(new Turno(6));

        /* Assert */
        assertEquals(asimilador.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirAccesoYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        boolean resultadoEsperado = false;
        Acceso acceso = new Acceso();

        /* Act */
        acceso.pasar(new Turno(1));

        /* Assert */
        assertEquals(acceso.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeGuaridaYDeberiaEstarActivo() {

        /* Arrange */
        boolean resultadoEsperado = true;
        Acceso acceso = new Acceso();

        /* Act */
        acceso.pasar(new Turno(8));

        /* Assert */
        assertEquals(acceso.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirPuertoEstelarYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        boolean resultadoEsperado = false;
        PuertoEstelar puerto = new PuertoEstelar();

        /* Act */
        puerto.pasar(new Turno(1));

        /* Assert */
        assertEquals(puerto.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyePuertoEstelarYDeberiaEstarActivo() {

        /* Arrange */
        boolean resultadoEsperado = true;
        PuertoEstelar puerto = new PuertoEstelar();

        /* Act */
        puerto.pasar(new Turno(10));

        /* Assert */
        assertEquals(puerto.estaDisponible(), resultadoEsperado);
    }


}
