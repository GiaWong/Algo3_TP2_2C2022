package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Exception.HasLlegadAlLimiteDeUnidadesCreadas;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Scout;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class CasoDeUso30 {

    BancoDeRecursos banco = mock(BancoDeRecursos.class);
    Coordenada coordenada = mock(Coordenada.class);
    Mapa mapa = mock(Mapa.class);

    @Test
    public void testNoPuedeSuperarLaCapacidadDe200suministrosConZerling() {
        Zerg zerg = new Zerg(banco);
        for (int i =0 ;i<200;i++) {
            zerg.agregar(new Zerling(),coordenada,mapa);
        }

        assertThrows(HasLlegadAlLimiteDeUnidadesCreadas.class,()->{zerg.agregar(new Zerling(),coordenada,mapa);});

    }

    @Test
    public void testNoPuedeSuperarLaCapacidadDe200suministrosConScouts() {
        Protoss protoss = new Protoss(banco);
        for (int i =0 ;i<50;i++) {
            protoss.agregar(new Scout(),coordenada,mapa);
        }
        assertThrows(HasLlegadAlLimiteDeUnidadesCreadas.class,()->{protoss.agregar(new Scout(),coordenada,mapa);});
    }


}
