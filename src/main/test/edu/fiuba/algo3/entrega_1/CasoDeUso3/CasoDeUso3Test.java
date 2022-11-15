package edu.fiuba.algo3.entrega_1.CasoDeUso3;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.ConNodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.ConVolcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso3Test {

    @Test
    public void SeDeberiaPoderConstruirUnAsimiladorSobreGasVespeno() {

        boolean esperado = true;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        Asimilador asimilador = new Asimilador();

        casilla.agregarConstruccion(asimilador);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeDeberiaPoderConstruirUnExtractorSobreGasVespeno() {

        boolean esperado = true;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        Extractor extractor = new Extractor();

        casilla.agregarConstruccion(extractor);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnNexoMineralSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        NexoMineral nexo = new NexoMineral();

        casilla.agregarConstruccion(nexo);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnPilonSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        Pilon pilon = new Pilon();

        casilla.agregarConstruccion(pilon);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnAccesoSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        Acceso acceso = new Acceso();

        casilla.agregarConstruccion(acceso);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnPuertoEstelarSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        PuertoEstelar puerto = new PuertoEstelar();

        casilla.agregarConstruccion(puerto);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnCriaderoSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        Criadero criadero = new Criadero();

        casilla.agregarConstruccion(criadero);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnaReservaSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        ReservaProduccion reserva = new ReservaProduccion();

        casilla.agregarConstruccion(reserva);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnaGuaridaSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        Guarida guarida = new Guarida();

        casilla.agregarConstruccion(guarida);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeIntentaConstruirUnEspiralSobreGasVespenoYNoSeDeberiaPoderConstruir() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        Espiral espiral = new Espiral();

        casilla.agregarConstruccion(espiral);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeDeberiaPoderConstruirUnNexoMineralSobreNodoMineral() {

        boolean esperado = true;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        NexoMineral nexoMineral = new NexoMineral();

        casilla.agregarConstruccion(nexoMineral);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }


}

