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


public class ConstruccionProtosTests {

    @Test
    public void SeArrancaAConstruirNexoMineralYNoPasanTurnosYDeberiaEstarInactivo() {
        NodoMineral nodo = new NodoMineral();
        NexoMineral nexo = new NexoMineral();
        assertThrows( EdificioNoEstaOperativo.class, ()->{nexo.recolectar(nodo);});
    }

    @Test
    public void SeArrancaAConstruirNexoMineralYPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        NodoMineral nodo = new NodoMineral();
        NexoMineral nexo = new NexoMineral();
        nexo.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, ()->{nexo.recolectar(nodo);});
    }

    @Test
    public void SeTerminaDeConstruirNexoMineralYDeberiaEstarActivo() {
        NodoMineral nodo = new NodoMineral();
        NexoMineral nexo = new NexoMineral();
        for(int i =0 ; i<=3;i++) {
            nexo.avanzarTurno();
        }
        assertDoesNotThrow(()->{nexo.recolectar(nodo);});
    }

    @Test
    public void SeArrancaAConstruirPilonYNoPasanTurnosYDeberiaEstarInactivo() {
        Pilon pilon = new Pilon();
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenada = new Coordenada(1,2);
        assertThrows( EdificioNoEstaOperativo.class, ()->{pilon.energizar(mapa,coordenada);});
    }

    @Test
    public void SeArrancaAConstruirPilonYPasanUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Pilon pilon = new Pilon();
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenada = new Coordenada(1,2);
        pilon.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, ()->{pilon.energizar(mapa,coordenada);});
    }

    @Test
    public void SeTerminaDeConstruirPilonYDeberiaEstarActivo() {
        Pilon pilon = new Pilon();
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenada = new Coordenada(1,2);
        for(int i =0 ; i<=4;i++) {

            pilon.avanzarTurno();
        }
        assertDoesNotThrow(()->{pilon.energizar(mapa,coordenada);});
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
        asimilador.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, ()->{asimilador.recolectar(volcan);});
    }

    @Test
    public void SeTerminaDeConstruirAsimiladorYDeberiaEstarActivo() {
        Volcan volcan = new Volcan();
        Asimilador asimilador = new Asimilador();
        for(int i =0 ; i<=5;i++) {

            asimilador.avanzarTurno();
        }
        assertDoesNotThrow(()->{asimilador.recolectar(volcan);});
    }

    @Test
    public void SeArrancaAConstruirAccesoYNoPasanTurnosYDeberiaEstarInactivo() {
        Acceso acceso = new Acceso();
        assertThrows( EdificioNoEstaOperativo.class, acceso::crearUnidad);
    }

    @Test
    public void SeArrancaAConstruirAccesoYPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Acceso acceso = new Acceso();
        acceso.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, acceso::crearUnidad);
    }

    @Test
    public void SeTerminaDeConstruirAccesoYDeberiaEstarActivo() {

        Acceso acceso = new Acceso();
        for(int i =0 ; i<=7;i++) {

            acceso.avanzarTurno();
        }
        assertDoesNotThrow(acceso::crearUnidad);
    }

    @Test
    public void SeArrancaAConstruirPuertoEstelarYNoPasanTurnosYDeberiaEstarInactivo() {
        Acceso acceso = new Acceso();
        Mapa mapa = new Mapa(20,20);
        mapa.agregar(acceso,new Coordenada(1,3));
        PuertoEstelar puerto = new PuertoEstelar();
        mapa.agregar(puerto,new Coordenada(1,9));
        assertThrows( EdificioNoEstaOperativo.class, puerto::crearUnidad);
    }

    @Test
    public void SeArrancaAConstruirPuertoEstelarYPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Acceso acceso = new Acceso();
        Mapa mapa = new Mapa(20,20);
        mapa.agregar(acceso,new Coordenada(1,3));
        PuertoEstelar puerto = new PuertoEstelar();
        mapa.agregar(puerto,new Coordenada(1,9));
        puerto.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, puerto::crearUnidad);
    }

    @Test
    public void SeConstruyePuertoEstelarYDeberiaEstarActivo() {
        Acceso acceso = new Acceso();
        Mapa mapa = new Mapa(20,20);
        mapa.agregar(acceso,new Coordenada(1,3));
        PuertoEstelar puerto = new PuertoEstelar();
        mapa.agregar(puerto,new Coordenada(1,9));
        for(int i =0 ; i<=10;i++) {
            puerto.avanzarTurno();
        }
        assertDoesNotThrow(puerto::crearUnidad);
    }
}
