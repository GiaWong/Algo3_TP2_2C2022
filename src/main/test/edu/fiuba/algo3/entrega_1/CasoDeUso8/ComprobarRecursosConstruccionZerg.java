package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComprobarRecursosConstruccionZerg {

    @Test
    public void SeIntentanAdquirir5CriaderosYSeCompranSolo4PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        int construccionesEsperadas = 4;
        Raza zerg = new Zerg();
        for (int i = 0; i < 5; i++){
            zerg.comprarConstruccion(new Criadero());
        }
        int resultado = zerg.obtenerCantidadConstrucciones();
        assertEquals(resultado, construccionesEsperadas); //Esto despues podemos hacer que si no se puede comprar, que lanze una exception
    }

    @Test
    public void SeIntentanAdquirir2ReservaProduccionYSeCompranSolo1PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        int construccionesEsperadas = 1;
        Raza zerg = new Zerg();
        for (int i = 0; i < 2; i++){
            zerg.comprarConstruccion(new ReservaProduccion());
        }
        int resultado = zerg.obtenerCantidadConstrucciones();
        assertEquals(resultado, construccionesEsperadas);
    }

    @Test
    public void SeIntentanAdquirir3ExtractorYSeCompranSolo2PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        int construccionesEsperadas = 2;
        Raza zerg = new Zerg();
        for (int i = 0; i < 3; i++){
            zerg.comprarConstruccion(new Extractor());
        }
        int resultado = zerg.obtenerCantidadConstrucciones();
        assertEquals(resultado, construccionesEsperadas);
    }

    @Test
    public void SeIntentanAdquirirUnaGuaridaYNoSePuedeComprarPorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        int construccionesEsperadas = 0;
        Raza zerg = new Zerg();
        zerg.comprarConstruccion(new Guarida());
        int resultado = zerg.obtenerCantidadConstrucciones();
        assertEquals(resultado, construccionesEsperadas);
    }

    @Test
    public void SeIntentanAdquirirUnEspiralYNoSePuedeComprarPorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        int construccionesEsperadas = 0;
        Raza zerg = new Zerg();
        zerg.comprarConstruccion(new Espiral());
        int resultado = zerg.obtenerCantidadConstrucciones();
        assertEquals(resultado, construccionesEsperadas);
    }
    /*
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
    */
}
