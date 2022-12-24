package edu.fiuba.algo3.entrega_2.CasoDeUso18;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificarAtaqueDeUnidadesZerg {

    //Verificar que todas las unidades cuasen el daño que dicen que causan en sus ataques

    // Unidad Zerg ataca a Construccion Protoss


    @Test
    public void UnZerlingAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {


        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        Coordenada coordPilon = new Coordenada(10,9);
        mapa.agregar(pilon, coordPilon);

        UnidadZerg zerling = new Zerling();
        Criadero criadero = new Criadero(0);
        mapa.agregar(criadero,new Coordenada(10,13));
        ReservaProduccion reservaProduccion = new ReservaProduccion();
        mapa.agregar(reservaProduccion,new Coordenada(10,15));

        Coordenada coordZerling = new Coordenada(10,10);

        mapa.agregar(zerling, coordZerling);
        mapa.atacar(zerling, coordPilon);
        assertEquals(296, pilon.obtenerEscudo());

    }

    @Test
    public void UnHidraliscoAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {
        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        Coordenada coordPilon = new Coordenada(10,9);
        mapa.agregar(pilon, coordPilon);

        UnidadZerg hidralisco = new Hidralisco();
        Coordenada coordHidra = new Coordenada(10,10);
        Criadero criadero = new Criadero(0);
        mapa.agregar(criadero,new Coordenada(10,13));
        Guarida guarida = new Guarida();
        mapa.agregar(guarida,new Coordenada(10,15));

        mapa.agregar(hidralisco, coordHidra);
        hidralisco.atacar(pilon);
        assertEquals(290, pilon.obtenerEscudo());

    }

    @Test
    public void UnMutaliscoAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {
        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        Coordenada coordPilon = new Coordenada(10,9);
        mapa.agregar(pilon, coordPilon);

        UnidadZerg mutalisco = new Mutalisco();

        Coordenada coordMuta = new Coordenada(10,10);

        Criadero criadero = new Criadero(0);
        mapa.agregar(criadero,new Coordenada(10,13));
        Espiral espiral = new Espiral();
        mapa.agregar(espiral,new Coordenada(10,15));

        mapa.agregar(mutalisco, coordMuta);
        mapa.atacar(mutalisco, coordPilon);
        assertEquals(291, pilon.obtenerEscudo());

    }

    @Test
    public void UnGuardianAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {

        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        Coordenada coordPilon = new Coordenada(10,9);
        mapa.agregar(pilon, coordPilon);

        UnidadProtoss guardian = new Guardian();
        Coordenada coordGuardian = new Coordenada(10,10);

        mapa.agregar(guardian, coordGuardian);
        mapa.atacar(guardian, coordPilon);
        assertEquals(275, pilon.obtenerEscudo());

    }

}
