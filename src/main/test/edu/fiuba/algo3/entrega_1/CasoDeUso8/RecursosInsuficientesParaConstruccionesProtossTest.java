package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.Exceptions.ErrorRecursosInsuficientesParaConstruir;
import edu.fiuba.algo3.modelo.Imperio.ImperioProtoss;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursosInsuficientesParaConstruccionesProtossTest {
    @Test
    public void SeIntentaConstruirUnNexoMineralConRecursosInsuficientesYLanzaError(){

        Mapa mapa = new Mapa();
        ImperioProtoss imperio = new ImperioProtoss(); //se inicia con 100 M y 100 G para poder empezar a jugar
        imperio.nexoMineral(mapa, 0,2);
        imperio.nexoMineral(mapa, 0,6);
        assertThrows(ErrorRecursosInsuficientesParaConstruir.class,()->imperio.nexoMineral(mapa,0,7));
    }

    @Test
    public void SeIntentaConstruirUnPilonConRecursosInsuficientesYLanzaError(){

        Mapa mapa = new Mapa();
        ImperioProtoss imperio = new ImperioProtoss(); //se inicia con 100 M y 100 G para poder empezar a jugar
        imperio.pilon(mapa, 1,2);
        assertThrows(ErrorRecursosInsuficientesParaConstruir.class,()->imperio.pilon(mapa, 2,6););
    }

    @Test
    public void SeIntentaConstruirUnAsimiladorConRecursosInsuficientesYLanzaError(){

        Mapa mapa = new Mapa();
        ImperioProtoss imperio = new ImperioProtoss(); //se inicia con 100 M y 100 G para poder empezar a jugar
        imperio.asimilador(mapa, 1,2);
        assertThrows(ErrorRecursosInsuficientesParaConstruir.class,()->imperio.asimilador(mapa, 1,8););
    }

    @Test
    public void SeIntentaConstruirUnAccesoConRecursosInsuficientesYLanzaError(){

        Mapa mapa = new Mapa();
        ImperioProtoss imperio = new ImperioProtoss(); //se inicia con 100 M y 100 G para poder empezar a jugar
        assertThrows(ErrorRecursosInsuficientesParaConstruir.class,()->imperio.acceso(mapa,4,7));
    }

    @Test
    public void SeIntentaConstruirUnPuertoEstelarConRecursosInsuficientesYLanzaError(){

        Mapa mapa = new Mapa();
        ImperioProtoss imperio = new ImperioProtoss(); //se inicia con 100 M y 100 G para poder empezar a jugar
        assertThrows(ErrorRecursosInsuficientesParaConstruir.class,()->imperio.puertoEstelar(mapa,4,7));
    }

}
