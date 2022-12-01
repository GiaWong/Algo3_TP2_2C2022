package edu.fiuba.algo3.entrega_1.CasoDeUso16;

import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupada;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupadaPorZangano;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso16 {
    @Test
    public void NoSeDeberiaPoderConstruirUnAsimiladorSobreExtractor() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new Volcan());
        casilla.setTerreno(new ConEnergia());
        Asimilador asimilador = new Asimilador();
        casilla.agregar(asimilador);
        Extractor extractor = new Extractor();

        assertThrows(CasillaOcupada.class,()->casilla.agregar(extractor));
    }

    @Test
    public void NoSeDeberiaPoderConstruirUnNexoMineralSobreUnZangano() {
        Casilla casilla = new Casilla();
        casilla.setRecurso(new NodoMineral());
        casilla.setTerreno(new ConEnergia());
        Zangano zangano = new Zangano();
        casilla.agregar(zangano);
        NexoMineral nexo = new NexoMineral();

        assertThrows(CasillaOcupadaPorZangano.class,()->casilla.agregar(nexo));

    }
}
