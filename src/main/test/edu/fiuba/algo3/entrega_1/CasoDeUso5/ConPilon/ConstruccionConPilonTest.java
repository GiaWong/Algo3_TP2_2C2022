package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConPilon;

import edu.fiuba.algo3.modelo.ConstruccionProtoss.Acceso;
import edu.fiuba.algo3.modelo.ConstruccionProtoss.Asimilador;
import edu.fiuba.algo3.modelo.ConstruccionProtoss.NexoMineral;
import edu.fiuba.algo3.modelo.ConstruccionProtoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Vacio;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinNada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstruccionConPilonTest {

    @Test
    public void SeConstruyeNexoMineralFueraDelRadioQueEnergizaYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new NodoMineral());
        NexoMineral nexoMineral = new NexoMineral();
        casilla.agregar(nexoMineral);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);

    }
    @Test
    public void SeConstruyeAsimiladorFueraDelRadioQueEnergizaYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Volcan());
        Asimilador asimilador = new Asimilador();
        casilla.agregar(asimilador);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);

    }
    @Test
    public void SeConstruyeAccesoFueraDelRadioQueEnergizaYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        Acceso acceso = new Acceso();
        casilla.agregar(acceso);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);

    }
    @Test
    public void SeConstruyePuertoEstelarFueraDelRadioQueEnergizaYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        casilla.agregar(puertoEstelar);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);

    }

}
