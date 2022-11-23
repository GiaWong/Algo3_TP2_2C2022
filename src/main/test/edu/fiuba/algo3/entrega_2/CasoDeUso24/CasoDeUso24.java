package edu.fiuba.algo3.entrega_2.CasoDeUso24;

import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso24 {

    @Test
    public void LosJugadoresEmpiezanEnBasesEnExtremosDeMapa(){
        Mapa mapa = new Mapa();
        mapa.inicializarMapa2ConBases();//se inicializa un criadero y un Pilon en las puntas de loss mapas
        assertEquals(true,mapa.hayConstruccion(5,5));
        assertEquals(true,mapa.hayConstruccion(17,17));
    }
}
