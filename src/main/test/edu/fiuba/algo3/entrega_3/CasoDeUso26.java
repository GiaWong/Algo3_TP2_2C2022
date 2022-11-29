package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import org.junit.jupiter.api.Test;

public class CasoDeUso26 {

    @Test
    public void  SeIntentaConstruirUnaUnidadConLosSuministrosSuficientes(){
        Raza protoss = new Protoss();
        protoss.comprar(new Zealot());

    }
}
