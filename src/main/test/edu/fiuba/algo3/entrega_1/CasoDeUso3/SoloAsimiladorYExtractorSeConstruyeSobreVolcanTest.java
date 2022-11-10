package edu.fiuba.algo3.entrega_1.CasoDeUso3;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Imperio.Exceptions.ErrorNoEsPosibleConstruir;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;

import edu.fiuba.algo3.modelo.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Zerg.ReservaProduccion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SoloAsimiladorYExtractorSeConstruyeSobreVolcanTest {


    @Test
    public void SeIntentaConstruirUnaReservaSobreUnVolcanYSeLanzaUnError() {

        Mapa mapa = new Mapa(); //sabemos que volcan está en 1 y 2 de antemano
        ReservaProduccion reservaProduccion = new ReservaProduccion();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(reservaProduccion,0,2));
    }

    @Test
    public void SeIntentaConstruirUnCriaderoSobreUnVolcanYSeLanzaUnError() {

        Mapa mapa = new Mapa(); //sabemos que volcan está en 1 y 2 de antemano
        Criadero criadero = new Criadero();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(criadero,0,2));
    }

    @Test
    public void SeIntentaConstruirUnaGuaridaSobreUnVolcanYSeLanzaUnError() {

        Mapa mapa = new Mapa(); //sabemos que volcan está en 1 y 2 de antemano
        Guarida guarida = new Guarida();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(guarida,0,2));
    }

    @Test
    public void SeIntentaConstruirUnNexoMineralSobreUnVolcanYSeLanzaUnError() {

        Mapa mapa = new Mapa(); //sabemos que volcan está en 1 y 2 de antemano
        NexoMineral nexo = new NexoMineral();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(nexo,0,2));
    }

    @Test
    public void SeIntentaConstruirUnPilonSobreUnVolcanYSeLanzaUnError() {

        Mapa mapa = new Mapa(); //sabemos que volcan está en 1 y 2 de antemano
        Pilon pilon = new Pilon();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(pilon,0,2));
    }

    @Test
    public void SeIntentaConstruirUnAccesoSobreUnVolcanYSeLanzaUnError() {

        Mapa mapa = new Mapa(); //sabemos que volcan está en 1 y 2 de antemano
        Acceso acceso = new Acceso();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(acceso,0,2));
    }

    @Test
    public void SeIntentaConstruirUnaPuertaEstelarSobreUnVolcanYSeLanzaUnError() {

        Mapa mapa = new Mapa(); //sabemos que volcan está en 1 y 2 de antemano
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(puertoEstelar,0,2));
    }


}

