package edu.fiuba.algo3.entrega_1.CasoDeUso9;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso9Test {

    @Test
    public void SeTieneDosPilonesSeDestruyeUnoYlaConstruccionDebriaSeguirEstandoActiva() {

        Mapa mapa = new Mapa();
        Acceso acceso = new Acceso();
        Pilon pilon1 = new Pilon();
        Pilon pilon2 = new Pilon();

        for (int i = 0; i < 8; i++) {
            acceso.construir();
            pilon1.construir();
            pilon2.construir();
        }


        mapa.agregar(pilon1, 10, 10);
        mapa.agregar(pilon2, 10, 11);
        mapa.agregar(acceso, 10, 9);

        mapa.setearRadio();
        mapa.destruirConstruccion(10, 10);
       assertEquals(true,mapa.tipoTerreno(new ConEnergia(),10,9));


    }
}
