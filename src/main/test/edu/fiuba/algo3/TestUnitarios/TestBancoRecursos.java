package edu.fiuba.algo3.TestUnitarios;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Unidades.Scout;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class TestBancoRecursos {
    Scout scout = mock(Scout.class);
    Construccion Acceso = mock(Construccion.class);

    @Test
    public void SeCompraUnaUnidadSinLosRecursosNecesarios(){
        BancoDeRecursos banco = new BancoDeRecursos();
        List<Integer> costos = new ArrayList<Integer>();
        costos.add(25);
        costos.add(25);
        when(scout.costo()).thenReturn(costos);

        assertThrows(NoHayRecursosSuficientes.class,()->{banco.comprar(scout);});
        verify(scout).costo();
    }

    @Test
    public void SeCompraUnaConstruccionSinLosRecursosNecesarios(){
        BancoDeRecursos banco = new BancoDeRecursos();
        List<Integer> costos = new ArrayList<Integer>();
        costos.add(25);
        costos.add(25);
        when(Acceso.costo()).thenReturn(costos);

        assertThrows(NoHayRecursosSuficientes.class,()->{banco.comprar(Acceso);});
        verify(Acceso).costo();
    }

    @Test
    public void SeCompraUnaUnidadConLosRecursosNecesarios(){
        BancoDeRecursos banco = new BancoDeRecursos();
        List<Integer> costos = new ArrayList<Integer>();
        costos.add(25);
        costos.add(0);
        when(scout.costo()).thenReturn(costos);
        banco.comprar(scout);
        verify(scout).costo();
    }

    @Test
    public void SeCompraUnaConstruccionConLosRecursosNecesarios(){
        BancoDeRecursos banco = new BancoDeRecursos();
        List<Integer> costos = new ArrayList<Integer>();
        costos.add(25);
        costos.add(0);
        when(Acceso.costo()).thenReturn(costos);
        banco.comprar(Acceso);
        verify(Acceso).costo();
    }

}
