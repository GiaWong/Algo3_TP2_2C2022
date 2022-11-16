package edu.fiuba.algo3.entrega_1.CasoDeUso15;

import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso15 {
    @Test
    public void NoSeDeberiaPoderRecolectarDeUnMineral(){//falta hacer el resot de las clases
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


}
