package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Vacio;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinNada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComprobarRecursosConstruccionZerg {
    @Test
    public void SeConstruyeCriaderoSinRecursosNecesarios(){

        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        casilla.agregarConstruccion(new Criadero());
        assertEquals(false, casilla.hayConstruccion());

    }

    @Test
    public void SeConstruyeReservaProduccionSinRecursosNecesarios(){
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        casilla.agregarConstruccion(new ReservaProduccion());
        assertEquals(false, casilla.hayConstruccion());
    }

    @Test
    public void SeConstruyeExtractorSinRecursosNecesarios(){
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        casilla.agregarConstruccion(new Extractor());
        assertEquals(false, casilla.hayConstruccion());

    }

    @Test
    public void SeConstruyeGuaridaSinRecursosNecesarios(){
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        casilla.agregarConstruccion(new Guarida());
        assertEquals(false, casilla.hayConstruccion());


    }

    @Test
    public void SeConstruyeEspiralSinRecursosNecesarios(){
        Casilla casilla = new Casilla();
        casilla.setTerreno(new SinNada());
        casilla.setRecurso(new Vacio());
        casilla.agregarConstruccion(new Espiral());
        assertEquals(false, casilla.hayConstruccion());


    }

}
