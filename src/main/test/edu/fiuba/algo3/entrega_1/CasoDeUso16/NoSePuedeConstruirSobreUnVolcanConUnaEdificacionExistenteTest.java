package edu.fiuba.algo3.entrega_1.CasoDeUso16;

import edu.fiuba.algo3.modelo.Imperio.Exceptions.ErrorVolcanOcupado;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Zerg.Extractor;
import edu.fiuba.algo3.modelo.Zerg.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NoSePuedeConstruirSobreUnVolcanConUnaEdificacionExistenteTest {

    //suponemos que no se puede construir ningun edificio sobre otro
    @Test
    public void SeIntentaConstruirUnExtractorSobreUnVolcanOcupadoYSeLanzaUnError() {

        Mapa mapa = new Mapa(); //sabemos que volcan está en 1 y 2 de antemano
        Extractor extractor1 = new Extractor();
        mapa.agregar(extractor1,1,2);
        Extractor extractor2 = new Extractor();
        assertThrows(ErrorVolcanOcupado.class,()->mapa.agregar(extractor2,1,2));
    }

    @Test
    public void SeIntentaConstruirUnNexoMineralConUnZanganoTrabajandoYSeLanzaUnError() {

        Mapa mapa = new Mapa(); //sabemos que el nodo está en 1 y 2 de antemano
        Zangano zangano = new Zangano();
        NexoMineral nexo = new NexoMineral();
        mapa.agregarUnidad(zangano,1,2);
        assertThrows(ErrorVolcanOcupado.class,()->mapa.agregar(nexo,1,2));
    }

    @Test
    public void SeIntentaConstruirUnNexoMineralConUnZanganoTrabajandoYSeLanzaUnError() {

        Mapa mapa = new Mapa(); //sabemos que el nodo está en 1 y 2 de antemano
        Zangano zangano = new Zangano();
        NexoMineral nexo = new NexoMineral();
        mapa.agregarUnidad(nexo,1,2);
        assertThrows(ErrorVolcanOcupado.class,()->mapa.agregar(zangano,1,2));
    }
}
