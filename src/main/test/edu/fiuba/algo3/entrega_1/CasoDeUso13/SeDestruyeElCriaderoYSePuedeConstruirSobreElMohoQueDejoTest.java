package edu.fiuba.algo3.entrega_1.CasoDeUso13;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Zerg.ReservaProduccion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeDestruyeElCriaderoYSePuedeConstruirSobreElMohoQueDejoTest {

    @Test
    public void SeDestruyeUnCriaderoYLaCasillaQuedaSinConstruccion() {

        boolean respuestaEsperada = true;
        Mapa mapa = new Mapa();
        Moho moho = new Moho(1,2,5,mapa);
        Criadero criadero = new Criadero();
        mapa.agregar(criadero,1,2);
        criadero.avanzarTurno(4);
        moho.avanzarTurno(4);
        mapa.vaciar(1,2); //esa casilla apunta a Nada() pero sigue teniendo moho
        boolean respuestaObtenida = mapa.estaVacia(1,2);
        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    public void SeDestruyeUnCriaderoYSeVuelveAContruirOtroEnElMismoLugarYLaCasillaEstaOcupada() {

        boolean respuestaEsperada = false;
        Mapa mapa = new Mapa();
        Moho moho = new Moho(1,2,5,mapa);
        Criadero criadero1 = new Criadero();
        mapa.agregar(criadero1,1,2);
        criadero1.avanzarTurno(4);
        moho.avanzarTurno(4);
        mapa.vaciar(1,2); //esa casilla apunta a Nada() pero sigue teniendo moho

        Criadero criadero2 = new Criadero();
        mapa.agregar(criadero2,1,2);
        criadero2.avanzarTurno(4);
        moho.avanzarTurno(4);
        boolean respuestaObtenida = mapa.estaVacia(1,2);
        assertEquals(respuestaEsperada, respuestaObtenida);
    }

}
