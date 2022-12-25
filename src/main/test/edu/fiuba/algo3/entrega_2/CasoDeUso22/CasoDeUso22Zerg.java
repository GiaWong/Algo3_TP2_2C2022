package edu.fiuba.algo3.entrega_2.CasoDeUso22;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.FaltaEdificioParaCrearUnidad;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso22Zerg {

    /*Verificar los tiempos de construccion de unidades y que tengan el edificio que permite
construirlas. */



    @Test
    public void unZánganoNoOperativoNoDeberiaPoderRecolectar(){

        Zangano zangano = new Zangano();
        NodoMineral nodo = new NodoMineral();

        assertThrows(UnidadNoOperativa.class, ()-> {
            zangano.recolectar(nodo);
        });
    }

    @Test
    public void unZerlingNoOperativoNoDeberiaPoderAtacar(){

        Zerling zerling = new Zerling();

        assertThrows(UnidadNoOperativa.class, ()-> {
            zerling.atacar(new Dragon());
        });
    }

    @Test
    public void unHidraliscoNoOperativoNoDeberiaPoderAtacar(){

        Hidralisco hidralisco = new Hidralisco();

        assertThrows(UnidadNoOperativa.class, ()-> {
            hidralisco.atacar(new Dragon());
        });
    }

    @Test
    public void unMutaliscoNoOperativoNoDeberiaPoderAtacar(){

        Mutalisco mutalisco = new Mutalisco();

        assertThrows(UnidadNoOperativa.class, ()-> {
            mutalisco.atacar(new Dragon());
        });
    }

    @Test
    public void unZanganoOperativoDeberiaPoderRecolectar(){

        Zangano zangano = new Zangano();
        zangano.avanzarTurno();
        NodoMineral nodo = new NodoMineral();
        assertDoesNotThrow(()->zangano.recolectar(nodo));
    }

    @Test
    public void unZerlingOperativoDeberiaPoderAtacar(){

        Zerling zerling = new Zerling();
        for(int i=0; i < 2; i++){
            zerling.avanzarTurno();
        }

        assertDoesNotThrow(()->zerling.atacar(new Dragon()));
    }

    @Test
    public void unHidraliscoOperativoDeberiaPoderAtacar(){

        Hidralisco hidralisco = new Hidralisco();
        for(int i=0; i < 4; i++){
            hidralisco.avanzarTurno();
        }

        assertDoesNotThrow(()->hidralisco.atacar(new Dragon()));

    }

    @Test
    public void unMutaliscoOperativoDeberiaPoderAtacar(){

        Mutalisco mutalisco = new Mutalisco();
        for(int i=0; i < 7; i++){
            mutalisco.avanzarTurno();
        }

        assertDoesNotThrow(()->mutalisco.atacar(new Dragon()));
    }


    @Test
    public void unZerlingNoSePuedeAgregarAlMapaSiNoExisteReserva() {
        Zerling zerling = new Zerling();
        Mapa mapa = new Mapa(20,20);
        Criadero criadero = new Criadero();
        mapa.agregar(criadero,new Coordenada(10,10));

        assertThrows( FaltaEdificioParaCrearUnidad.class, ()->mapa.agregar(zerling,new Coordenada(10,13)));
    }

    @Test
    public void unHidraliscoNoSePuedeAgregarAlMapaSiNoExisteGuarida() {
        Hidralisco hidralisco = new Hidralisco();
        Mapa mapa = new Mapa(20,20);
        Criadero criadero = new Criadero();
        mapa.agregar(criadero,new Coordenada(10,10));

        assertThrows( FaltaEdificioParaCrearUnidad.class, ()->mapa.agregar(hidralisco,new Coordenada(10,13)));
    }

    @Test
    public void unMutaliscoNoSePuedeAgregarAlMapaSiNoExisteEspiral() {
        Mutalisco mutalisco = new Mutalisco();
        Mapa mapa = new Mapa(20,20);
        Criadero criadero = new Criadero();
        mapa.agregar(criadero,new Coordenada(10,10));

        assertThrows( FaltaEdificioParaCrearUnidad.class, ()->mapa.agregar(mutalisco,new Coordenada(10,13)));
    }

    @Test
    public void unZanganoNoSePuedeAgregarAlMapaSiNoExisteCriadero() {
        Zangano zangano = new Zangano();
        Mapa mapa = new Mapa(20,20);


        assertThrows( FaltaEdificioParaCrearUnidad.class, ()->mapa.agregar(zangano,new Coordenada(10,13)));
    }



}
