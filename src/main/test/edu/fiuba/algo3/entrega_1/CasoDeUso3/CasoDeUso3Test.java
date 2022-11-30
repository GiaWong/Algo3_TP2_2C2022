package edu.fiuba.algo3.entrega_1.CasoDeUso3;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnVolcan;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso3Test {

    /*
    @Test
    public void SeDeberiaPoderConstruirUnAsimiladorSobreGasVespeno() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConEnergia());
        Asimilador asimilador = new Asimilador();
        assertDoesNotThrow(()->{casilla.agregar(asimilador);});
    }

    @Test
    public void SeDeberiaPoderConstruirUnExtractorSobreGasVespeno() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConMoho());
        Extractor extractor = new Extractor();
        assertDoesNotThrow(()->{casilla.agregar(extractor);});
    }

    @Test
    public void SeIntentaConstruirUnNexoMineralSobreGasVespenoYNoSeDeberiaPoderConstruir() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConEnergia());
        NexoMineral nexo = new NexoMineral();
        casilla.agregar(nexo);
        assertThrows( NoSePuedeConstruirEsteEdificioSobreUnVolcan.class,()->{casilla.agregar(nexo);});
    }

    @Test
    public void SeIntentaConstruirUnPilonSobreGasVespenoYNoSeDeberiaPoderConstruir() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConEnergia());
        Pilon pilon = new Pilon();
        assertThrows( NoSePuedeConstruirEsteEdificioSobreUnVolcan.class,()->{casilla.agregar(pilon);});
    }

    @Test
    public void SeIntentaConstruirUnAccesoSobreGasVespenoYNoSeDeberiaPoderConstruir() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConEnergia());
        Acceso acceso = new Acceso();
        assertThrows( NoSePuedeConstruirEsteEdificioSobreUnVolcan.class,()->{casilla.agregar(acceso);});
    }

    @Test
    public void SeIntentaConstruirUnPuertoEstelarSobreGasVespenoYNoSeDeberiaPoderConstruir() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConEnergia());
        PuertoEstelar puerto = new PuertoEstelar();
        assertThrows( NoSePuedeConstruirEsteEdificioSobreUnVolcan.class,()->{casilla.agregar(puerto);});
    }

    @Test
    public void SeIntentaConstruirUnCriaderoSobreGasVespenoYNoSeDeberiaPoderConstruir() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConMoho());
        Criadero criadero = new Criadero();
        assertThrows( NoSePuedeConstruirEsteEdificioSobreUnVolcan.class,()->{casilla.agregar(criadero);});
    }

    @Test
    public void SeIntentaConstruirUnaReservaSobreGasVespenoYNoSeDeberiaPoderConstruir() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConMoho());
        ReservaProduccion reserva = new ReservaProduccion();
        assertThrows( NoSePuedeConstruirEsteEdificioSobreUnVolcan.class,()->{casilla.agregar(reserva);});
    }

    @Test
    public void SeIntentaConstruirUnaGuaridaSobreGasVespenoYNoSeDeberiaPoderConstruir() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConMoho());
        Guarida guarida = new Guarida();
        assertThrows( NoSePuedeConstruirEsteEdificioSobreUnVolcan.class,()->{casilla.agregar(guarida);});
    }

    @Test
    public void SeIntentaConstruirUnEspiralSobreGasVespenoYNoSeDeberiaPoderConstruir() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConMoho());
        Espiral espiral = new Espiral();
        assertThrows( NoSePuedeConstruirEsteEdificioSobreUnVolcan.class,()->{casilla.agregar(espiral);});
    }

     */

}

