package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionProtoss;

import edu.fiuba.algo3.modelo.ConstruccionProtoss.Asimilador;
import edu.fiuba.algo3.modelo.ConstruccionProtoss.Acceso;
import edu.fiuba.algo3.modelo.ConstruccionProtoss.NexoMineral;
import edu.fiuba.algo3.modelo.ConstruccionProtoss.Pilon;
import edu.fiuba.algo3.modelo.ConstruccionProtoss.PuertoEstelar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConstruccionProtosTests {

    @Test
    public void SeArrancaAConstruirNexoMineralYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        NexoMineral nexo = new NexoMineral();
        nexo.construir();
        boolean resultado = nexo.estaDisponible();
        assertEquals(resultado,esperado);
    }

    @Test
    public void SeConstruyeNexoMineralYDeberiaEstarActivo() {


        boolean esperado = true;
        NexoMineral nexoMineral = new NexoMineral();
        for(int i =0 ; i<=3;i++) {
            nexoMineral.construir();
        }
        boolean resultado = nexoMineral.estaDisponible();
        assertEquals(resultado,esperado);
    }

    @Test
    public void SeArrancaAConstruirPilonYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Pilon pilon = new Pilon();
        pilon.construir();
        boolean resultado = pilon.estaDisponible();
        assertEquals(resultado,esperado);
    }

    @Test
    public void SeConstruyePilonYDeberiaEstarActivo() {


        boolean esperado = true;
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {

            pilon.construir();
        }
        boolean resultado = pilon.estaDisponible();
        assertEquals(resultado,esperado);
    }

    @Test
    public void SeArrancaAConstruirAsimiladorYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Asimilador asimilador = new Asimilador();
        asimilador.construir();
        boolean resultado = asimilador.estaDisponible();
        assertEquals(resultado,esperado);
    }

    @Test
    public void SeConstruyeAsimiladorYDeberiaEstarActivo() {


        boolean esperado = true;
        Asimilador asimilador = new Asimilador();
        for(int i =0 ; i<=5;i++) {

            asimilador.construir();
        }
        boolean resultado = asimilador.estaDisponible();
        assertEquals(resultado,esperado);
    }

    @Test
    public void SeArrancaAConstruirAccesoYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Acceso acceso = new Acceso();
        acceso.construir();
        boolean resultado = acceso.estaDisponible();
        assertEquals(resultado,esperado);
    }

    @Test
    public void SeConstruyeAccesoYDeberiaEstarActivo() {


        boolean esperado = true;
        Acceso acceso = new Acceso();
        for(int i =0 ; i<=7;i++) {

            acceso.construir();
        }
        boolean resultado = acceso.estaDisponible();
        assertEquals(resultado,esperado);
    }

    @Test
    public void SeArrancaAConstruirPuertoEstelarYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        PuertoEstelar puerto = new PuertoEstelar();
        puerto.construir();
        boolean resultado = puerto.estaDisponible();
        assertEquals(resultado,esperado);
    }

    @Test
    public void SeConstruyePuertoEstelarYDeberiaEstarActivo() {

        boolean esperado = true;
        PuertoEstelar puerto = new PuertoEstelar();
        for(int i =0 ; i<=10;i++) {

            puerto.construir();
        }
        boolean resultado = puerto.estaDisponible();
        assertEquals(resultado,esperado);
    }
}
