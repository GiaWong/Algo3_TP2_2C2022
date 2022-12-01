package edu.fiuba.algo3.entrega_1.CasoDeUso1;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.NoHayLarvasDisponiblesParaEvolucionar;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso1Test {

    @Test
    public void CriaderoSeIniciaCon3LarvasYUnaEvolucionaAUnZangano() throws EdificioNoEstaOperativo {
        BancoDeRecursos bancoDeRecursos = new BancoDeRecursos();
        Criadero criadero = new Criadero(0); //se crea con 3 larvas

        Unidad zangano = criadero.evolucionarLarva(bancoDeRecursos);

        assertNotEquals(null, zangano);

    }

    @Test
    public void EvolucionaUnaLarvaDeCriaderoYAlPasarTurnoDeberiaTener3Larvas() throws EdificioNoEstaOperativo {
        BancoDeRecursos bancoDeRecursos = new BancoDeRecursos();
        Criadero criadero = new Criadero(0); //se crea con 3 larvas

        Unidad zangano1 = criadero.evolucionarLarva(bancoDeRecursos);
        criadero.avanzarTurno();

        assertNotEquals(null, zangano1);
        assertTrue(criadero.tieneMismaCantidadDeLarvas(3));

    }

    @Test
    public void EvolucionanDosLarvasDeCriaderoYAlPasarTurnoDeberiaTener2Larvas() throws EdificioNoEstaOperativo {
        BancoDeRecursos bancoDeRecursos = new BancoDeRecursos();
        Criadero criadero = new Criadero(0); //se crea con 3 larvas

        Unidad zangano1 = criadero.evolucionarLarva(bancoDeRecursos);
        Unidad zangano2 = criadero.evolucionarLarva(bancoDeRecursos);
        criadero.avanzarTurno();

        assertNotEquals(null, zangano1);
        assertNotEquals(null, zangano2);
        assertTrue(criadero.tieneMismaCantidadDeLarvas(2));
    }


}
