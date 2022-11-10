package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConMoho;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Imperio.Exceptions.ErrorNoEsPosibleConstruir;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Zerg.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstruccionConMohoTest {


    @Test
    public void SeConstruyeReservaProduccionFueraDelRangoMohoYSeLanzaError() {

        Mapa mapa = new Mapa();
        Moho moho = new Moho(1,2,mapa);
        ReservaProduccion reserva = new ReservaProduccion();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(reserva,1,9));
    }

    @Test
    public void SeConstruyeGuaridaFueraDelRangoMohoYSeLanzaError() {

        Mapa mapa = new Mapa();
        Moho moho = new Moho(0,4,mapa);
        Guarida guarida = new Guarida();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(guarida,0,6));
    }



    @Test
    public void SeConstruyeEspiralFueraDelRangoMohoYDebeLanzarError() {

        Mapa mapa = new Mapa();
        Moho moho = new Moho(0,4,mapa);
        Espiral espiral = new Espiral();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(espiral,0,6));
    }

}
