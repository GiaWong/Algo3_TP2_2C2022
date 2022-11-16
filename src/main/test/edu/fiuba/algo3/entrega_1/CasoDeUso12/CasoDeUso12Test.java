package edu.fiuba.algo3.entrega_1.CasoDeUso12;

import edu.fiuba.algo3.modelo.Construccion.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso12Test {


    @Test
    public void SeDañaAUnPuertoEstelarYDeberiaRecuperarElEsucudoPorCadaTurnoPeroNoLaVida(){
        int escudoesperado = 600;
        int vidaesperada = 570;

        PuertoEstelar puerto = new PuertoEstelar();
        puerto.recibeDanio(630);
        for(int i = 0; i<60; i++){
            puerto.avanzarTurno();
        }
        int resultadoEscudo = puerto.obtenerEscudo();//Esto habria que ponerlo en construccion
        int resultadoVida = puerto.obtenerVida();//Esto habria que ponerlo en construccion
        assertEquals(escudoesperado, resultadoEscudo);
        assertEquals(vidaesperada, resultadoVida);

    }
    @Test
    public void SeDañaAUnPilonYDeberiaRecuperarElEsucudoPorCadaTurnoPeroNoLaVida(){
        int escudoesperado = 300;
        int vidaesperada = 270;
        Pilon pilon = new Pilon();
        pilon.recibeDanio(330);
        for(int i = 0; i<30; i++){
            pilon.avanzarTurno();
        }
        int resultadoEscudo = pilon.obtenerEscudo();//Esto habria que ponerlo en construccion
        int resultadoVida = pilon.obtenerVida();//Esto habria que ponerlo en construccion
        assertEquals(escudoesperado, resultadoEscudo);
        assertEquals(vidaesperada, resultadoVida);
    }
    @Test
    public void SeDañaAUnNexoMineralYDeberiaRecuperarElEsucudoPorCadaTurnoPeroNoLaVida(){
        int escudoesperado = 250;
        int vidaesperada = 220;
        NexoMineral nexo = new NexoMineral();
        nexo.recibeDanio(280);
        for(int i = 0; i<25; i++){
            nexo.avanzarTurno();
        }
        int resultadoEscudo = nexo.obtenerEscudo();
        int resultadoVida = nexo.obtenerVida();
        assertEquals(escudoesperado, resultadoEscudo);
        assertEquals(vidaesperada, resultadoVida);
    }
    @Test
    public void SeDañaAUnAsimiladorYDeberiaRecuperarElEsucudoPorCadaTurnoPeroNoLaVida(){
        int esperado = 450;
        int escudoesperado = 450;
        int vidaesperada = 420;
        Asimilador asimilador = new Asimilador();
        asimilador.recibeDanio(480);
        for(int i = 0; i<45; i++){
            asimilador.avanzarTurno();
        }
        int resultadoEscudo = asimilador.obtenerEscudo();
        int resultadoVida = asimilador.obtenerVida();
        assertEquals(escudoesperado, resultadoEscudo);
        assertEquals(vidaesperada, resultadoVida);
    }
    @Test
    public void SeDañaAUnAccesoYDeberiaRecuperarElEsucudoPorCadaTurnoPeroNoLaVida(){
        int esperado = 500;
        int escudoesperado = 500;
        int vidaesperada = 470;
        Acceso acceso = new Acceso();
        acceso.recibeDanio(530);
        for(int i = 0; i<50; i++){
            acceso.avanzarTurno();
        }
        int resultadoEscudo = acceso.obtenerEscudo();
        int resultadoVida = acceso.obtenerVida();
        assertEquals(escudoesperado, resultadoEscudo);
        assertEquals(vidaesperada, resultadoVida);
    }
}
