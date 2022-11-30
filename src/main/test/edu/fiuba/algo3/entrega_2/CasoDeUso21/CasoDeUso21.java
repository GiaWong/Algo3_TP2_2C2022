package edu.fiuba.algo3.entrega_2.CasoDeUso21;

import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Unidades.Guardian;
import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CasoDeUso21 {

    Raza zerg = mock(Zerg.class); //Deberia usar mock para hacer lo que quiero hacer
    @Test
    public void UnMutaliscoNoPuedeEvolucionarAGuardianSinRecursosNecesrios() {

        /*
        Mutalisco mutalisco = new Mutalisco();
        Zerg zerg = new Zerg();
        zerg.evolucionar(mutalisco);
        assertEquals(0,zerg.obtenerCantidadUnidades());

         */



    }
}
