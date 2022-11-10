package edu.fiuba.algo3.entrega_1.CasoDeUso7;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Zerg.Zangano;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecoleccionMineralesZergTest {

    @Test
    public void SeUbicaUnZanganoEnUnNodoMineralYPasaUnTurnoYElMineralRecolectadoEsElEsperado(){
        int mineralEsperado = 10;
        Mapa mapa = new Mapa(); //en 1,2 hay un nodo Mineral
        Zangano zangano = new Zangano();
        mapa.agregarUnidad(zangano,1,2); //conecto zangano con el nodo
        zangano.avanzarTurno(1);
        int mineralObtenido = zangano.obtenerMineralRecolectado();
        assertEquals(mineralEsperado,mineralObtenido);
    }

}
