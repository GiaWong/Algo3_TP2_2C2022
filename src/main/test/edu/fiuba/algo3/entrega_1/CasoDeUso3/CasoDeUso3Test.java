package edu.fiuba.algo3.entrega_1.CasoDeUso3;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.ConNodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.ConVolcan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso3Test {

    @Test
    public void SeDeberiaPoderConstruirUnAsimiladorSobreGasVespeno() {

        boolean esperado = true;
        Casilla conVolcan = new ConVolcan();
        Asimilador asimilador = new Asimilador();

        conVolcan.agregarConstruccion(asimilador);
        boolean resultado = conVolcan.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeDeberiaPoderConstruirUnExtractorSobreGasVespeno() {

        boolean esperado = true;
        Casilla conVolcan = new ConVolcan();
        Extractor extractor = new Extractor();

        conVolcan.agregarConstruccion(extractor);
        boolean resultado = conVolcan.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnNexoMineralSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla conVolcan = new ConVolcan();
        NexoMineral nexo = new NexoMineral();

        conVolcan.agregarConstruccion(nexo);
        boolean resultado = conVolcan.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnPilonSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla conVolcan = new ConVolcan();
        Pilon pilon = new Pilon();

        conVolcan.agregarConstruccion(pilon);
        boolean resultado = conVolcan.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnAccesoSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla conVolcan = new ConVolcan();
        Acceso acceso = new Acceso();

        conVolcan.agregarConstruccion(acceso);
        boolean resultado = conVolcan.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnPuertoEstelarSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla conVolcan = new ConVolcan();
        PuertoEstelar puerto = new PuertoEstelar();

        conVolcan.agregarConstruccion(puerto);
        boolean resultado = conVolcan.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnCriaderoSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla conVolcan = new ConVolcan();
        Criadero criadero = new Criadero();

        conVolcan.agregarConstruccion(criadero);
        boolean resultado = conVolcan.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnaReservaSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla conVolcan = new ConVolcan();
        ReservaProduccion reserva = new ReservaProduccion();

        conVolcan.agregarConstruccion(reserva);
        boolean resultado = conVolcan.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnaGuaridaSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla conVolcan = new ConVolcan();
        Guarida guarida = new Guarida();

        conVolcan.agregarConstruccion(guarida);
        boolean resultado = conVolcan.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnEspiralSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla conVolcan = new ConVolcan();
        Espiral espiral = new Espiral();

        conVolcan.agregarConstruccion(espiral);
        boolean resultado = conVolcan.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeDeberiaPoderConstruirUnNexoMineralSobreNodoMineral() {

        boolean esperado = true;
        Casilla conNodo = new ConNodoMineral();
        NexoMineral nexoMineral = new NexoMineral();

        conNodo.agregarConstruccion(nexoMineral);
        boolean resultado = conNodo.hayConstruccion();

        assertEquals(resultado,esperado);
    }


}

