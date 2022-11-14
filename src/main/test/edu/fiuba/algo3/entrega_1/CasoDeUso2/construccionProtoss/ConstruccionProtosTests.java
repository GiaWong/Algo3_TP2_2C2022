package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionProtoss;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionesConRadio.Criadero;
import edu.fiuba.algo3.modelo.Construccion.RefineriaGas.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal.Acceso;
import edu.fiuba.algo3.modelo.Construccion.RefineriaMineral.NexoMineral;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal.PuertoEstelar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConstruccionProtosTests {

    @Test
    public void SeArrancaAConstruirNexoMineralYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        NexoMineral nexo = new NexoMineral();
        nexo.avanzarTurno();
        esperado= nexo.estaDisponible();
        assertEquals(false,esperado);
    }

    @Test
    public void SeConstruyeNexoMineralYDeberiaEstarActivo() {


        boolean esperado = true;
        NexoMineral nexoMineral = new NexoMineral();
        for(int i =0 ; i<=3;i++) {

            nexoMineral.avanzarTurno();
        }
        esperado = nexoMineral.estaDisponible();
        assertEquals(true,esperado);
    }

    @Test
    public void SeArrancaAConstruirPilonYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Pilon pilon = new Pilon();
        pilon.avanzarTurno();
        esperado= pilon.estaDisponible();
        assertEquals(false,esperado);
    }

    @Test
    public void SeConstruyePilonYDeberiaEstarActivo() {


        boolean esperado = true;
            Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {

            pilon.avanzarTurno();
        }
        esperado = pilon.estaDisponible();
        assertEquals(true,esperado);
    }

    @Test
    public void SeArrancaAConstruirAsimiladorYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Asimilador asimilador = new Asimilador();
        asimilador.avanzarTurno();
        esperado= asimilador.estaDisponible();
        assertEquals(false,esperado);
    }

    @Test
    public void SeConstruyeAsimiladorYDeberiaEstarActivo() {


        boolean esperado = true;
        Asimilador asimilador = new Asimilador();
        for(int i =0 ; i<=5;i++) {

            asimilador.avanzarTurno();
        }
        esperado = asimilador.estaDisponible();
        assertEquals(true,esperado);
    }

    @Test
    public void SeArrancaAConstruirAccesoYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Acceso acceso = new Acceso();
        acceso.avanzarTurno();
        esperado= acceso.estaDisponible();
        assertEquals(false,esperado);
    }

    @Test
    public void SeConstruyeAccesoYDeberiaEstarActivo() {


        boolean esperado = true;
        Acceso acceso = new Acceso();
        for(int i =0 ; i<=7;i++) {

            acceso.avanzarTurno();
        }
        esperado = acceso.estaDisponible();
        assertEquals(true,esperado);
    }

    @Test
    public void SeArrancaAConstruirPuertoEstelarYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        PuertoEstelar puerto = new PuertoEstelar();
        puerto.avanzarTurno();
        esperado= puerto.estaDisponible();
        assertEquals(false,esperado);
    }

    @Test
    public void SeConstruyePuertoEstelarYDeberiaEstarActivo() {

        boolean esperado = true;
        PuertoEstelar puerto = new PuertoEstelar();
        for(int i =0 ; i<=10;i++) {

            puerto.avanzarTurno();
        }
        esperado = puerto.estaDisponible();
        assertEquals(true,esperado);
    }
}
