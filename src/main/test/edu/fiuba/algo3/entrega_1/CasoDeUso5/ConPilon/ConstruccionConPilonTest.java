package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConPilon;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Exceptions.ErrorNoEsPosibleConstruir;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.RefineriaGas.Asimilador;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.Espiral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstruccionConPilonTest {

    @Test
    public void SeConstruyeAccesoFueraDelRangoDelPilonYDebeLanzarError() {

        Mapa mapa = new Mapa();
        new Pilon(1,2,3,mapa);
        Acceso acceso = new Acceso();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(acceso,1,9));
    }
    @Test
    public void SeConstruyePuertoEstelarFueraDelRangoPilonYDebeLanzarError() {

        Mapa mapa = new Mapa();
        new Pilon(1,2,3,mapa);
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(puertoEstelar,1,9));
    }
}
