package edu.fiuba.algo3.entrega_1.CasoDeUso11;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso11Test {

    @Test
    public void SeDañaAUnPuertoEstelarYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 600;
        PuertoEstelar puerto = new PuertoEstelar(0);
        Zerling zerling = new Zerling();

        zerling.atacar(puerto);
        //Usar mockito, verificar que le saca vida el zerling a la construccion... y en todos los tests de abajo
        for (int i = 0; i < 3; i++) {
            puerto.avanzarTurno();
        }
        int resultado = puerto.obtenerEscudo();
        assertEquals(resultado, esperado);
    }
    @Test
    public void SeDañaAUnPilonYDeberiaRecuperarElEscudoPorCadaTurno(){
        int esperado = 300;
        Pilon pilon = new Pilon(0);
        Zerling zerling = new Zerling();

        zerling.atacar(pilon);

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
        Zerling zerling = new Zerling();

        zerling.atacar(nexo);

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
        Zerling zerling = new Zerling();

        zerling.atacar(asimilador);

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
        Zerling zerling = new Zerling();

        zerling.atacar(acceso);

        for (int i = 0; i < 3; i++) {
            acceso.avanzarTurno();
        }
        int resultado = acceso.obtenerEscudo();//Esto habria que ponerlo en construccion
        assertEquals(resultado, esperado);
    }
}
