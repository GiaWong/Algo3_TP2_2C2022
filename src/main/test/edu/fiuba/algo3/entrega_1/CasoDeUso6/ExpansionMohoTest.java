package edu.fiuba.algo3.entrega_1.CasoDeUso6;

import edu.fiuba.algo3.modelo.ConstruccionZerg.Criadero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpansionMohoTest {


    @Test
    public void CompruebaLaAmpliacionDelMohoAPartirDeUnCriadero(){
        int radioMohoEsperado = 5;
        Criadero criadero = new Criadero();
        for(int i =0; i<=3; i++) {
            criadero.construir();
        }
        int radioMoho = criadero.obtenerRadio();
        assertEquals(radioMoho, radioMohoEsperado);

    }

    @Test
    public void CompruebaLaAmpliacionDelMohoAPartirDeUnCriaderoLuegoDe2Turnos(){
        int radioMohoEsperado = 6;
        Criadero criadero = new Criadero();
        for(int i =0; i<=3; i++) {
            criadero.construir();
        }
        for( int i =0; i<=1; i++) {
            criadero.avanzarTurno();
        }
        int radioMoho = criadero.obtenerRadio();
        assertEquals(radioMoho, radioMohoEsperado);

    }




}
