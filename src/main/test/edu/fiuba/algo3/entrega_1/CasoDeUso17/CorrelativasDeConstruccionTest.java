package edu.fiuba.algo3.entrega_1.CasoDeUso17;

import edu.fiuba.algo3.modelo.Imperio.Exceptions.ErrorFaltaPrerequisito;
import edu.fiuba.algo3.modelo.Imperio.ImperioProtoss;
import edu.fiuba.algo3.modelo.Imperio.ImperioZerg;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Zerg.ReservaProduccion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CorrelativasDeConstruccionTest {


        @Test
        public void SeIntentaConstruirUnaGuaridaSinUnaReservaYSeLanzaUnError() {
            ImperioZerg imperio = new ImperioZerg();
            assertThrows(ErrorFaltaPrerequisito.class,()-> imperio.guarida());
        }

        @Test
        public void SeIntentaConstruirUnaEspiralSinUnaGuaridaYSeLanzaUnError() {

            ImperioZerg imperio = new ImperioZerg();
            assertThrows(ErrorFaltaPrerequisito.class,()->imperio.espiral());
        }

        @Test
        public void SeIntentaConstruirUnPuertoEstelarSinUnAccesoYSeLanzaUnError() {

            ImperioProtoss imperio= new ImperioProtoss();
            assertThrows(ErrorFaltaPrerequisito.class,()->imperio.puertoEstelar());
        }

}
