package edu.fiuba.algo3.entrega_1.CasoDeUso9;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CasoDeUso9Test {


    @Test
    public void SeTieneDosPilonesSeDestruyeUnoYlaConstruccionDebriaSeguirEstandoActiva() throws EdificioNoEstaOperativo {

        Mapa mapa = new Mapa(20,20);
        Acceso acceso = new Acceso();
        Pilon pilon1 = new Pilon();
        Pilon pilon2 = new Pilon();

        for (int i = 0; i < 8; i++) {
            acceso.construir();
            pilon1.construir();
            pilon2.construir();
        }
        Coordenada coordPilon1 = new Coordenada(10,9);
        Coordenada coordPilon2 = new Coordenada(10,11);
        Coordenada coordAcceso = new Coordenada(10,10);

        mapa.agregar(pilon1, coordPilon1);
        mapa.agregar(pilon2, coordPilon2);
        pilon1.energizar(mapa, coordPilon1);
        pilon2.energizar(mapa, coordPilon2);

        mapa.agregar(acceso, coordAcceso);

        mapa.destruirConstruccion(coordPilon1);
        pilon2.energizar(mapa, coordPilon2);

        assertTrue(mapa.tipoTerreno(new ConEnergia(), 10, 10));


    }

}
