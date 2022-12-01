package edu.fiuba.algo3.entrega_1.CasoDeUso11;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CasoDeUso11Test {

    PuertoEstelar puerto = mock(PuertoEstelar.class);
    Pilon pilon = mock(Pilon.class);
    NexoMineral nexo = mock(NexoMineral.class);
    Acceso acceso = mock(Acceso.class);
    Asimilador asimilador = mock(Asimilador.class);
    @Test
    public void SeDañaAUnPuertoEstelarYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 600;
        Zerling zerling = new Zerling();
        zerling.atacar(puerto);
        when(puerto.obtenerEscudo()).thenReturn(596);

        for (int i = 0; i < 3; i++) {
            puerto.avanzarTurno();
        }
        int resultado = puerto.obtenerEscudo();
        assertEquals(esperado,resultado );

    }
    @Test
    public void SeDañaAUnPilonYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 300;
        Zerling zerling = new Zerling();

        zerling.atacar(pilon);
        when(pilon.obtenerEscudo()).thenReturn(296);

        for (int i = 0; i < 3; i++) {
            pilon.avanzarTurno();
        }
        int resultado = pilon.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(esperado,resultado );

    }
    @Test
    public void SeDañaAUnNexoMineralYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 250;
        Zerling zerling = new Zerling();

        zerling.atacar(nexo);
        when(nexo.obtenerEscudo()).thenReturn(246);

        for (int i = 0; i < 3; i++) {
            puerto.avanzarTurno();
        }
        int resultado = nexo.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(esperado,resultado );

    }
    @Test
    public void SeDañaAUnAsimiladorYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 450;
        Zerling zerling = new Zerling();

        zerling.atacar(asimilador);
        when(asimilador.obtenerEscudo()).thenReturn(446);

        for (int i = 0; i < 3; i++) {
            puerto.avanzarTurno();
        }
        int resultado = asimilador.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(esperado,resultado );

    }
    @Test
    public void SeDañaAUnAccesoYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 500;
        Zerling zerling = new Zerling();

        zerling.atacar(acceso);
        when(acceso.obtenerEscudo()).thenReturn(496);

        for (int i = 0; i < 3; i++) {
            puerto.avanzarTurno();
        }
        int resultado = acceso.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(esperado,resultado );
    }
}
