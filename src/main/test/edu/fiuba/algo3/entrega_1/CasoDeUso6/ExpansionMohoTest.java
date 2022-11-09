package edu.fiuba.algo3.entrega_1.CasoDeUso6;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Zerg.Criadero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpansionMohoTest {

    @Test
    public void CompruebaLaAmpliacionDelMohoAPartirDeUnCriadero(){
        int radioMohoEsperado = 5;
        Criadero criadero = new Criadero(new Moho(5));
        int radioMoho = Criadero.RadioMoho();
        assertEquals(radioMoho, radioMohoEsperado);

    }

    @Test
    public void CompruebaLaAmpliacionDelMohoAPartirDeUnCriaderoLuegoDe2Turnos(){
        int radioMohoEsperado = 7;
        Criadero criadero = new Criadero(new Moho(5));
        Criadero.avanzarTurno(2);
        int radioMoho = Criadero.RadioMoho();
        assertEquals(radioMoho, radioMohoEsperado);

    }


}
