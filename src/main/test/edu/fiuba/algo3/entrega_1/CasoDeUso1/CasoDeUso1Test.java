package edu.fiuba.algo3.entrega_1.CasoDeUso1;

import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Zerg.Larva;
import edu.fiuba.algo3.modelo.Zerg.Zangano;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso1Test {

    @Test
    public void CriaderoSeIniciaCon3LarvasYUnaEvolucionaAUnZangano() {



        int esperado = 2;
        Criadero criadero = new Criadero();
        criadero.iniciar(new Larva(3));
        criadero.evolucionar(new Zangano(1));
        int resultado = criadero.obtenerCantidadLarvas();


        assertEquals(resultado, esperado);
    }

    @Test
    public void EvolucionaUnaLarvaDeCriaderoYAlPasarTurnoDeberiaAgregar3LarvasMas() {

        int esperado = 5;
        Criadero criadero = new Criadero();
        criadero.iniciar(new Larva(3));
        criadero.evolucionar(new Zangano(1));
        criadero.avanzarTurno(1);
        int resultado = criadero.obtenerCantidadLarvas();

        assertEquals(resultado, esperado);

    }

    @Test
    public void EvolucionanDosLarvasDeCriaderoYAlPasarTurnoDeberiaAgregar3LarvasMas() {

        int esperado = 4;
        Criadero criadero = new Criadero();
        criadero.iniciar(new Larva(3));
        criadero.evolucionar(new Zangano(2));
        criadero.avanzarTurno(1);
        int resultado = criadero.obtenerCantidadLarvas();

        assertEquals(resultado, esperado);
    }
}
