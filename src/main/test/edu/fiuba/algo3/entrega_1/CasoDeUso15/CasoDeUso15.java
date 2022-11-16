package edu.fiuba.algo3.entrega_1.CasoDeUso15;

import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
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
    @Test
    public void NexoMineralNDeberiaRecolectarDeUnMineralCuandoElRecursoSAgoto(){//falta hacer el resot de las clases
        int esperado = 0 ;
        Casilla casilla = new Casilla();
        NodoMineral nodo = new NodoMineral();
        casilla.setTerreno(new ConEnergia());
        casilla.setRecurso(nodo);
        NexoMineral nexo = new NexoMineral();
        for(int i = 0; i < 4; i++){
            nexo.construir();
        }

        for(int j = 0; j < 100; j++){
            nexo.recolectar(nodo);
        }
        int resultado = nexo.recolectar(nodo);
        assertEquals(esperado, resultado);
    }
    @Test
    //caso de mineral para los Zergs
    public void ZanganoNoDeberiaRecolectarDeUnMineralCuandoElRecursoSeAgoto(){
       /* int esperado = 0 ;
        Casilla casilla = new Casilla();
        NexoMineral nodo = new NexoMineral();
        casilla.setTerreno(new ConMoho());
        casilla.setRecurso(nodo);
        Criadero criadero = new Criadero();
        Zangano zangano = new Zangano();
        for(int i = 0; i < 4; i++){
            criadero.construir();
        }

        for(int j = 0; j < 350; j++){//350 tiré ese numero a la lazar para qu lo gaste al volcan
            zangano.recolectar(nodo);
        }*/

    }
    @Test
    public void ExtractorNoDeberiaRecolectarDeUnGasVespenoCuandoElREcursoSeAgoto(){
        int esperado = 0 ;
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setTerreno(new ConMoho());
        casilla.setRecurso(volcan);
        Extractor extractor = new Extractor();
        for(int i = 0; i < 6; i++){
            extractor.construir();
        }

        for(int j = 0; j < 350; j++){//350 tiré ese numero a la lazar para qu lo gaste al volcan
            extractor.recolectar(volcan);
        }
        int resultado = extractor.recolectar(volcan);
        assertEquals(esperado, resultado);
    }
    @Test
    public void AsimiladorNoDeberiaRecolectarDeUnGasVespenoCuandoElREcursoSeAgoto(){
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



}
