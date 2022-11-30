package edu.fiuba.algo3.TestUnitarios;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Construccion.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestConstruccion {
    //Criadero criadero = mock(Criadero.class);
    Vida vida = mock(Vida.class);

    @Test
    public void unCriaderoSeCreaCorrectamenteCon3Larvas(){
        Criadero construccion =new Criadero();
        assertEquals(true,construccion.tieneMismaCantidadDeLarvas(3));
    }

    @Test
    public void unCriaderoSeCreaCorrectamenteCon500DeVida(){
        Criadero construccion =new Criadero(vida);
        when(vida.vidaActual()).thenReturn(500);
        assertEquals(500,construccion.obtenerVida());
        verify(vida).vidaActual();

    }
    @Test
    public void unPilonSeCreaCorrectamenteCon300Vida(){
        Pilon construccion =new Pilon(vida);
        when(vida.vidaActual()).thenReturn(300);
        assertEquals(300,construccion.obtenerVida());
        verify(vida).vidaActual();
    }

    /*@Test
    public void unEspiralSeCreaCorrectamenteConLaVidaCorrespondiente(){
        Espiral espiral = new Espiral();
        assertEquals(500,espiral.obtenerVida());
    }*/

    @Test
    public void unExtractrSeCreaCorrectamenteConLaVidaCorrespondiente(){
        Acceso acceso=new Acceso();
        assertEquals(500,acceso.obtenerVida());
    }
    @Test
    public void unGuaridaSeCreaCorrectamenteConLaVidaCorrespondiente(){
        ReservaProduccion reserva =new ReservaProduccion();
        assertEquals(1000,reserva.obtenerVida());
    }
    @Test
    public void unPuertoEstelarSeCreaCorrectamenteConLaVidaCorrespondiente(){
        PuertoEstelar construccion =new PuertoEstelar();
        assertEquals(600,construccion.obtenerVida());
    }

}
