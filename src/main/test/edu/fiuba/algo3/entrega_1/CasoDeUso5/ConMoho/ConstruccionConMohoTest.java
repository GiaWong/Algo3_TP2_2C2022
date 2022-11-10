package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConMoho;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Exceptions.ErrorNoEsPosibleConstruir;
import edu.fiuba.algo3.modelo.Exceptions.ErrorVolcanOcupado;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.RefineriaGas.Extractor;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstruccionConMohoTest {


    @Test
    public void SeConstruyeReservaProduccionFueraDelRangoMohoYSeLanzaError() {

        Mapa mapa = new Mapa();
        new Moho(1,2,5,mapa);
        ReservaProduccion reserva = new ReservaProduccion();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(reserva,1,9));
    }

    @Test
    public void SeConstruyeGuaridaFueraDelRangoMohoYSeLanzaError() {

        Mapa mapa = new Mapa();
        new Moho(1,2,5,mapa);
        Guarida guarida = new Guarida();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(guarida,1,9));
    }



    @Test
    public void SeConstruyeEspiralFueraDelRangoMohoYDebeLanzarError() {

        Mapa mapa = new Mapa();
        new Moho(1,2,5,mapa);
        Espiral espiral = new Espiral();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(espiral,1,9));
    }

}
