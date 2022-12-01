package edu.fiuba.algo3.entrega_1.CasoDeUso6;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExpansionMohoTest {


    @Test
    public void CompruebaLaAmpliacionDelMohoAPartirDeUnCriadero(){
        Mapa mapa = new Mapa(20,20);
        Criadero criadero = new Criadero();
        Coordenada coordenada = new Coordenada(10,10);
        mapa.agregar(criadero,coordenada);
        for(int i = 0; i <= 6; i++) {
            criadero.avanzarTurno(mapa,coordenada);
        }
        assertDoesNotThrow(()->{mapa.agregar(new ReservaProduccion(), new Coordenada(9,10));});
        assertThrows( NoHayMoho.class,()->{mapa.agregar(new ReservaProduccion(), new Coordenada(19,19));});
    }

    @Test
    public void CompruebaLaAmpliacionDelMohoAPartirDeUnCriaderoLuegoDeVariosTurnos(){
        Mapa mapa = new Mapa(20,20);
        Criadero criadero = new Criadero();
        Coordenada coordenada = new Coordenada(1,2);
        mapa.agregar(criadero,coordenada);
        for(int i =0; i<=8; i++) {
            criadero.avanzarTurno(mapa,coordenada);
        }
        criadero.avanzarTurno(mapa,coordenada);
        assertDoesNotThrow(()->{mapa.agregar(new ReservaProduccion(), new Coordenada(6,5));});
        assertDoesNotThrow(()->{mapa.agregar(new ReservaProduccion(), new Coordenada(7,5));});

    }




}
