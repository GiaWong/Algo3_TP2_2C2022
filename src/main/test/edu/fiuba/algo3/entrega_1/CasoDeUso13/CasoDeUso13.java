package edu.fiuba.algo3.entrega_1.CasoDeUso13;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso13 {
    @Test
    public void SeDestruyeUnCriaderoYLaCasillaQuedaSinConstruccionYSeVuelveConstruirSobreElMohoAnterior(){

        Mapa mapa = new Mapa();
        Criadero criadero = new Criadero();
        for(int i = 0; i<3; i++){
            criadero.construir();
        }
        mapa.casillaConTerrenoMoho(10,10);
        mapa.agregar(criadero,10,10);
        mapa.setearRadio();
        mapa.destruirConstruccion(10,10);
        mapa.agregar(new ReservaProduccion(),10,11);


        assertEquals(true,mapa.hayConstruccion(10,11));
    }
}
