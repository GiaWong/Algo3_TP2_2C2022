package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.RefineriaGas.Extractor;
import edu.fiuba.algo3.modelo.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Zerg.ReservaProduccion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComprobarRecursosConstruccionZerg {

    @Test
    public void SeConstruyeCriaderoZergSinRecursosNecesarios(){
        int gasVespeno = 50;
        int mineral = 25;
        boolean esperado = false;
        Criadero criadero = new Criadero(new Moho(5));
        boolean  resultado = criadero.costeDeMateriales(mineral,gasVespeno);
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeReservaReproduccionZergSinRecursosNecesarios(){
        int gasVespeno = 50;
        int mineral = 25;
        boolean esperado = false;
        ReservaProduccion reserva = new ReservaProduccion();
        boolean  resultado = reserva.costeDeMateriales(mineral,gasVespeno);
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeExtractorZergSinRecursosNecesarios(){
        int gasVespeno = 50;
        int mineral = 25;
        boolean esperado = false;
        Extractor extractor = new Extractor(new GasVespeno());
        boolean  resultado = extractor.costeDeMateriales(mineral,gasVespeno);
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeGuaridaZergSinRecursosNecesarios(){
        int gasVespeno = 50;
        int mineral = 25;
        boolean esperado = false;
        Guarida guarida = new Guarida();
        boolean  resultado = guarida.costeDeMateriales(mineral,gasVespeno);

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeEspiralZergSinRecursosNecesarios(){
        int gasVespeno = 50;
        int mineral = 25;
        boolean esperado = false;
        Espiral espiral = new Espiral();
        boolean  resultado = espiral.costeDeMateriales(mineral, gasVespeno);
        assertEquals(resultado, esperado);
    }
}