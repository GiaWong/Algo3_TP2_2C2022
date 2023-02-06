package edu.fiuba.algo3.entrega_1.CasoDeUso1;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class CasoDeUso1Test {

    Mapa mapa = mock(Mapa.class);


    @Test
    public void CriaderoSeIniciaCon3Larvas() throws EdificioNoEstaOperativo {
        Criadero criadero = new Criadero(0);
        assertTrue(criadero.tieneMismaCantidadDeLarvas(3));
    }

    @Test
    public void EvolucionaUnaLarvaDelCriaderoYLeDebenQuedar2Larvas() throws EdificioNoEstaOperativo {
        BancoDeRecursos bancoDeRecursos = new BancoDeRecursos();
        Criadero criadero = new Criadero(0);
        Unidad zangano1 = criadero.crearZangano(bancoDeRecursos);
        assertNotNull(zangano1);
        assertTrue(criadero.tieneMismaCantidadDeLarvas(2));

    }

    @Test
    public void EvolucionanDosLarvasDeCriaderoYDebeQuedar1Larva() throws EdificioNoEstaOperativo {
        BancoDeRecursos bancoDeRecursos = new BancoDeRecursos();
        Criadero criadero = new Criadero(0); //se crea con 3 larvas

        Unidad zangano1 = criadero.crearZangano(bancoDeRecursos);
        Unidad zangano2 = criadero.crearZangano(bancoDeRecursos);

        assertNotNull(zangano1);
        assertNotNull(zangano2);
        assertTrue(criadero.tieneMismaCantidadDeLarvas(1));
    }

    @Test
    public void EvolucionanTresLarvasDeCriaderoYNoDebenQuedarLarvas() throws EdificioNoEstaOperativo {
        BancoDeRecursos bancoDeRecursos = new BancoDeRecursos();
        Criadero criadero = new Criadero(0); //se crea con 3 larvas

        Unidad zangano1 = criadero.crearZangano(bancoDeRecursos);
        Unidad zangano2 = criadero.crearZangano(bancoDeRecursos);
        Unidad zangano3 = criadero.crearZangano(bancoDeRecursos);

        assertNotNull(zangano1);
        assertNotNull(zangano2);
        assertNotNull(zangano3);
        assertTrue(criadero.tieneMismaCantidadDeLarvas(0));
    }


    @Test
    public void EvolucionanTresLarvasDeCriaderoYAlPasarUnTurnoDebeQuedar1Larva() throws EdificioNoEstaOperativo {
        BancoDeRecursos bancoDeRecursos = new BancoDeRecursos();
        Criadero criadero = new Criadero(0); //se crea con 3 larvas

        Unidad zangano1 = criadero.crearZangano(bancoDeRecursos);
        Unidad zangano2 = criadero.crearZangano(bancoDeRecursos);
        Unidad zangano3 = criadero.crearZangano(bancoDeRecursos);

        criadero.avanzarTurno(mapa);
        assertNotNull(zangano1);
        assertNotNull(zangano2);
        assertNotNull(zangano3);
        assertTrue(criadero.tieneMismaCantidadDeLarvas(1));
    }

    @Test
    public void EvolucionanTresLarvasDeCriaderoYAlPasarDosTurnosDebeQuedar2Larvas() throws EdificioNoEstaOperativo {
        BancoDeRecursos bancoDeRecursos = new BancoDeRecursos();
        Criadero criadero = new Criadero(0); //se crea con 3 larvas

        Unidad zangano1 = criadero.crearZangano(bancoDeRecursos);
        Unidad zangano2 = criadero.crearZangano(bancoDeRecursos);
        Unidad zangano3 = criadero.crearZangano(bancoDeRecursos);

        criadero.avanzarTurno(mapa);
        criadero.avanzarTurno(mapa);
        assertNotNull(zangano1);
        assertNotNull(zangano2);
        assertNotNull(zangano3);
        assertTrue(criadero.tieneMismaCantidadDeLarvas(2));
    }

    @Test
    public void EvolucionanTresLarvasDeCriaderoYAlPasar3TurnosDebenQuedar3Larvas() throws EdificioNoEstaOperativo {
        BancoDeRecursos bancoDeRecursos = new BancoDeRecursos();
        Criadero criadero = new Criadero(0); //se crea con 3 larvas

        Unidad zangano1 = criadero.crearZangano(bancoDeRecursos);
        Unidad zangano2 = criadero.crearZangano(bancoDeRecursos);
        Unidad zangano3 = criadero.crearZangano(bancoDeRecursos);

        criadero.avanzarTurno(mapa);
        criadero.avanzarTurno(mapa);
        criadero.avanzarTurno(mapa);

        assertNotNull(zangano1);
        assertNotNull(zangano2);
        assertNotNull(zangano3);
        assertTrue(criadero.tieneMismaCantidadDeLarvas(3));
    }




}
