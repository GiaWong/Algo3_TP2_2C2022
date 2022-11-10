package edu.fiuba.algo3.entrega_1.CasoDeUso6;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpansionMohoTest {

    @Test
    public void ApareceMohoEnUnaZonaYDespuesDeCiertosTurnosElRadioDebeSerElEsperado(){
        int radioEsperado = 6;
        Mapa mapa = new Mapa();
        Moho moho = new Moho(1,2,5,mapa);
        moho.avanzarTurno(3);
        int radioObtenido = moho.obtenerRadio();
        assertEquals(radioObtenido, radioEsperado);
    }

}
