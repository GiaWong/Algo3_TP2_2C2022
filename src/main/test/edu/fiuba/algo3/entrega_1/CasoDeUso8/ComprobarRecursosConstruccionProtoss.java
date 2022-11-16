package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Vacio;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinNada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComprobarRecursosConstruccionProtoss {


    @Test
    public void SeConstruyeNexoMineralSinRecursosNecesarios(){

        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        casilla.agregarConstruccion(new NexoMineral());
        assertEquals(false, casilla.hayConstruccion());

    }

    @Test
    public void SeConstruyePilonSinRecursosNecesarios(){
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        casilla.agregarConstruccion(new Pilon());
        assertEquals(false, casilla.hayConstruccion());
    }

    @Test
    public void SeConstruyeAsimiladorSinRecursosNecesarios(){
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        casilla.agregarConstruccion(new Asimilador());
        assertEquals(false, casilla.hayConstruccion());

    }

    @Test
    public void SeConstruyeAccesoSinRecursosNecesarios(){
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        casilla.agregarConstruccion(new Acceso());
        assertEquals(false, casilla.hayConstruccion());


    }

    @Test
    public void SeConstruyePuertoEstelarSinRecursosNecesarios(){
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        casilla.agregarConstruccion(new PuertoEstelar());
        assertEquals(false, casilla.hayConstruccion());


    }

}

