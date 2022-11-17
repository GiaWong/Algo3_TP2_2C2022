package edu.fiuba.algo3.entrega_2.CasoDeUso19;

import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import java.nio.file.StandardCopyOption;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso19 {

    @Test
    public void ZerlingAtacaUnScoutYNoDeberiaHacerleDaño(){
        Mapa mapa = new Mapa();
        Zerling zerling = new Zerling();
        Espiral espiral = new Espiral();
        espiral.conZerg(new Mutalisco());//ver en reserva en dond se guardaré zerlings, lista? //cambiar nombre con eevolucionar
        Mutalisco muta = espiral.obtenerZerg();
        mapa.agregar(muta,11,10);

        Unidad mutalisco = new Mutalisco();
        mapa.agregar(zerling,10,10);
        mapa.agregar(mutalisco,11,10);
        mapa.atacar(zerling,11,10);

        assertEquals(120,mutalisco.vida());
    }

    @Test
    public void MutaAtacaUnZerlingYDeberiaHacerleDaño(){
        Mapa mapa = new Mapa();
        Zerling zerling = new Zerling();
        Espiral espiral = new Espiral();
        espiral.conZerg(new Mutalisco());//ver en reserva en dond se guardaré zerlings, lista? //cambiar nombre con eevolucionar
        Mutalisco muta = espiral.obtenerZerg();
        mapa.agregar(muta,11,10);
        mapa.agregar(zerling,10,10);
        mapa.atacar(muta,10,10);

        assertEquals(26,zerling.vida());
    }

    @Test
    public void MutaliscoAtacaUnScoutYNoDeberiaHacerleDaño(){
        Mapa mapa = new Mapa();

        Mutalisco muta = new Mutalisco();
        mapa.agregar(muta,11,10);
        Scout scout = new Scout();
        mapa.agregar(scout,10,10);
        mapa.agregar(muta,11,10);
        mapa.atacar(scout,11,10);

        assertEquals(106,muta.vida());
    }



    @Test
    public void ZerlingAtacaUnHidraliscoYDeberiaHacerleDaño(){
        Mapa mapa = new Mapa();
        Zerling zerling = new Zerling();
        mapa.agregar(zerling,11,10);
        Hidralisco hidralisco = new Hidralisco();
        mapa.agregar(hidralisco,10,10);
        mapa.agregar(zerling,11,10);
        mapa.atacar(zerling,10,10);

        assertEquals(76,hidralisco.vida());
    }

}
