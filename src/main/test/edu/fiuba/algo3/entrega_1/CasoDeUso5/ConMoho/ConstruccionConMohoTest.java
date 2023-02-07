package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConMoho;

import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Construccion.Guarida;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEnEsteTerreno;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class ConstruccionConMohoTest {

    Coordenada coord = mock(Coordenada.class);

    @Test
    public void SeIntentaConstruirReservaProduccionFueraDelRangoMohoYTiraError() {
        Casilla casilla = new Casilla(coord);
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new SinRecurso());
        ReservaProduccion reserva = new ReservaProduccion();
        assertThrows( NoHayMoho.class,()->casilla.agregar(reserva));
    }

    @Test
    public void SeIntentaConstruirEspiralFueraDelRangoMohoYTiraError() {
        Casilla casilla = new Casilla(coord);
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new SinRecurso());
        Espiral espiral = new Espiral();
        assertThrows( NoHayMoho.class,()-> casilla.agregar(espiral));
    }

    @Test
    public void SeIntentaConstruirGuaridalFueraDelRangoMohoYTiraError() {
        Casilla casilla = new Casilla(coord);
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new SinRecurso());
        Guarida guarida = new Guarida();
        assertThrows( NoHayMoho.class,()->casilla.agregar(guarida));
    }

    @Test
    public void SeintentaConstruirExtractorFueraDelRangoMohoYTiraError() {

        Casilla casilla = new Casilla(coord);
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new Volcan());
        Extractor extractor = new Extractor();
        assertThrows( NoHayMoho.class,()->casilla.agregar(extractor));
    }

}
