package edu.fiuba.algo3.entrega_1.CasoDeUso1;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionesConRadio.Criadero;

import edu.fiuba.algo3.modelo.Turno.Turno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso1Test {

    @Test
    public void CriaderoSeIniciaCon3LarvasYUnaEvolucionaAUnZangano() {
        Turno turno = new Turno();
        turno.pasarTurno();


    }


    @Test
    public void CriaderoSeIniciaCon3LarvasYUnaEvolucionaAUnZangano() {

        int esperado = 2;
        Criadero criadero = new Criadero(); //se crea con 3 larvas
        criadero.avanzarTurno(4); //criadero empieza a funcionar en el turno 4
        criadero.evolucionar(1);
        int resultado = criadero.obtenerCantidadLarvas();
        assertEquals(resultado, esperado);
    }

    @Test
    public void EvolucionaUnaLarvaDeCriaderoYAlPasarTurnoDeberiaTener3Larvas() {

        int esperado = 3;
        Criadero criadero = new Criadero();
        criadero.avanzarTurno(4);
        criadero.evolucionar(1);
        criadero.avanzarTurno(1); //nace una nueva larva y ahora son 3
        int resultado = criadero.obtenerCantidadLarvas();
        assertEquals(resultado, esperado);
    }

    @Test
    public void EvolucionanDosLarvasDeCriaderoYAlPasarTurnoDeberiaTener2Larvas() {

        int esperado = 2;
        Criadero criadero = new Criadero();
        criadero.avanzarTurno(4);
        criadero.evolucionar(2);
        criadero.avanzarTurno(1);
        int resultado = criadero.obtenerCantidadLarvas();
        assertEquals(resultado, esperado);
    }

     */
}
