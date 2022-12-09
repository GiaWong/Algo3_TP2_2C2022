package edu.fiuba.algo3.entrega_1.CasoDeUso13;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CasoDeUso13Test {
    @Test
    public void SeDestruyeUnCriaderoYLaCasillaQuedaSinConstruccionYSeVuelveConstruirSobreElMohoAnterior(){


        Mapa mapa = new Mapa(20,20);
        Criadero criadero = new Criadero(0);
        ReservaProduccion reserva = new ReservaProduccion(0);

        Coordenada coordenada = new Coordenada(10,10);
        mapa.agregar(criadero,coordenada);
        criadero.avanzarTurno(mapa);

        mapa.destruirConstruccion(coordenada);
        assertDoesNotThrow( ()-> { mapa.agregar(reserva, coordenada);});
    }
}
