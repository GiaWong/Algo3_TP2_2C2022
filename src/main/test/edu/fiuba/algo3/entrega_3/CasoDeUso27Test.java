package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso27Test {
    BancoDeRecursos banco = mock(BancoDeRecursos.class);
    @Test
    public void SeEvolucionaUnMutaliscoYDeberiaPoderEvolucionarADevorador(){
        Mutalisco mutalisco = new Mutalisco();
        Unidad devorador = mutalisco.evolucionarDevorador(banco);
        devorador.atacar(mutalisco);
        assertEquals(105,mutalisco.obtenerVida());
    }

    @Test
    public void SeEvolucionaUnMutaliscoYNoDeberiaPoderEvolucionarADevorador(){
        BancoDeRecursos bancoDeRecursos = new BancoDeRecursos();
        Mutalisco mutalisco = new Mutalisco();
        assertThrows(NoHayRecursosSuficientes.class,()-> mutalisco.evolucionarDevorador(bancoDeRecursos));

    }
    @Test
    public void testUnDevoradorAtacaAUnZealotYNoLeDeberiaHacerDanio(){
        Mutalisco mutalisco = new Mutalisco();
        Unidad devorador = mutalisco.evolucionarDevorador(banco);
        Zealot zealot = new Zealot();
        devorador.atacar(mutalisco);
        assertEquals(100,zealot.obtenerEscudo());
    }

    @Test
    public void testUnDevoradorAtacaAUnScoutLeDeberiaHacerDanio(){
        Mutalisco mutalisco = new Mutalisco();
        Unidad devorador = mutalisco.evolucionarDevorador(banco);
        Scout scout = new Scout();
        devorador.atacar(scout);
        assertEquals(85,scout.obtenerEscudo());
    }
}
