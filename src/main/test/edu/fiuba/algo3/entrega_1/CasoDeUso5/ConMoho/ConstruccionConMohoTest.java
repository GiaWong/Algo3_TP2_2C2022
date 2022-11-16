package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConMoho;

import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Construccion.Guarida;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Vacio;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
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
        casilla.agregarConstruccion(reserva);
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
        casilla.agregarConstruccion(espiral);
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
        casilla.agregarConstruccion(guarida);
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
        casilla.agregarConstruccion(extractor);
        boolean resultado = casilla.hayConstruccion();
        assertEquals(resultado, esperado);
    }

}
