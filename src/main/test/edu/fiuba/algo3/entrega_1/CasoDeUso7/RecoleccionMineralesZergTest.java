package edu.fiuba.algo3.entrega_1.CasoDeUso7;

import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecoleccionMineralesZergTest {


    @Test
    public void ExtraccionMineralesZerg(){
        int esperado = 10 ;
        Zangano zangano = new Zangano();
        Casilla casilla = new Casilla();
        casilla.setTerreno(new ConMoho());
        NodoMineral nodo = new NodoMineral();
        casilla.setRecurso(nodo);
        casilla.agregarUnidad(zangano);
        int resultado = zangano.recolectar(nodo);
        assertEquals(resultado, esperado);
    }


}
