package edu.fiuba.algo3.architecture;

import edu.fiuba.algo3.modelo.Prueba;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


public class TestPrueba {

    @Test
    public void SeConstruyeAlgo(){
        int esperado = 0;
        Prueba prueba = Mockito.mock(Prueba.class);
        prueba.control();
    }

}
