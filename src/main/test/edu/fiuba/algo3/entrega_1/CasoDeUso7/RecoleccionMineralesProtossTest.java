package edu.fiuba.algo3.entrega_1.CasoDeUso7;


import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecoleccionMineralesProtossTest {


    @Test
    public void ExtraccionMineralesProtoss(){
        int esperado = 20 ;
        NexoMineral nexo = new NexoMineral();
        Casilla casilla = new Casilla();
        casilla.setTerreno(new ConEnergia());
        NodoMineral nodo = new NodoMineral();
        casilla.setRecurso(nodo);
        for (int i = 0; i < 4; i++){
            nexo.construir();
        }
        casilla.agregarConstruccion(nexo);
        int resultado = nexo.recolectar(nodo);
        assertEquals(resultado, esperado);
    }


}
