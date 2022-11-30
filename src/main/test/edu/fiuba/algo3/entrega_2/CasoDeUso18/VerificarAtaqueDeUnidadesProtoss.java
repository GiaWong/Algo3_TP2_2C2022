package edu.fiuba.algo3.entrega_2.CasoDeUso18;

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


        Unidad scout = new Scout();
        Unidad hidralisco = new Hidralisco();

        scout.atacar(hidralisco);

        assertEquals(72, hidralisco.vida()); //Me da un error de StackOverflow... watt

    }
}
