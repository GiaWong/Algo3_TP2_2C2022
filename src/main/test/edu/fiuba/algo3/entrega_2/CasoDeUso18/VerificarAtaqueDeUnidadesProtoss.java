package edu.fiuba.algo3.entrega_2.CasoDeUso18;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificarAtaqueDeUnidadesProtoss {

    @Test
    public void UnZealotAtacaAUnZerlingYDeberiaHacerleDanioEsperado() {

        Mapa mapa = new Mapa(20,20);
        UnidadProtoss zealot = new Zealot();
        UnidadZerg zerling = new Zerling();
        Criadero criadero = new Criadero(0);
        Pilon pilon = new Pilon(0);
        mapa.agregar(criadero,new Coordenada(10,13));
        mapa.agregar(pilon, new Coordenada(1,2));
        for (int i = 0; i < 2; i++){
            mapa.avanzarTurno();
        }
        ReservaProduccion reservaProduccion = new ReservaProduccion();
        mapa.agregar(reservaProduccion,new Coordenada(10,14));
        Acceso acceso = new Acceso(0);
        mapa.agregar(acceso,new Coordenada(1,3));
        Coordenada coordZealot = new Coordenada(10,10);
        Coordenada coordZerling = new Coordenada(11,10);

        mapa.agregar(zealot,coordZealot);
        mapa.agregar(zerling, coordZerling);

        for (int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(zealot,coordZerling);
        assertEquals(27,zerling.vida());


    }

    @Test
    public void UnDragonAtacaAUnZerlingYDeberiaHacerleDanioEsperado() {

        Mapa mapa = new Mapa(20,20);
        UnidadProtoss dragon = new Dragon();
        UnidadZerg zerling = new Zerling();
        Coordenada coordDragon = new Coordenada(10,10);
        Coordenada coordZerling = new Coordenada(11,10);
        Criadero criadero = new Criadero(0);
        Pilon pilon = new Pilon(0);
        mapa.agregar(criadero,new Coordenada(10,13));
        mapa.agregar(pilon,new Coordenada(1,2));
        for (int i = 0; i < 2; i++){
            mapa.avanzarTurno();
        }
        ReservaProduccion reservaProduccion = new ReservaProduccion();
        mapa.agregar(reservaProduccion,new Coordenada(10,15));
        Acceso acceso = new Acceso(0);
        mapa.agregar(acceso,new Coordenada(1,3));
        mapa.agregar(dragon,coordDragon);
        mapa.agregar(zerling,coordZerling);

        for (int i = 0; i < 10; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(dragon,coordZerling);
        assertEquals(15,zerling.vida());


    }

    @Test
    public void UnScoutAtacaAUnHidraliscoYDeberiaHacerleDanioEsperado() {

        Mapa mapa = new Mapa(20,20);
        UnidadProtoss scout = new Scout();
        UnidadZerg hidralisco = new Hidralisco();
        Coordenada coordScout = new Coordenada(10,10);
        Coordenada coordHidralisco = new Coordenada(11,10);

        Criadero criadero = new Criadero(0);
        mapa.agregar(criadero,new Coordenada(10,13));
        Guarida guarida = new Guarida();
        mapa.agregar(guarida,new Coordenada(10,15));

        mapa.agregar(scout, coordScout);
        mapa.agregar(hidralisco, coordHidralisco);
        mapa.atacar(scout, coordHidralisco);

        assertEquals(72, hidralisco.vida());

    }
}
