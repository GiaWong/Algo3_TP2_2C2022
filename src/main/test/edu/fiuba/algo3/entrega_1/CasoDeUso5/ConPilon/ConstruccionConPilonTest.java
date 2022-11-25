package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConPilon;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstruccionConPilonTest {

    @Test
    public void SeConstruyeNexoMineralFueraDelRadioQueEnergizaYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinTerreno());
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
        casilla.setTerreno(new SinTerreno());
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
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new SinRecurso());
        Acceso acceso = new Acceso();
        casilla.agregar(acceso);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);

    }
    @Test
    public void SeConstruyePuertoEstelarFueraDelRadioQueEnergizaYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new SinRecurso());
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        casilla.agregar(puertoEstelar);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);

    }

}
