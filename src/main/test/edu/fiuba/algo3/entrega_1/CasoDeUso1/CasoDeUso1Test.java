package edu.fiuba.algo3.entrega_1.CasoDeUso1;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionesConRadio.Criadero;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal.ConstruccionNormal;
import edu.fiuba.algo3.modelo.Turno.Turno;
import org.junit.jupiter.api.Test;

import javax.script.ScriptEngine;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso1Test {

    @Test
    public void CriaderoSeIniciaCon3LarvasYUnaEvolucionaAUnZangano() {
        Criadero criadero = new Criadero(); //se crea con 3 larvas
        criadero.avanzarTurno();
        criadero.evolucionar();
        int resultado = criadero.obtenerCantidadLarvas();
        assertEquals(2,resultado);

    }

    @Test
    public void EvolucionaUnaLarvaDeCriaderoYAlPasarTurnoDeberiaTener3Larvas() {
        Criadero criadero = new Criadero(); //se crea con 3 larvas
        criadero.evolucionar();
        int resultado = criadero.obtenerCantidadLarvas() ;
        assertEquals(2, resultado);
        criadero.avanzarTurno();
        resultado = criadero.obtenerCantidadLarvas();
        assertEquals(3, resultado);
    }

    @Test
    public void EvolucionanDosLarvasDeCriaderoYAlPasarTurnoDeberiaTener2Larvas() {
        int resultado;
        Criadero criadero = new Criadero(); //se crea con 3 larvas
        criadero.evolucionar();
        criadero.evolucionar();
        criadero.avanzarTurno();
        resultado = criadero.obtenerCantidadLarvas();
        assertEquals(2, resultado);
    }
}
