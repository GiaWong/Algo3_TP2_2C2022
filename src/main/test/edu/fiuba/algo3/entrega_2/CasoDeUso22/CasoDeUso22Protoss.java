package edu.fiuba.algo3.entrega_2.CasoDeUso22;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.FaltaEdificioParaCrearUnidad;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso22Protoss {

    @Test
    public void unZealotNoSePuedeAgregarAlMapaSiNoExisteAcceso() {
        Zealot zealot = new Zealot();
        Mapa mapa = new Mapa(20,20);


        assertThrows( FaltaEdificioParaCrearUnidad.class, ()->mapa.agregar(zealot,new Coordenada(10,13)));
    }

    @Test
    public void unDragonNoSePuedeAgregarAlMapaSiNoExisteAcceso() {
        Dragon dragon = new Dragon();
        Mapa mapa = new Mapa(20,20);


        assertThrows( FaltaEdificioParaCrearUnidad.class, ()->mapa.agregar(dragon,new Coordenada(10,13)));
    }
    @Test
    public void unScoutNoSePuedeAgregarAlMapaSiNoExistePuertoEstelar() {
        Scout scout = new Scout();
        Mapa mapa = new Mapa(20,20);


        assertThrows( FaltaEdificioParaCrearUnidad.class, ()->mapa.agregar(scout,new Coordenada(10,13)));
    }

    @Test
    public void unZealotOperativoDeberiaPoderAtacar(){

        Zealot zealot = new Zealot();
        for(int i=0; i < 4; i++){
            zealot.avanzarTurno();
        }

        assertDoesNotThrow(()->zealot.atacar(new Zerling()));
    }

    @Test
    public void unDragonOperativoDeberiaPoderAtacar(){

        Dragon dragon = new Dragon();
        for(int i=0; i < 6; i++){
            dragon.avanzarTurno();
        }

        assertDoesNotThrow(()->dragon.atacar(new Zerling()));
    }

    @Test
    public void unScoutOperativoDeberiaPoderAtacar(){

        Scout scout = new Scout();
        for(int i=0; i < 9; i++){
            scout.avanzarTurno();
        }

        assertDoesNotThrow(()->scout.atacar(new Zerling()));
    }

    @Test
    public void unZealotNoOperativoNoDeberiaPoderAtacar(){

        Zealot zealot = new Zealot();

        assertThrows(UnidadNoOperativa.class, ()-> {
            zealot.atacar(new Zerling());
        });
    }

    @Test
    public void unDragonNoOperativoNoDeberiaPoderAtacar(){

        Dragon dragon = new Dragon();

        assertThrows(UnidadNoOperativa.class, ()-> {
            dragon.atacar(new Zerling());
        });
    }

    @Test
    public void unScoutNoOperativoNoDeberiaPoderAtacar(){

        Scout scout = new Scout();

        assertThrows(UnidadNoOperativa.class, ()-> {
            scout.atacar(new Zerling());
        });
    }

}
