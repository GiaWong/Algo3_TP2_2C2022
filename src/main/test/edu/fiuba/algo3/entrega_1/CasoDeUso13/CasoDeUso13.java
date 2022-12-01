package edu.fiuba.algo3.entrega_1.CasoDeUso13;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso13 {
    @Test
    public void SeDestruyeUnCriaderoYLaCasillaQuedaSinConstruccionYSeVuelveConstruirSobreElMohoAnterior(){


        Mapa mapa = new Mapa(20,20);
        Criadero criadero = new Criadero();
        for(int i = 0; i<3; i++){
            criadero.avanzarTurno();
        }
        Coordenada coordenada = new Coordenada(10,10);
        mapa.casillaConTerrenoMoho(coordenada);
        mapa.agregar(criadero,coordenada);
        mapa.destruirConstruccion(coordenada);
        mapa.agregar(new ReservaProduccion(),coordenada);
        assertDoesNotThrow( ()-> {
            mapa.agregar(new ReservaProduccion(),coordenada);
        });
    }
}
