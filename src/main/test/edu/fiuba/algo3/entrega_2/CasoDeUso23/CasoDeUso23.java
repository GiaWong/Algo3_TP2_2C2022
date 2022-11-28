package edu.fiuba.algo3.entrega_2.CasoDeUso23;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso23 {
    @Test
    public void UnZerlingAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {
        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        mapa.agregar(pilon, new Coordenada(10,9));
        mapa.setearRadio();

        Acceso construccionEnemiga = new Acceso();
        for(int i =0 ; i<=7;i++) {
            construccionEnemiga.construir();
        }
        Coordenada coordAtacada = new Coordenada(14,14);

        mapa.agregar(construccionEnemiga, coordAtacada);
        Unidad zerling = new Zerling();
        mapa.agregar(zerling, new Coordenada(12,12));
        mapa.atacar(zerling, coordAtacada);
        assertEquals(500,construccionEnemiga.obtenerEscudo());

}


}
