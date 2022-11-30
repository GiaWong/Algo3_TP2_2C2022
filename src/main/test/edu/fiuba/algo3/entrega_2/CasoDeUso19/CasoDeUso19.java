package edu.fiuba.algo3.entrega_2.CasoDeUso19;

import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso19 {

    @Test
    public void ZerlingAtacaUnScoutYNoDeberiaHacerleDaño(){ //Esto es para checkear lo de los AtaqueAire y AtaqueTierra
        Mapa mapa = new Mapa(20,20);
        Unidad zerling = new Zerling();
        UnidadProtoss scout = new Scout();
        Coordenada coordAtacada = new Coordenada(11,10);
        mapa.agregar(scout,coordAtacada);
        mapa.agregar(zerling,new Coordenada(10,10));
        mapa.atacar(zerling,coordAtacada);

        assertEquals(100,scout.escudo());
    }

    @Test
    public void MutaAtacaUnZerlingYDeberiaHacerleDaño(){
        Mapa mapa = new Mapa(20,20);
        Unidad zerling = new Zerling();
        Unidad muta = new Mutalisco();
        Coordenada coordAtacada = new Coordenada(10,10);

        mapa.agregar(muta,new Coordenada(11,10));
        mapa.agregar(zerling,coordAtacada);
        mapa.atacar(muta,coordAtacada);

        assertEquals(26,zerling.vida());
    }

    @Test
    public void MutaliscoAtacaUnScoutYNoDeberiaHacerleDaño(){
        Mapa mapa = new Mapa(20,20);
        Unidad muta = new Mutalisco();
        Unidad scout = new Scout();
        Coordenada coordAtacada = new Coordenada(10,10);
        mapa.agregar(scout, coordAtacada);
        mapa.agregar(muta, new Coordenada(11,10));
        mapa.atacar(muta, coordAtacada);

        assertEquals(150,scout.vida());
    }



    @Test
    public void ZerlingAtacaUnHidraliscoYDeberiaHacerleDaño(){
        Mapa mapa = new Mapa(20,20);
        Unidad zerling = new Zerling();
        Unidad hidralisco = new Hidralisco();
        Coordenada coordAtacada = new Coordenada(10,10);

        mapa.agregar(hidralisco, coordAtacada);
        mapa.agregar(zerling, new Coordenada(11,10));
        mapa.atacar(zerling, coordAtacada);

        assertEquals(76,hidralisco.vida());
    }

}
