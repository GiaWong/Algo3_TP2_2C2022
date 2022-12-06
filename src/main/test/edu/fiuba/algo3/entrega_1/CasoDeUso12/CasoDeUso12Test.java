package edu.fiuba.algo3.entrega_1.CasoDeUso12;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CasoDeUso12Test {

    Mapa mapa = mock(Mapa.class);
    @Test
    public void SeDaniaAUnPuertoEstelarYDeberiaRecuperarElEsucudoPorCadaTurnoPeroNoLaVida() {
        int escudoesperado = 600;
        int vidaesperada = 570;

        PuertoEstelar puerto = new PuertoEstelar(0);

        puerto.recibirDanio(new Danio(630));
        for(int i = 0; i<60; i++){
            puerto.avanzarTurno(mapa);
        }
        int resultadoEscudo = puerto.obtenerEscudo();//Esto habria que ponerlo en construccion
        int resultadoVida = puerto.obtenerVida();//Esto habria que ponerlo en construccion
        assertEquals(escudoesperado, resultadoEscudo);
        assertEquals(vidaesperada, resultadoVida);

    }
    @Test
    public void SeDaniaAUnPilonYDeberiaRecuperarElEsucudoPorCadaTurnoPeroNoLaVida(){
        int escudoesperado = 300;
        int vidaesperada = 270;
        Pilon pilon = new Pilon();
        for(int i = 0; i<5; i++){
            pilon.avanzarTurno(mapa);
        }
        pilon.recibirDanio(new Danio(330));
        for(int i = 0; i<30; i++){
            pilon.avanzarTurno(mapa);
        }
        int resultadoEscudo = pilon.obtenerEscudo();//Esto habria que ponerlo en construccion
        int resultadoVida = pilon.obtenerVida();//Esto habria que ponerlo en construccion
        assertEquals(escudoesperado, resultadoEscudo);
        assertEquals(vidaesperada, resultadoVida);
    }
    @Test
    public void SeDaniaAUnNexoMineralYDeberiaRecuperarElEsucudoPorCadaTurnoPeroNoLaVida(){
        int escudoesperado = 250;
        int vidaesperada = 220;
        NexoMineral nexo = new NexoMineral();
        for(int i = 0; i<4; i++){
            nexo.avanzarTurno(mapa);
        }
        nexo.recibirDanio(new Danio(280));
        for(int i = 0; i<25; i++){
            nexo.avanzarTurno(mapa);
        }
        int resultadoEscudo = nexo.obtenerEscudo();
        int resultadoVida = nexo.obtenerVida();
        assertEquals(escudoesperado, resultadoEscudo);
        assertEquals(vidaesperada, resultadoVida);
    }
    @Test
    public void SeDaniaAUnAsimiladorYDeberiaRecuperarElEsucudoPorCadaTurnoPeroNoLaVida(){
        int escudoesperado = 450;
        int vidaesperada = 420;
        Asimilador asimilador = new Asimilador();
        for(int i = 0; i<6; i++){
            asimilador.avanzarTurno(mapa);
        }
        asimilador.recibirDanio(new Danio(480));
        for(int i = 0; i<45; i++){
            asimilador.avanzarTurno(mapa);
        }
        int resultadoEscudo = asimilador.obtenerEscudo();
        int resultadoVida = asimilador.obtenerVida();
        assertEquals(escudoesperado, resultadoEscudo);
        assertEquals(vidaesperada, resultadoVida);
    }
    @Test
    public void SeDaniaAUnAccesoYDeberiaRecuperarElEsucudoPorCadaTurnoPeroNoLaVida(){
        int escudoesperado = 500;
        int vidaesperada = 470;
        Acceso acceso = new Acceso();
        for(int i = 0; i<8; i++){
            acceso.avanzarTurno(mapa);
        }
        acceso.recibirDanio(new Danio(530));
        for(int i = 0; i<50; i++){
            acceso.avanzarTurno(mapa);
        }
        int resultadoEscudo = acceso.obtenerEscudo();
        int resultadoVida = acceso.obtenerVida();
        assertEquals(escudoesperado, resultadoEscudo);
        assertEquals(vidaesperada, resultadoVida);
    }

}
