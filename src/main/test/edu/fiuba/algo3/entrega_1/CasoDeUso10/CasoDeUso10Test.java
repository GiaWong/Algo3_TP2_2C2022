package edu.fiuba.algo3.entrega_1.CasoDeUso10;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso10Test {

    @Test
    public void SeDañaAUnCriaderoYDeberiaRecuperarLaVidaPorCadaTurno(){
        int esperado = 500;
        Construccion criadero = new Criadero();
        criadero.quitarVida(30);
        criadero.avanzarTurno();
        criadero.avanzarTurno();
        criadero.avanzarTurno();
        int resultado = criadero.obtenerVida();
        assertEquals(resultado, esperado);
    }
}
