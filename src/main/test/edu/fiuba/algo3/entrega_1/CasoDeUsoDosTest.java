package edu.fiuba.algo3.entrega_1;

import org.junit.jupiter.api.Test;

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
        int resultadoEsperado = false;
        Criadero criadero = new Criadero();

        /* Act */
        criadero.pasar(new Turno(1));

        /* Assert */
        assertEquals(criadero.estaDisponible(), resultadoEsperado); /* checkear que no viole el tell dont ask */
    }

    @Test
    public void SeConstruyeElCriaderoYDeberiaEstarActivo() {

        /* Arrange */
        int resultadoEsperado = true;
        Criadero criadero = new Criadero();

        /* Act */
        criadero.pasar(new Turno(4));

        /* Assert */
        assertEquals(criadero.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirReservaReproduccionYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        int resultadoEsperado = false;
        ReservaProduccion reserva = new ReservaProduccion();

        /* Act */
        reserva.pasar(new Turno(1));

        /* Assert */
        assertEquals(reserva.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeReservaReproduccionYDeberiaEstarActivo() {

        /* Arrange */
        int resultadoEsperado = true;
        ReservaProduccion reserva = new ReservaProduccion();

        /* Act */
        reserva.pasar(new Turno(12));

        /* Assert */
        assertEquals(reserva.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirExtractorYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        int resultadoEsperado = false;
        Extractor extractor = new Extractor();

        /* Act */
        extractor.pasar(new Turno(1));

        /* Assert */
        assertEquals(extractor.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeExtractorYDeberiaEstarActivo() {

        /* Arrange */
        int resultadoEsperado = true;
        Extractor extractor = new Extractor();

        /* Act */
        extractor.pasar(new Turno(6));

        /* Assert */
        assertEquals(extractor.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirGuaridaYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        int resultadoEsperado = false;
        Guarida guarida = new Guarida();

        /* Act */
        guarida.pasar(new Turno(1));

        /* Assert */
        assertEquals(guarida.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeGuaridaYDeberiaEstarActivo() {

        /* Arrange */
        int resultadoEsperado = true;
        Guarida guarida = new Guarida();

        /* Act */
        guarida.pasar(new Turno(12));

        /* Assert */
        assertEquals(guarida.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirEspiralYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        int resultadoEsperado = false;
        Espiral espiral = new Espiral();

        /* Act */
        espiral.pasar(new Turno(1));

        /* Assert */
        assertEquals(espiral.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeEspiralYDeberiaEstarActivo() {

        /* Arrange */
        int resultadoEsperado = true;
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
        int resultadoEsperado = false;
        NexoMineral nexo = new NexoMineral();

        /* Act */
        nexo.pasar(new Turno(1));

        /* Assert */
        assertEquals(nexo.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeNexoMineralYDeberiaEstarActivo() {

        /* Arrange */
        int resultadoEsperado = true;
        NexoMineral nexo = new NexoMineral();

        /* Act */
        nexo.pasar(new Turno(4));

        /* Assert */
        assertEquals(nexo.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirPilonYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        int resultadoEsperado = false;
        Pilon pilon = new Pilon();

        /* Act */
        pilon.pasar(new Turno(1));

        /* Assert */
        assertEquals(pilon.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyePilonYDeberiaEstarActivo() {

        /* Arrange */
        int resultadoEsperado = true;
        Pilon pilon = new Pilon();

        /* Act */
        pilon.pasar(new Turno(5));

        /* Assert */
        assertEquals(pilon.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirAsimiladorYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        int resultadoEsperado = false;
        Asimilador asimilador = new Asimilador();

        /* Act */
        asimilador.pasar(new Turno(1));

        /* Assert */
        assertEquals(asimilador.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeAsimiladorYDeberiaEstarActivo() {

        /* Arrange */
        int resultadoEsperado = true;
        Asimilador asimilador = new Asimilador();

        /* Act */
        asimilador.pasar(new Turno(6));

        /* Assert */
        assertEquals(asimilador.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirAccesoYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        int resultadoEsperado = false;
        Acceso acceso = new Acceso();

        /* Act */
        acceso.pasar(new Turno(1));

        /* Assert */
        assertEquals(acceso.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyeGuaridaYDeberiaEstarActivo() {

        /* Arrange */
        int resultadoEsperado = true;
        Acceso acceso = new Acceso();

        /* Act */
        acceso.pasar(new Turno(8));

        /* Assert */
        assertEquals(acceso.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeArrancaAConstruirPuertoEstelarYDeberiaEstarInactivoPorFaltaDeTurnos() {

        /* Arrange */
        int resultadoEsperado = false;
        PuertoEstelar puerto = new PuertoEstelar();

        /* Act */
        puerto.pasar(new Turno(1));

        /* Assert */
        assertEquals(puerto.estaDisponible(), resultadoEsperado);
    }

    @Test
    public void SeConstruyePuertoEstelarYDeberiaEstarActivo() {

        /* Arrange */
        int resultadoEsperado = true;
        PuertoEstelar puerto = new PuertoEstelar();

        /* Act */
        puerto.pasar(new Turno(10));

        /* Assert */
        assertEquals(puerto.estaDisponible(), resultadoEsperado);
    }


}
