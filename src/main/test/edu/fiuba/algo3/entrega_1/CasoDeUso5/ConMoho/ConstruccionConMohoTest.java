package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConMoho;

import edu.fiuba.algo3.modelo.ConstruccionZerg.Espiral;
import edu.fiuba.algo3.modelo.ConstruccionZerg.Extractor;
import edu.fiuba.algo3.modelo.ConstruccionZerg.Guarida;
import edu.fiuba.algo3.modelo.ConstruccionZerg.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Vacio;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinNada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstruccionConMohoTest {


    @Test
    public void SeConstruyeReservaProduccionFueraDelRangoMohoYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        ReservaProduccion reserva = new ReservaProduccion();
        casilla.agregar(reserva);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);
    }


    @Test
    public void SeConstruyeEspiralFueraDelRangoMohoYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        Espiral espiral = new Espiral();
        casilla.agregar(espiral);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeGuaridalFueraDelRangoMohoYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        Guarida guarida = new Guarida();
        casilla.agregar(guarida);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeExtractorFueraDelRangoMohoYNoSeDeberiaPoder() {

        boolean esperado = false;
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Volcan());
        Extractor extractor = new Extractor();
        casilla.agregar(extractor);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);
    }

}
