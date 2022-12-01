package edu.fiuba.algo3.TestUnitarios;

import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestAtaque {
    Zerling zerling = mock(Zerling.class);
    Mapa mapa = mock(Mapa.class);

    @Test
    public void AtaqueZealotAUnidadZerg(){
        int esperado = 35;
        Zealot zealot = new Zealot();
        Coordenada coordenada = new Coordenada(5,5);
        Coordenada coordenada1 = new Coordenada(5,6);
        when(zerling.obtenerVida()).thenReturn(35);
        mapa.agregar(zealot,coordenada);
        mapa.agregar(zerling,coordenada1);
        zealot.atacar(zerling);
        assertEquals(esperado,zerling.obtenerVida());
    }
}
