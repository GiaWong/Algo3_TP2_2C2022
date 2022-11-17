package edu.fiuba.algo3.entrega_2.CasoDeUso23;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso23 {
    @Test
    public void UnZerlingAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {
        Mapa mapa = new Mapa();
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        mapa.agregar(pilon,10,9);
        mapa.setearRadio();
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.conZerg(new Zerling());//ver en reserva en dond se guardaré zerlings, lista? //cambiar nombre con eevolucionar

        Acceso construccionEnemiga = new Acceso();
        for(int i =0 ; i<=7;i++) {
            construccionEnemiga.construir();
        }
        mapa.agregar(reserva,11,10);
        mapa.agregar(construccionEnemiga,14,14);
        Zerling zerling = reserva.obtenerZerg();
        mapa.agregar(zerling,12,12);
        mapa.atacar(zerling,11,11);
        assertEquals(500,construccionEnemiga.obtenerEscudo());

}


}
