package edu.fiuba.algo3.entrega_2.CasoDeUso18;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class VerificarAtaqueDeUnidadesZerg {

    //Verificar que todas las unidades cuasen el daño que dicen que causan en sus ataques
    Mapa mapa = new Mapa(20,20);

    // Unidad Zerg ataca a Construccion Protoss


    @Test
    public void UnZerlingAtacaAUnaConstruccionProtossYDeberiaHacerleElDanioEsperado() {

        Coordenada coordPilon = new Coordenada(10,9);
        Pilon pilon = new Pilon(0);
        mapa.agregar(pilon, coordPilon);
        mapa.agregar(new Criadero(0),new Coordenada(10,13));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(),new Coordenada(10,15));

        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }

        UnidadZerg zerling = new Zerling();
        Coordenada coordZerling = new Coordenada(10,10);
        mapa.agregar(zerling, coordZerling);

        for(int i = 0; i < 2; i++){
            mapa.avanzarTurno();
        }

        mapa.atacar(zerling, coordPilon);
        assertEquals(296, pilon.obtenerEscudo());

    }

    @Test
    public void UnHidraliscoAtacaAUnaConstruccionProtossYDeberiaHacerleElDanioEsperado() {

        Coordenada coordPilon = new Coordenada(10,9);
        Pilon pilon = new Pilon(0);
        mapa.agregar(pilon, coordPilon);
        mapa.agregar(new Criadero(0),new Coordenada(10,13));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(),new Coordenada(10,15));
        mapa.agregar(new Guarida(),new Coordenada(10,16));

        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }

        UnidadZerg hidralisco = new Hidralisco();
        Coordenada coordHidra = new Coordenada(10,10);


        mapa.agregar(hidralisco, coordHidra);

        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        hidralisco.atacar(pilon);
        assertEquals(290, pilon.obtenerEscudo());

    }

    @Test
    public void UnMutaliscoAtacaAUnaConstruccionProtossYDeberiaHacerleElDanioEsperado() {

        Coordenada coordPilon = new Coordenada(10,9);
        Pilon pilon = new Pilon(0);
        mapa.agregar(pilon, coordPilon);
        mapa.agregar(new Criadero(0),new Coordenada(10,13));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(),new Coordenada(10,15));
        mapa.agregar(new Guarida(),new Coordenada(10,16));
        mapa.agregar(new Espiral(),new Coordenada(10,14));

        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }

        UnidadZerg mutalisco = new Mutalisco();
        Coordenada coordMuta = new Coordenada(10,10);
        mapa.agregar(mutalisco, coordMuta);
        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(mutalisco, coordPilon);
        assertEquals(291, pilon.obtenerEscudo());

    }

    @Test
    public void UnGuardianAtacaAUnaConstruccionProtossYDeberiaHacerleElDanioEsperado() {

        Coordenada coordPilon = new Coordenada(10,9);
        Pilon pilon = new Pilon(0);
        mapa.agregar(pilon, coordPilon);
        mapa.agregar(new Criadero(0),new Coordenada(10,13));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(),new Coordenada(10,15));
        mapa.agregar(new Guarida(),new Coordenada(10,16));
        mapa.agregar(new Espiral(),new Coordenada(10,14));

        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }

        UnidadZerg guardian = new Guardian();
        Coordenada coordGuardian = new Coordenada(10,10);

        mapa.agregar(guardian, coordGuardian);

        //

        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(guardian, coordPilon);
        assertEquals(275, pilon.obtenerEscudo());

    }

    @Test
    public void UnDevoradorAtacaAUnScoutYDeberiaHacerleElDanioEsperado() {

        Coordenada coordPilon = new Coordenada(6,5);
        Pilon pilon = new Pilon(0);
        mapa.agregar(pilon, coordPilon);
        mapa.agregar(new Criadero(0),new Coordenada(10,13));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(),new Coordenada(10,15));
        mapa.agregar(new Guarida(),new Coordenada(10,16));
        mapa.agregar(new Espiral(),new Coordenada(10,14));
        mapa.agregar(new Acceso(), new Coordenada(5,4));
        mapa.agregar(new PuertoEstelar(), new Coordenada(5,3));

        for(int i = 0; i < 6; i++){
            mapa.avanzarTurno();
        }

        UnidadZerg devorador = new Devorador();
        Coordenada coordDevorador = new Coordenada(10,11);

        Scout scout = new Scout();
        Coordenada coordScout = new Coordenada(10,10);

        mapa.agregar(devorador, coordDevorador);
        mapa.agregar(scout, coordScout);

        //

        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(devorador,coordScout);
        assertEquals(85, scout.obtenerEscudo());

    }

}
