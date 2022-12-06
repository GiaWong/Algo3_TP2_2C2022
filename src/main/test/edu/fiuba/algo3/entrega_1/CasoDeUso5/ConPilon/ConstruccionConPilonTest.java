package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConPilon;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.NoEstaEnergizado;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class ConstruccionConPilonTest {

    Coordenada coord = mock(Coordenada.class);
    @Test
    public void SeConstruyeNexoMineralFueraDelRadioQueEnergizaYTiraError() {
        Casilla casilla = new Casilla(coord);
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new NodoMineral());
        NexoMineral nexoMineral = new NexoMineral();
        assertThrows( NoEstaEnergizado.class,()->casilla.agregar(nexoMineral));

    }
    @Test
    public void SeConstruyeAsimiladorFueraDelRadioQueEnergizaYTiraError() {

        Casilla casilla = new Casilla(coord);
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new Volcan());
        Asimilador asimilador = new Asimilador();
        assertThrows( NoEstaEnergizado.class,()-> casilla.agregar(asimilador));

    }
    @Test
    public void SeConstruyeAccesoFueraDelRadioQueEnergizaYNoSeDeberiaPoder() {
        Casilla casilla = new Casilla(coord);
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new SinRecurso());
        Acceso acceso = new Acceso();
        assertThrows( NoEstaEnergizado.class,()->casilla.agregar(acceso));

    }
    @Test
    public void SeConstruyePuertoEstelarFueraDelRadioQueEnergizaYNoSeDeberiaPoder() {
        Casilla casilla = new Casilla(coord);
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new SinRecurso());
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        assertThrows( NoEstaEnergizado.class,()->casilla.agregar(puertoEstelar));

    }

}
