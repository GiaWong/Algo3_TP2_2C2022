package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Protoss.Criadero;
import edu.fiuba.algo3.modelo.Zerg.Larva;
import edu.fiuba.algo3.modelo.Zerg.Zangano;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso1Test {

    @Test
    public void CriaderoSeIniciaCon3LarvasYEvolucionaAUnZangano() {

        int resultado = 2;
        Criadero criadero = new Criadero();

        criadero.iniciar(new Larva(3));
        criadero.evolucionar(new Zangano(1));
        int esperado = criadero.obtenerCantidadLarvas();

        assertEquals(esperado, resultado);
    }

    @Test
    public void EvolucionaUnaLarvaDeCriaderoYAlPasarTurnoDeberiaAgregar3LarvasMas() {


        int resultado = 5;
        Criadero criadero = new Criadero();

        criadero.iniciar(new Larva(3));
        criadero.evolucionar(new Zangano(1));
        criadero.conTurno(new Turno(1));
        int esperado = criadero.obtenerCantidadLarvas();

        assertEquals(esperado, resultado);

    }

    @Test
    public void EvolucionanDosLarvasDeCriaderoYAlPasarTurnoDeberiaAgregar3LarvasMas() {


        int resultado = 4;
        Criadero criadero = new Criadero();

        criadero.iniciar(new Larva(3));
        criadero.evolucionar(new Zangano(1));
        criadero.conTurno(new Turno(1));
        int esperado = criadero.obtenerCantidadLarvas();

        assertEquals(esperado, resultado);
    }
}
