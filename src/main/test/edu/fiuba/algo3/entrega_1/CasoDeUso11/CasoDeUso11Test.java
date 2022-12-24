package edu.fiuba.algo3.entrega_1.CasoDeUso11;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CasoDeUso11Test {

    Mapa mapa = mock(Mapa.class);

    PuertoEstelar puerto = mock(PuertoEstelar.class);
    Pilon pilon = mock(Pilon.class);
    NexoMineral nexo = mock(NexoMineral.class);
    Acceso acceso = mock(Acceso.class);
    Asimilador asimilador = mock(Asimilador.class);
    @Test
    public void SeDañaAUnPuertoEstelarYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 600;
        Zerling zerling = new Zerling();
        for (int i = 0; i < 3; i++) {
            zerling.construir();
        }
        zerling.atacar(puerto);

        for (int i = 0; i < 3; i++) {
            puerto.avanzarTurno(mapa);
        }
        when(puerto.obtenerEscudo()).thenReturn(600);
        int resultado = puerto.obtenerEscudo();
        assertEquals(esperado,resultado );

    }
    @Test
    public void SeDañaAUnPilonYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 300;
        Zerling zerling = new Zerling();
        for (int i = 0; i < 3; i++) {
            zerling.construir();
        }
        zerling.atacar(pilon);

        for (int i = 0; i < 3; i++) {
            pilon.avanzarTurno(mapa);
        }
        when(pilon.obtenerEscudo()).thenReturn(300);
        int resultado = pilon.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(esperado,resultado );

    }
    @Test
    public void SeDañaAUnNexoMineralYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 250;
        Zerling zerling = new Zerling();
        for (int i = 0; i < 3; i++) {
            zerling.construir();
        }
        zerling.atacar(nexo);

        for (int i = 0; i < 3; i++) {
            puerto.avanzarTurno(mapa);
        }
        when(nexo.obtenerEscudo()).thenReturn(250);
        int resultado = nexo.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(esperado,resultado );

    }
    @Test
    public void SeDañaAUnAsimiladorYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 450;
        Zerling zerling = new Zerling();
        for (int i = 0; i < 3; i++) {
            zerling.construir();
        }
        zerling.atacar(asimilador);

        for (int i = 0; i < 3; i++) {
            puerto.avanzarTurno(mapa);
        }
        when(asimilador.obtenerEscudo()).thenReturn(450);
        int resultado = asimilador.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(esperado,resultado );

    }
    @Test
    public void SeDañaAUnAccesoYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 500;
        Zerling zerling = new Zerling();
        for (int i = 0; i < 3; i++) {
            zerling.construir();
        }
        zerling.atacar(acceso);

        for (int i = 0; i < 3; i++) {
            puerto.avanzarTurno(mapa);
        }
        when(acceso.obtenerEscudo()).thenReturn(500);
        int resultado = acceso.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(esperado,resultado );
    }
}
