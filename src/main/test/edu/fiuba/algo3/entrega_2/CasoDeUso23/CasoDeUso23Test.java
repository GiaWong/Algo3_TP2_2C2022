package edu.fiuba.algo3.entrega_2.CasoDeUso23;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso23Test {
    @Test
    public void UnZerlingAtacaAUnaConstruccionProtossYNoDeberiaHacerleDanioPorElRango() {

        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        Coordenada coordPilon = new Coordenada(10,9);
        mapa.agregar(pilon, coordPilon);

        Unidad zerling = new Zerling();

        Coordenada coordZerling = new Coordenada(12,12);

        mapa.agregar(zerling, coordZerling);
        mapa.atacar(zerling, coordPilon);
        assertEquals(300, pilon.obtenerEscudo());

    }


}
