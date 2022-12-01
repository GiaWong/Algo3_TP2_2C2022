package edu.fiuba.algo3.entrega_1.CasoDeUso11;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Construccion.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso11Test {

    @Test
    public void SeDañaAUnPuertoEstelarYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 600;
        PuertoEstelar puerto = new PuertoEstelar();
        for (int i = 0; i < 10; i++) {
            puerto.avanzarTurno(); //queda operativo
        }
        puerto.recibirDanio(new Danio(30));
        for (int i = 0; i < 3; i++) {
            puerto.avanzarTurno();
        }
        int resultado = puerto.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnPilonYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 300;
        Pilon pilon = new Pilon();
        for (int i = 0; i < 5; i++) {
            pilon.avanzarTurno(); //queda operativo
        }
        pilon.recibirDanio(new Danio(30));
        for (int i = 0; i < 3; i++) {
            pilon.avanzarTurno();
        }
        int resultado = pilon.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnNexoMineralYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 250;
        NexoMineral nexo = new NexoMineral();
        for (int i = 0; i < 4; i++) {
            nexo.avanzarTurno();
        }
        nexo.recibirDanio(new Danio(30));
        for (int i = 0; i < 3; i++) {
            nexo.avanzarTurno();
        }
        int resultado = nexo.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnAsimiladorYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 450;
        Asimilador asimilador = new Asimilador();
        for (int i = 0; i < 6; i++) {
            asimilador.avanzarTurno();
        }
        asimilador.recibirDanio(new Danio(30));
        for (int i = 0; i < 3; i++) {
            asimilador.avanzarTurno();
        }
        int resultado = asimilador.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnAccesoYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 500;
        Acceso acceso = new Acceso();
        for (int i = 0; i < 3; i++) {
            acceso.avanzarTurno();
        }
        acceso.recibirDanio(new Danio(30));
        for (int i = 0; i < 3; i++) {
            acceso.avanzarTurno();
        }
        int resultado = acceso.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
}
