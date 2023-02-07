package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionProtoss;

import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Construccion.PuertoEstelar;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ConstruccionProtosTests { //Ver como modificar para que no lanze un error cuando el edificio no esta operativo!



    @Test
    public void SeArrancaAConstruirNexoMineralYNoPasanTurnosYDeberiaEstarInactivo() {
        NodoMineral nodo = new NodoMineral();
        NexoMineral nexo = new NexoMineral();
        assertThrows( EdificioNoEstaOperativo.class, ()->{nexo.recolectar(nodo);});
    }

    @Test
    public void SeArrancaAConstruirNexoMineralYPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Mapa mapa = new Mapa(20,20);
        NodoMineral nodo = new NodoMineral();
        NexoMineral nexo = new NexoMineral();
        nexo.avanzarTurno(mapa);
        assertThrows( EdificioNoEstaOperativo.class, ()->{nexo.recolectar(nodo);});
    }



    @Test
    public void SeTerminaDeConstruirNexoMineralYDeberiaEstarActivo() {
        Mapa mapa = new Mapa(20,20);
        NodoMineral nodo = new NodoMineral();
        NexoMineral nexo = new NexoMineral();
        for(int i =0 ; i<=3;i++) {
            nexo.avanzarTurno(mapa);
        }
        assertDoesNotThrow(()->{nexo.recolectar(nodo);});
    }


    @Test
    public void SeArrancaAConstruirPilonYNoPasanTurnosYDeberiaEstarInactivo() {
        Pilon pilon = new Pilon();
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenada = new Coordenada(1,2);
        mapa.agregar(pilon,coordenada);
        assertThrows( EdificioNoEstaOperativo.class, ()->{pilon.energizar(mapa);});
    }

    @Test
    public void SeArrancaAConstruirPilonYPasanUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Pilon pilon = new Pilon();
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenada = new Coordenada(1,2);
        mapa.agregar(pilon,coordenada);
        pilon.avanzarTurno(mapa);
        assertThrows( EdificioNoEstaOperativo.class, ()->{pilon.energizar(mapa);});
    }

    @Test
    public void SeTerminaDeConstruirPilonYDeberiaEstarActivo() {
        Pilon pilon = new Pilon();
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenada = new Coordenada(1,2);
        mapa.agregar(pilon,coordenada);
        for(int i =0 ; i<=4;i++) {

            pilon.avanzarTurno(mapa);
        }
        assertDoesNotThrow(()->{pilon.energizar(mapa);});
    }


    @Test
    public void SeArrancaAConstruirAsimiladorYNoPasanTurnosYDeberiaEstarInactivo() {
        Volcan volcan = new Volcan();
        Asimilador asimilador = new Asimilador();
        assertThrows( EdificioNoEstaOperativo.class, ()->{asimilador.recolectar(volcan);});
    }
    @Test
    public void SeArrancaAConstruirAsimiladorYPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Volcan volcan = new Volcan();
        Asimilador asimilador = new Asimilador();
        Mapa mapa = new Mapa(20,20);
        asimilador.avanzarTurno(mapa);
        assertThrows( EdificioNoEstaOperativo.class, ()->{asimilador.recolectar(volcan);});
    }

    @Test
    public void SeTerminaDeConstruirAsimiladorYDeberiaEstarActivo() {
        Volcan volcan = new Volcan();
        Asimilador asimilador = new Asimilador();
        Mapa mapa = new Mapa(20,20);
        for(int i =0 ; i<=5;i++) {

            asimilador.avanzarTurno(mapa);
        }
        assertDoesNotThrow(()->{asimilador.recolectar(volcan);});
    }

    /*


    @Test
    public void SeArrancaAConstruirAccesoYNoPasanTurnosYDeberiaEstarInactivo() {
        Acceso acceso = new Acceso();
        assertThrows( EdificioNoEstaOperativo.class, acceso::crearDragon);
    }

    @Test
    public void SeArrancaAConstruirAccesoYPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Acceso acceso = new Acceso();
        acceso.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, acceso::crearZealot);

    }

    @Test
    public void SeTerminaDeConstruirAccesoYDeberiaEstarActivo() {

        Acceso acceso = new Acceso();
        for(int i =0 ; i<=7;i++) {

            acceso.avanzarTurno();
        }
        assertDoesNotThrow(acceso::crearDragon);
    }

    @Test
    public void SeArrancaAConstruirPuertoEstelarYNoPasanTurnosYDeberiaEstarInactivo() {
        PuertoEstelar puerto = new PuertoEstelar();
        assertThrows( EdificioNoEstaOperativo.class, puerto::crearScout);
    }

    @Test
    public void SeArrancaAConstruirPuertoEstelarYPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        PuertoEstelar puerto = new PuertoEstelar();
        puerto.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, puerto::crearScout);
    }

    @Test
    public void SeTerminaDeConstruirPuertoEstelarYDeberiaEstarActivo() {

        PuertoEstelar puerto = new PuertoEstelar();
        for(int i =0 ; i<=10;i++) {
            puerto.avanzarTurno();
        }
        assertDoesNotThrow(puerto::crearScout);
    }

     */




}
