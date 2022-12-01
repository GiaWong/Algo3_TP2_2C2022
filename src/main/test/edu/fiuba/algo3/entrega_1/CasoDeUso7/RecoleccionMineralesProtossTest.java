package edu.fiuba.algo3.entrega_1.CasoDeUso7;


import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecoleccionMineralesProtossTest {

    @Test
    public void ExtraccionMineralesProtoss() throws EdificioNoEstaOperativo {
        int esperado = 20 ;
        Casilla casilla = new Casilla();
        NodoMineral nodo = new NodoMineral();
        casilla.setTerreno(new ConEnergia());
        casilla.setRecurso(nodo);
        NexoMineral nexo = new NexoMineral();
        for(int i = 0; i < 4; i++){
            nexo.avanzarTurno();
        }

        int resultado = nexo.recolectar(nodo);
        assertEquals(resultado, esperado);
    }
}
