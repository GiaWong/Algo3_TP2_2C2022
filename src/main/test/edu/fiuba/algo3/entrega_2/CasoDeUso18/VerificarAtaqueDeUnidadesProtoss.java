package edu.fiuba.algo3.entrega_2.CasoDeUso18;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificarAtaqueDeUnidadesProtoss {

    @Test
    public void UnZealotAtacaAUnZerlingProtosYDeberiaHacerleDanio() {


        Mapa mapa = new Mapa();
        Zealot zealot = new Zealot();
        Zerling zerling = new Zerling();

        mapa.agregar(zealot,10,10);
        mapa.agregar(zerling,11,10);
        mapa.atacar(zealot,11,10);
        assertEquals(27,zerling.vida());


    }

    @Test
    public void UnDragonAtacaAUnaZerlingProtossYDeberiaHacerleDanio() {

        Mapa mapa = new Mapa();
        Dragon dragon = new Dragon();
        Zerling zerling = new Zerling();

        mapa.agregar(dragon,10,10);
        mapa.agregar(zerling,11,10);
        mapa.atacar(dragon,11,10);
        assertEquals(15,zerling.vida());

    }

    @Test
    public void UnScoutAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {

        Mapa mapa = new Mapa();
        Scout scout = new Scout();
        Hidralisco hidralisco = new Hidralisco();

        mapa.agregar(scout,10,10);
        mapa.agregar(hidralisco,11,10);
        mapa.atacar(scout,11,10);
        assertEquals(72,hidralisco.vida());

    }
}
