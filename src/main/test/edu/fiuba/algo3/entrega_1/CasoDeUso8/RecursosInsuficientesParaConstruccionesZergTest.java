package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.Exceptions.ErrorRecursosInsuficientesParaConstruir;
import edu.fiuba.algo3.modelo.Imperio.ImperioZerg;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursosInsuficientesParaConstruccionesZergTest {
    @Test
    public void SeIntentaConstruirUnCriaderoConRecursosInsuficientesYLanzaError(){

        Mapa mapa = new Mapa();
        ImperioZerg imperio = new ImperioZerg(); //se inicia con 100 M y 100 G para poder empezar a jugar
        imperio.criadero(mapa, 0,2);
        imperio.criadero(mapa, 0,6);
        assertThrows(ErrorRecursosInsuficientesParaConstruir.class,()->imperio.criadero(mapa,0,7));
    }

    @Test
    public void SeIntentaConstruirUnaReservaDeProduccionConRecursosInsuficientesYLanzaError(){

        Mapa mapa = new Mapa();
        ImperioZerg imperio = new ImperioZerg(); //se inicia con 100 M y 100 G para poder empezar a jugar
        assertThrows(ErrorRecursosInsuficientesParaConstruir.class,()->imperio.reserva(mapa,0,7));
    }

    @Test
    public void SeIntentaConstruirUnExtractorConRecursosInsuficientesYLanzaError(){

        Mapa mapa = new Mapa();
        ImperioZerg imperio = new ImperioZerg(); //se inicia con 100 M y 100 G para poder empezar a jugar
        imperio.criadero(mapa,0,5); //esto es para gastar minerales
        assertThrows(ErrorRecursosInsuficientesParaConstruir.class,()->imperio.extractor(mapa,0,7));
    }

    @Test
    public void SeIntentaConstruirUnaGuaridaConRecursosInsuficientesYLanzaError(){

        Mapa mapa = new Mapa();
        ImperioZerg imperio = new ImperioZerg(); //se inicia con 100 M y 100 G para poder empezar a jugar
        assertThrows(ErrorRecursosInsuficientesParaConstruir.class,()->imperio.guarida(mapa,0,7));
    }

    @Test
    public void SeIntentaConstruirUnaEspiralConRecursosInsuficientesYLanzaError(){

        Mapa mapa = new Mapa();
        ImperioZerg imperio = new ImperioZerg(); //se inicia con 100 M y 100 G para poder empezar a jugar
        assertThrows(ErrorRecursosInsuficientesParaConstruir.class,()->imperio.espiral(mapa,0,7));
    }

}
