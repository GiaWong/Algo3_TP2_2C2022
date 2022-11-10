package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConPilon;

import edu.fiuba.algo3.modelo.Imperio.Exceptions.ErrorNoEsPosibleConstruir;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConstruccionConPilonTest {

    @Test
    public void SeConstruyeAccesoFueraDelRangoDelPilonYDebeLanzarError() {

        Mapa mapa = new Mapa();
        Pilon pilon = new Pilon(0,4,mapa);
        mapa.agregar(pilon,0,4);
        pilon.avanzarTurno(5);
        Acceso acceso = new Acceso();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(acceso,0,6));
    }
    @Test
    public void SeConstruyePuertoEstelarFueraDelRangoPilonYDebeLanzarError() {

        Mapa mapa = new Mapa();
        Pilon pilon = new Pilon(0,4,mapa);
        mapa.agregar(pilon,0,4);
        pilon.avanzarTurno(5);
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        assertThrows(ErrorNoEsPosibleConstruir.class,()->mapa.agregar(puertoEstelar,0,6));
    }
}
