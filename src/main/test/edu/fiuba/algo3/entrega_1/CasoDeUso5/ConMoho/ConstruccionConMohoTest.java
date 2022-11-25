package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConMoho;

import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Construccion.Guarida;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstruccionConMohoTest {


    @Test
    public void SeConstruyeReservaProduccionFueraDelRangoMohoYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new SinRecurso());
        ReservaProduccion reserva = new ReservaProduccion();
        casilla.agregar(reserva);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);
    }


    @Test
    public void SeConstruyeEspiralFueraDelRangoMohoYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new SinRecurso());
        Espiral espiral = new Espiral();
        casilla.agregar(espiral);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeGuaridalFueraDelRangoMohoYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new SinRecurso());
        Guarida guarida = new Guarida();
        casilla.agregar(guarida);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeExtractorFueraDelRangoMohoYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinTerreno());
        casilla.setRecurso(new Volcan());
        Extractor extractor = new Extractor();
        casilla.agregar(extractor);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);
    }

}
