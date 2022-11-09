package edu.fiuba.algo3.entrega_1.CasoDeUso13;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Zerg.Larva;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComprobarConstruccionSobreCriaderoDestruido {

    @Test
    public void seDestruyeCriadero_peroIgualSePuedeConstruirSobreMohoQueDejo(){
        Boolean aptoParaConstruir = false;
        Moho moho = new Moho(5);
        Turno turno = new Turno(1);
        Criadero criadero = new Criadero(moho);
        criadero.iniciar(new Larva(3));
        //destruccion de Criadero
        criadero.destruir();
        //a pesar de destrucion, se van recuperando lentamente amedida que avancen los turnos
        criadero.avanzarTurno(turno.getCantidad());

        //intento Construir Nuevamente Sobre Moho resultante
        Moho mohoResultante = criadero.devolverMohoActual();
        aptoParaConstruir = mohoResultante.aptoParaConstruir();

        assertTrue(aptoParaConstruir);
    }
}
