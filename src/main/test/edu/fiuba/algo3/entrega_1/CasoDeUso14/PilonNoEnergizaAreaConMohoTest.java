package edu.fiuba.algo3.entrega_1.CasoDeUso14;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PilonNoEnergizaAreaConMohoTest {

    @Test
    public void QuieroSaberSiSePuedeConstruirUnEdificioProtossEnUnaCasillaConMohoYAlcanzadaPorElPilonYReciboLaRespuestaEsperada() {

        boolean respuestaEsperada = false;
        Mapa mapa = new Mapa();
        int radio = 5;
        Moho moho = new Moho(0,1,mapa); //moho se tiene que encargadar de pintar casillas
        Pilon pilon = new Pilon(0,7,mapa);
        mapa.agregar(pilon,0,8);
        moho.avanzarTurno(5); //se expandió 2 veces
        pilon.avanzarTurno(5); //empieza a energizar casillas
        boolean respuestaObtenida = mapa.sePuedeConstruirProtoss(0,6);
        assertEquals(respuestaEsperada, respuestaObtenida);
    }
}
