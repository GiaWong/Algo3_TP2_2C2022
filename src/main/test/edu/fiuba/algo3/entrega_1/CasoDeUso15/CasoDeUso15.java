package edu.fiuba.algo3.entrega_1.CasoDeUso15;

import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso15 {


    // Caso mineral para Protoss
    @Test
    public void NexoMineralNoDeberiaRecolectarDeUnMineralCuandoElRecursoSeAgoto(){//falta hacer el resot de las clases
        int esperado = 0;
        Casilla casilla = new Casilla();
        NodoMineral nodo = new NodoMineral();
        casilla.setTerreno(new ConEnergia());
        casilla.setRecurso(nodo);
        NexoMineral nexo = new NexoMineral();
        for(int i = 0; i < 4; i++){
            nexo.construir();
        }
        casilla.agregar(nexo);
        for(int j = 0; j < 100; j++){
            nexo.recolectar(nodo);
        }
        int resultado = nexo.recolectar(nodo);
        assertEquals(esperado, resultado);
    }

    // Caso de mineral para los Zerg
    @Test
    public void ZanganoNoDeberiaRecolectarDeUnMineralCuandoElRecursoSeAgoto(){
        int esperado = 0 ;
        Casilla casilla = new Casilla();
        NodoMineral nodo = new NodoMineral();
        casilla.setTerreno(new ConMoho());
        casilla.setRecurso(nodo);
        Zangano zangano = new Zangano();
        casilla.agregar(zangano);

        for(int j = 0; j < 200; j++){
            zangano.recolectar(nodo);
        }
        int resultado = zangano.recolectar(nodo);
        assertEquals(esperado, resultado);

    }

    // Caso de gas para los Protoss
    @Test
    public void AsimiladorNoDeberiaRecolectarDeUnGasVespenoCuandoElRecursoSeAgoto(){
        int esperado = 0 ;
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setTerreno(new ConEnergia());
        casilla.setRecurso(volcan);
        Asimilador asimilador = new Asimilador();
        for(int i = 0; i < 6; i++){
            asimilador.construir();
        }

        for(int j = 0; j < 350; j++){
            asimilador.recolectar(volcan);
        }
        int resultado = asimilador.recolectar(volcan);
        assertEquals(esperado, resultado);
    }

    // Caso de gas para los Zerg
    @Test
    public void ExtractorNoDeberiaRecolectarDeUnGasVespenoCuandoElRecursoSeAgoto(){
        /*
        int esperado = 0 ;
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setTerreno(new ConMoho());
        casilla.setRecurso(volcan);
        Extractor extractor = new Extractor();
        for(int i = 0; i < 6; i++){
            extractor.construir();
        }
        extractor.agregar(new Zangano());
        extractor.agregar(new Zangano());
        extractor.agregar(new Zangano());
        for(int j = 0; j < 200; j++){
            extractor.recolectar(volcan);
        }
        int resultado = extractor.recolectar(volcan);
        assertEquals(esperado, resultado);

         */
    }
}
