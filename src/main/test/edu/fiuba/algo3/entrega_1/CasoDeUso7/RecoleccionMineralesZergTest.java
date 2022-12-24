package edu.fiuba.algo3.entrega_1.CasoDeUso7;

import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
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
        zangano.construir();
        Casilla casilla = new Casilla(new Coordenada(5,5));
        casilla.setTerreno(new ConMoho());
        NodoMineral nodo = new NodoMineral();
        casilla.setRecurso(nodo);
        casilla.agregar(zangano);
        int resultado = zangano.recolectar(nodo);
        assertEquals(resultado, esperado);
    }

}
