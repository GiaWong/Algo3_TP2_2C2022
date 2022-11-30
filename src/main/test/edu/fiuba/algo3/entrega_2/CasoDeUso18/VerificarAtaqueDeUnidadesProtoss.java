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
        Unidad zealot = new Zealot();
        Unidad zerling = new Zerling();
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
        Unidad dragon = new Dragon();
        Unidad zerling = new Zerling();
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
        Unidad scout = new Scout();
        Unidad hidralisco = new Hidralisco();
        Coordenada coordScout = new Coordenada(10,10);
        Coordenada coordHidralisco = new Coordenada(11,10);

        mapa.agregar(scout, coordScout);
        mapa.agregar(hidralisco, coordHidralisco);
        mapa.atacar(scout, coordHidralisco);

        assertEquals(72, hidralisco.vida());

    }
}
