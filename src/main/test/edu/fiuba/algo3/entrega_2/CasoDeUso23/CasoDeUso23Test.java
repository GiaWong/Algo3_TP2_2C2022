package edu.fiuba.algo3.entrega_2.CasoDeUso23;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.ObjetivoFueraDeRango;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso23Test {

    @Test
    public void unZerlingNoPuedeAtacarAlgoAUnRangoMayorA1(){

        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon(0);
        Coordenada coordPilon = new Coordenada(10,9);
        mapa.agregar(pilon, coordPilon);

        mapa.agregar(new Criadero(0),new Coordenada(3,3));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0),new Coordenada(3,4));

        Zerling zerling = new Zerling();
        Coordenada coordZerling = new Coordenada(12,12);
        mapa.agregar(zerling, coordZerling);
        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( ObjetivoFueraDeRango.class, ()-> {
            mapa.atacar(zerling, coordPilon);});

    }

    @Test
    public void unHidraliscoNoPuedeAtacarAlgoAUnRangoMayorA4(){

        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon(0);
        Coordenada coordPilon = new Coordenada(10,10);
        mapa.agregar(pilon, coordPilon);

        mapa.agregar(new Criadero(0),new Coordenada(3,3));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0),new Coordenada(3,4));
        mapa.agregar(new Guarida(0),new Coordenada(3,5));

        Hidralisco hidralisco = new Hidralisco();
        Coordenada coordAtacante = new Coordenada(15,15);
        mapa.agregar(hidralisco,coordAtacante);
        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( ObjetivoFueraDeRango.class, ()-> {
            mapa.atacar(hidralisco, coordPilon);});

    }
    @Test
    public void unMutaliscoNoPuedeAtacarAlgoAUnRangoMayorA3(){
        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon(0);
        Coordenada coordPilon = new Coordenada(10,10);
        mapa.agregar(pilon, coordPilon);
        mapa.avanzarTurno();

        mapa.agregar(new Criadero(0),new Coordenada(3,3));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0),new Coordenada(3,4));
        mapa.agregar(new Guarida(0),new Coordenada(3,5));
        mapa.agregar(new Espiral(0),new Coordenada(3,6));

        Mutalisco mutalisco = new Mutalisco();
        Coordenada coordAtacante = new Coordenada(15,15);
        mapa.agregar(mutalisco,coordAtacante);
        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( ObjetivoFueraDeRango.class, ()-> {
            mapa.atacar(mutalisco, coordPilon);});
    }
    @Test
    public void unGuardianNoPuedeAtacarAlgoAUnRangoMayorA10(){
        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon(0);
        Coordenada coordPilon = new Coordenada(4,4);
        mapa.agregar(pilon, coordPilon);
        mapa.avanzarTurno();

        mapa.agregar(new Criadero(0),new Coordenada(3,3));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0),new Coordenada(3,4));
        mapa.agregar(new Guarida(0),new Coordenada(3,5));
        mapa.agregar(new Espiral(0),new Coordenada(3,6));

        Guardian guardian = new Guardian();
        Coordenada coordAtacante = new Coordenada(16,16);
        mapa.agregar(guardian,coordAtacante);
        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( ObjetivoFueraDeRango.class, ()-> {
            mapa.atacar(guardian, coordPilon);});
    }

    @Test
    public void unDevoradorNoPuedeAtacarAlgoAUnRangoMayorA5(){
        Mapa mapa = new Mapa(20,20);
        mapa.agregar(new Pilon(0),new Coordenada(13,13));
        mapa.avanzarTurno();
        mapa.agregar(new Acceso(0),new Coordenada(13,14));
        mapa.agregar(new PuertoEstelar(0),new Coordenada(13,15));

        Scout scout = new Scout();
        Coordenada coordScout = new Coordenada(4,4);
        mapa.agregar(scout, coordScout);
        mapa.avanzarTurno();

        mapa.agregar(new Criadero(0),new Coordenada(3,3));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0),new Coordenada(3,4));
        mapa.agregar(new Guarida(0),new Coordenada(3,5));
        mapa.agregar(new Espiral(0),new Coordenada(3,6));

        Devorador devorador = new Devorador();
        Coordenada coordAtacante = new Coordenada(16,16);
        mapa.agregar(devorador,coordAtacante);
        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( ObjetivoFueraDeRango.class, ()-> {
            mapa.atacar(devorador,coordScout);});
    }


    @Test
    public void unZealotNoPuedeAtacarAlgoAUnRangoMayorA1(){
        Mapa mapa = new Mapa(20,20);
        mapa.agregar(new Criadero(0),new Coordenada(3,3));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0),new Coordenada(3,4));

        Zerling zerling = new Zerling();
        Coordenada coordDefensor = new Coordenada(4,4);
        mapa.agregar(zerling,coordDefensor);


        mapa.agregar(new Pilon(0),new Coordenada(13,13));
        mapa.avanzarTurno();
        mapa.agregar(new Acceso(0),new Coordenada(13,14));



        Zealot zealot = new Zealot();
        Coordenada coordAtacante = new Coordenada(16,16);
        mapa.agregar(zealot,coordAtacante);
        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( ObjetivoFueraDeRango.class, ()-> {
            mapa.atacar(zealot,coordDefensor);});
    }
    @Test
    public void unDragonNoPuedeAtacarAlgoAUnRangoMayorA4(){
        Mapa mapa = new Mapa(20,20);
        mapa.agregar(new Criadero(0),new Coordenada(3,3));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0),new Coordenada(3,4));

        Zerling zerling = new Zerling();
        Coordenada coordDefensor = new Coordenada(4,4);
        mapa.agregar(zerling,coordDefensor);
        mapa.avanzarTurno();

        mapa.agregar(new Pilon(0),new Coordenada(13,13));
        mapa.avanzarTurno();
        mapa.agregar(new Acceso(0),new Coordenada(13,14));

        Dragon dragon = new Dragon();
        Coordenada coordAtacante = new Coordenada(16,16);
        mapa.agregar(dragon,coordAtacante);
        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( ObjetivoFueraDeRango.class, ()-> {
            mapa.atacar(dragon,coordDefensor);});
    }
    @Test
    public void unScoutNoPuedeAtacarAlgoAUnRangoMayorA4(){
        Mapa mapa = new Mapa(20,20);
        mapa.agregar(new Criadero(0),new Coordenada(3,3));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0),new Coordenada(3,4));

        Zerling zerling = new Zerling();
        Coordenada coordDefensor = new Coordenada(4,4);
        mapa.agregar(zerling,coordDefensor);
        mapa.avanzarTurno();

        mapa.agregar(new Pilon(0),new Coordenada(13,13));
        mapa.avanzarTurno();
        mapa.agregar(new Acceso(0),new Coordenada(13,14));
        mapa.agregar(new PuertoEstelar(0),new Coordenada(13,15));

        Scout scout = new Scout();
        Coordenada coordAtacante = new Coordenada(16,16);
        mapa.agregar(scout,coordAtacante);
        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( ObjetivoFueraDeRango.class, ()-> {
            mapa.atacar(scout,coordDefensor);});
    }



}
