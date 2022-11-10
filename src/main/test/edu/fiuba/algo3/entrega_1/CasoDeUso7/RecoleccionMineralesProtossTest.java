package edu.fiuba.algo3.entrega_1.CasoDeUso7;


import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecoleccionMineralesProtossTest {

    @Test
    public void SeCreaNexoMineralYPasaUnTurnoYElMineralRecolectadoEsElEsperado(){
        int mineralEsperado = 20;
        Mapa mapa = new Mapa(); //en 1,2 hay un nodo Mineral
        NexoMineral nexo = new NexoMineral();
        mapa.agregar(nexo,0,2);
        nexo.avanzarTurno(5); //4 para que empiece a funcionar + 1 para que recolecte
        int mineralObtenido = nexo.obtenerMineralRecolectado();
        assertEquals(mineralEsperado,mineralObtenido);
    }
}
