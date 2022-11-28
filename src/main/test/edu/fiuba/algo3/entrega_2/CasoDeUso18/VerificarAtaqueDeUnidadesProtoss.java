package edu.fiuba.algo3.entrega_2.CasoDeUso18;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificarAtaqueDeUnidadesProtoss {

    @Test
    public void UnZealotAtacaAUnZerlingProtosYDeberiaHacerleDanio() {


        Mapa mapa = new Mapa(20,20);
        Zealot zealot = new Zealot();
        Zerling zerling = new Zerling();
        Coordenada coordZealot = new Coordenada(10,10);
        Coordenada coordZerling = new Coordenada(11,10);

        mapa.agregar(zealot,coordZealot);
        mapa.agregar(zerling, coordZerling);
        mapa.atacar(zealot,coordZerling);
        assertEquals(27,zerling.vida());


    }

    @Test
    public void UnDragonAtacaAUnaZerlingProtossYDeberiaHacerleDanio() {

        Mapa mapa = new Mapa(20,20);
        Dragon dragon = new Dragon();
        Zerling zerling = new Zerling();
        Coordenada coordDragon = new Coordenada(10,10);
        Coordenada coordZerling = new Coordenada(11,10);

        mapa.agregar(dragon,coordDragon);
        mapa.agregar(zerling,coordZerling);
        mapa.atacar(dragon,coordZerling);
        assertEquals(15,zerling.vida());

    }

    @Test
    public void UnScoutAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {

        Mapa mapa = new Mapa(20,20);
        Scout scout = new Scout();
        Hidralisco hidralisco = new Hidralisco();
        Coordenada coordScout = new Coordenada(10,10);
        Coordenada coordHidra = new Coordenada(11,10);

        mapa.agregar(scout,coordScout);
        mapa.agregar(hidralisco,coordHidra);
        mapa.atacar(hidralisco,coordScout);
        assertEquals(140,scout.vida());

    }
}
