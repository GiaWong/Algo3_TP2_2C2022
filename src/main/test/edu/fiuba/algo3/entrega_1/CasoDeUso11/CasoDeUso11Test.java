package edu.fiuba.algo3.entrega_1.CasoDeUso11;

import edu.fiuba.algo3.modelo.ConstruccionProtoss.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso11Test {
    @Test
    public void SeDañaAUnPuertoEstelarYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 600;
        PuertoEstelar puerto = new PuertoEstelar();
        puerto.recibeDanio(30);
        puerto.avanzarTurno();
        puerto.avanzarTurno();
        puerto.avanzarTurno();
        int resultado = puerto.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnPilonYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 300;
        Pilon pilon = new Pilon();
        pilon.recibeDanio(30);
        pilon.avanzarTurno();
        pilon.avanzarTurno();
        pilon.avanzarTurno();
        int resultado = pilon.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnNexoMineralYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 250;
        NexoMineral nexo = new NexoMineral();
        nexo.recibeDanio(30);
        nexo.avanzarTurno();
        nexo.avanzarTurno();
        nexo.avanzarTurno();
        int resultado = nexo.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnAsimiladorYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 450;
        Asimilador asimilador = new Asimilador();
        asimilador.recibeDanio(30);
        asimilador.avanzarTurno();
        asimilador.avanzarTurno();
        asimilador.avanzarTurno();
        int resultado = asimilador.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnAccesoYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 500;
        Acceso acceso = new Acceso();
        acceso.recibeDanio(30);
        acceso.avanzarTurno();
        acceso.avanzarTurno();
        acceso.avanzarTurno();
        int resultado = acceso.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
}
