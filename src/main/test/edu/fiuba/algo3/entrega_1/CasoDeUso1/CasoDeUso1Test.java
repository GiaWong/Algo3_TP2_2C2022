package edu.fiuba.algo3.entrega_1.CasoDeUso1;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso1Test {

    @Test
    public void CriaderoSeIniciaCon3LarvasYUnaEvolucionaAUnZangano() {
        Criadero criaderoUno = new Criadero(0); //se crea con 3 larvas
        Criadero criaderoDos = new Criadero(0);
        Zangano zangano = criaderoDos.evolucionarLarva();
        assertFalse(criaderoUno.equals(criaderoDos));

    }

    @Test
    public void EvolucionaUnaLarvaDeCriaderoYAlPasarTurnoDeberiaTener3Larvas() {
        Criadero criaderoUno = new Criadero(0); //se crea con 3 larvas
        Criadero criaderoDos = new Criadero(0);
        Zangano zangano = criaderoUno.evolucionarLarva();
        criaderoDos.avanzarTurno();
        assertTrue( criaderoUno.equals(criaderoDos) );
    }

    @Test
    public void EvolucionanDosLarvasDeCriaderoYAlPasarTurnoDeberiaTener2Larvas() {
        Criadero criaderoUno = new Criadero(0); //se crea con 3 larvas
        Criadero criaderoDos = new Criadero(0);
        Zangano zanganoUno = criaderoUno.evolucionarLarva();
        Zangano zanganoDos = criaderoUno.evolucionarLarva();
        criaderoUno.avanzarTurno();
        assertFalse(  criaderoUno.equals(criaderoDos) );
    }
}
