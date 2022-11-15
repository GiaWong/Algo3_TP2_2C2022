package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConMoho;

import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Construccion.Guarida;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Vacio;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstruccionConMohoTest {


    @Test
    public void SeConstruyeReservaProduccionFueraDelRangoMohoYSeLanzaError() {

        Casilla casilla = new Casilla();
        casilla.setTerreno(new ConEnergia()); // cambiar set terreno poro Sin Nada
        casilla.setRecurso(new Vacio());
        ReservaProduccion reserva = new ReservaProduccion();
        casilla.agregarConstruccion(reserva);
        assertEquals(casilla.hayConstruccion(),false);
    }


    @Test
    public void SeConstruyeEspiralFueraDelRangoMohoYSeLanzaError() {

        Casilla casilla = new Casilla();
        casilla.setTerreno(new ConEnergia());
        casilla.setRecurso(new Vacio());
        Espiral espiral = new Espiral();
        casilla.agregarConstruccion(espiral);
        assertEquals(casilla.hayConstruccion(),false);
    }

    @Test
    public void SeConstruyeGuaridalFueraDelRangoMohoYSeLanzaError() {

        Casilla casilla = new Casilla();
        casilla.setTerreno(new ConEnergia());
        casilla.setRecurso(new Vacio());
        Guarida guarida = new Guarida();
        casilla.agregarConstruccion(guarida);
        assertEquals(casilla.hayConstruccion(),false);
    }

}
