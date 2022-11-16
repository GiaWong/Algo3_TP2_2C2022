package edu.fiuba.algo3.entrega_1.CasoDeUso3;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso3Test {

    @Test
    public void SeDeberiaPoderConstruirUnAsimiladorSobreGasVespeno() {

        boolean esperado = true;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConEnergia());
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
        casilla.setTerreno(new ConMoho());
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
        casilla.setTerreno(new ConEnergia());
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
        casilla.setTerreno(new ConEnergia());
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
        casilla.setTerreno(new ConEnergia());
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
        casilla.setTerreno(new ConEnergia());
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
        casilla.setTerreno(new ConMoho());
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
        casilla.setTerreno(new ConMoho());
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
        casilla.setTerreno(new ConMoho());
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
        casilla.setTerreno(new ConMoho());
        Espiral espiral = new Espiral();

        casilla.agregarConstruccion(espiral);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }

    @Test
    public void SeDeberiaPoderConstruirUnNexoMineralSobreNodoMineral() {

        boolean esperado = true;
        Casilla casilla = new Casilla();
        casilla.setRecurso(new NodoMineral());
        casilla.setTerreno(new ConEnergia());
        NexoMineral nexoMineral = new NexoMineral();

        casilla.agregarConstruccion(nexoMineral);
        boolean resultado = casilla.hayConstruccion();

        assertEquals(resultado,esperado);
    }


}

