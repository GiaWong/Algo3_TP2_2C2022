package edu.fiuba.algo3.entrega_1.CasoDeUso17;

import edu.fiuba.algo3.modelo.Imperio.Exceptions.ErrorFaltaPrerequisito;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Zerg.ReservaProduccion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CorrelativasDeConstruccionTest {
/*
    @Test
    public void SeIntentaConstruirUnaGuaridaSinUnaReservaYSeLanzaUnError() {

        ReservaProduccion reservaProduccion = new ReservaProduccion();
        assertThrows(ErrorFaltaPrerequisito.class,()->new Guarida(reservaProduccion));
    }

    @Test
    public void SeIntentaConstruirUnaEspiralSinUnaGuaridaYSeLanzaUnError() {

       Guarida guarida = new Guarida();
       assertThrows(ErrorFaltaPrerequisito.class,()->new Espiral(guarida));
    }

    @Test
    public void SeIntentaConstruirUnPuertoEstelarSinUnAccesoYSeLanzaUnError() {

        Acceso acceso = new Acceso();
        assertThrows(ErrorFaltaPrerequisito.class,()->new PuertoEstelar(acceso));
    }*/

}
