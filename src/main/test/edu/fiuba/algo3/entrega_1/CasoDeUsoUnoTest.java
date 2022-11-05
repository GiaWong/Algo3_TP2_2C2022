package edu.fiuba.algo3.entrega_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUsoUnoTest {

    @Test
    public void CriaderoSeIniciaCon3LarvasYEvolucionaAUnZangano() {

        /* Arrange */
        int resultadoEsperado = 2;
        Criadero criadero = new Criadero();

        /* Act */
        criadero.iniciar(new Larva(3));
        criadero.evolucionar(new Zangano(1));

        /* Assert */
        assertEquals(criadero.obtenerCantidadLarvas(), resultadoEsperado);
    }

    @Test
    public void EvolucionaUnaLarvaDeCriaderoYAlPasarTurnoDeberiaAgregar3LarvasMas() {

        /* Arrange */
        int resultadoEsperado = 5;
        Criadero criadero = new Criadero();

        /* Act */
        criadero.iniciar(new Larva(3));
        criadero.evolucionar(new Zangano(1));
        criadero.pasar(new Turno());

        /* Assert */
        assertEquals(criadero.obtenerCantidadLarvas(), resultadoEsperado);
    }

    @Test
    public void EvolucionanDosLarvasDeCriaderoYAlPasarTurnoDeberiaAgregar3LarvasMas() {

        /* Arrange */
        int resultadoEsperado = 4;
        Criadero criadero = new Criadero();

        /* Act */
        criadero.iniciar(new Larva(3));
        criadero.evolucionar(new Zangano(1));
        criadero.pasar(new Turno());

        /* Assert */
        assertEquals(criadero.obtenerCantidadLarvas(), resultadoEsperado);
    }
}
