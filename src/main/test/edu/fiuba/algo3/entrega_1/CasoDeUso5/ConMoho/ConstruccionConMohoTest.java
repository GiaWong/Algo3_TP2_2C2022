package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConMoho;

import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Vacio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstruccionConMohoTest {


    @Test
    public void SeConstruyeReservaProduccionFueraDelRangoMohoYSeLanzaError() {

        Casilla casilla = new Casilla();
        casilla.setTerreno(new Vacio());
        casilla.setRecurso(new Vacio());
        ReservaProduccion reserva = new ReservaProduccion();

        casilla.agregarConstruccion(reserva);


    }
    /*
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

     */

}
