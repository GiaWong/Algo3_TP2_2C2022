package edu.fiuba.algo3.entrega_1.CasoDeUso1;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.NoHayLarvasDisponiblesParaEvolucionar;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso1Test {

    @Test
    public void CriaderoSeIniciaCon3LarvasYUnaEvolucionaAUnZangano() throws NoHayLarvasDisponiblesParaEvolucionar, EdificioNoEstaOperativo {
        Criadero criaderoUno = new Criadero(0); //se crea con 3 larvas
        Criadero criaderoDos = new Criadero(0);
        Unidad zangano = criaderoDos.evolucionarLarva();
        assertFalse(criaderoUno.equals(criaderoDos));
    }

    @Test
    public void EvolucionaUnaLarvaDeCriaderoYAlPasarTurnoDeberiaTener3Larvas() throws NoHayLarvasDisponiblesParaEvolucionar, EdificioNoEstaOperativo {
        Criadero criaderoUno = new Criadero(0); //se crea con 3 larvas
        Criadero criaderoDos = new Criadero(0);
        Unidad zangano = criaderoUno.evolucionarLarva();
        criaderoDos.avanzarTurno();
        assertTrue( criaderoUno.equals(criaderoDos) );
    }

    @Test
    public void EvolucionanDosLarvasDeCriaderoYAlPasarTurnoDeberiaTener2Larvas() throws NoHayLarvasDisponiblesParaEvolucionar, EdificioNoEstaOperativo {
        Criadero criaderoUno = new Criadero(0); //se crea con 3 larvas
        Criadero criaderoDos = new Criadero(0);
        Unidad zanganoUno = criaderoUno.evolucionarLarva();
        Unidad zanganoDos = criaderoUno.evolucionarLarva();
        criaderoUno.avanzarTurno();
        assertFalse( criaderoUno.equals(criaderoDos) );
    }
}
