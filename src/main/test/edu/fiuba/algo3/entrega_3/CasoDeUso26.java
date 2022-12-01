package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Exception.HasLlegadAlLimiteDeUnidadesCreadas;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Unidades.Scout;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static javafx.beans.binding.Bindings.when;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CasoDeUso26 {

    @Test
    public void  SeIntentaConstruirUnaUnidadConLosSuministrosSuficientes(){
         Zealot zealot = new Zealot();
        Protoss protoss = new Protoss();
        protoss.comprar(zealot);
        assertEquals(2,protoss.capacidadActual());
    }

    @Test
    public void  SeIntentaConstruirUnaUnidadSinLosSuministrosSuficientes(){
        Zealot zealot = new Zealot();
        Suministro suministro = new Suministro(0);
        Protoss protoss = new Protoss(suministro);

        assertThrows(HasLlegadAlLimiteDeUnidadesCreadas.class,()->{ protoss.comprar(zealot);;});
    }

}
