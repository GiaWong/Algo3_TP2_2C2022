package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionProtoss;

import edu.fiuba.algo3.modelo.RefineriaGas.Asimilador;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/*
Supuesto: - Cada construccion va a tener predefinido en un atributo
la cantidad de turnos que se requiera para que este disponible.
 */


public class ConstruccionProtosTests {
    @Test
    public void SeArrancaAConstruirNexoMineralYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        NexoMineral nexo = new NexoMineral();
        nexo.empezarAConstruirSegun(new Turno(1));
        boolean resultado = nexo.estaDisponible(); /*ver que no se viole el tell dont ask*/

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeNexoMineralYDeberiaEstarActivo() {


        boolean esperado = true;
        NexoMineral nexo = new NexoMineral();
        nexo.empezarAConstruirSegun(new Turno(4));
        boolean resultado = nexo.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirPilonYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Pilon pilon = new Pilon();
        pilon.empezarAConstruirSegun(new Turno(1));
        boolean resultado = pilon.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyePilonYDeberiaEstarActivo() {


        boolean esperado = true;
        Pilon pilon = new Pilon();
        pilon.empezarAConstruirSegun(new Turno(5));
        boolean resultado = pilon.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirAsimiladorYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Asimilador asimilador = new Asimilador();
        asimilador.empezarAConstruirSegun(new Turno(1));
        boolean resultado = asimilador.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeAsimiladorYDeberiaEstarActivo() {


        boolean esperado = true;
        Asimilador asimilador = new Asimilador();
        asimilador.empezarAConstruirSegun(new Turno(6));
        boolean resultado = asimilador.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirAccesoYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Acceso acceso = new Acceso();
        acceso.empezarAConstruirSegun(new Turno(1));
        boolean resultado = acceso.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeAccesoYDeberiaEstarActivo() {


        boolean esperado = true;
        Acceso acceso = new Acceso();
        acceso.empezarAConstruirSegun(new Turno(8));
        boolean resultado = acceso.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirPuertoEstelarYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        PuertoEstelar puerto = new PuertoEstelar();
        puerto.empezarAConstruirSegun(new Turno(1));
        boolean resultado = puerto.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyePuertoEstelarYDeberiaEstarActivo() {


        boolean esperado = true;
        PuertoEstelar puerto = new PuertoEstelar();
        puerto.empezarAConstruirSegun(new Turno(10));
        boolean resultado = puerto.estaDisponible();

        assertEquals(resultado, esperado);
    }
}
