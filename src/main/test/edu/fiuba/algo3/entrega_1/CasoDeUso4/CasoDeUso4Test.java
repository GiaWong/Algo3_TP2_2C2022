package edu.fiuba.algo3.entrega_1.CasoDeUso4;

import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla.ConVolcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso4Test {
    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYAlNoTenerZanganoNoProduceGasVespeno() {
        int esperado = 0;
        Extractor extractor = new Extractor();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        for (int i = 0; i < 6; i++){ //Esto lo hago porque supongo que solo se pueden meter zanganos a extractor una vez que esta construida.
            extractor.construir();
        }
        //No le meto ningun zangano
        casilla.agregarConstruccion(extractor);
        int resultado = extractor.recolectar(volcan);
        assertEquals(resultado, esperado);

        //Recordatorio: hay que crear las Unidades para resolver este test, para poder usar Zangano porque Extractor tiene una lista de estos.

    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon1ZanganoProduce10GasVespeno() {
        int esperado = 10;
        Extractor extractor = new Extractor();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        for (int i = 0; i < 6; i++){
            extractor.construir();
        }
        //Le meto zangano a extractor.
        extractor.agregar(new Zangano());
        casilla.agregarConstruccion(extractor);
        int resultado = extractor.recolectar(volcan);

        assertEquals(resultado, esperado);


    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon2ZanganoProduce20GasVespeno() {
        int esperado = 20;
        Extractor extractor = new Extractor();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        for (int i = 0; i < 6; i++){
            extractor.construir();
        }
        //Le meto 2 zanganos a extractor.
        extractor.agregar(new Zangano());
        extractor.agregar(new Zangano());
        casilla.agregarConstruccion(extractor);
        int resultado = extractor.recolectar(volcan);

        assertEquals(resultado, esperado);

    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon3ZanganoProduce30GasVespeno() {
        int esperado = 30;
        Extractor extractor = new Extractor();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        for (int i = 0; i < 6; i++){
            extractor.construir();
        }
        //Le meto 2 zanganos a extractor.
        extractor.agregar(new Zangano());
        extractor.agregar(new Zangano());
        extractor.agregar(new Zangano());
        casilla.agregarConstruccion(extractor);
        int resultado = extractor.recolectar(volcan);

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon4ZanganoYaNoProduceGasVespeno() {

        int esperado = 30;
        Extractor extractor = new Extractor();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        for (int i = 0; i < 6; i++){
            extractor.construir();
        }
        //Le meto 2 zanganos a extractor.
        extractor.agregar(new Zangano());
        extractor.agregar(new Zangano());
        extractor.agregar(new Zangano());
        extractor.agregar(new Zangano()); //No se agregaria este Zangano a Extractor, por lo tanto sigue recolectando la cantidad de Zanganos que habia
        casilla.agregarConstruccion(extractor);
        int resultado = extractor.recolectar(volcan);

        assertEquals(resultado, esperado);

    }

    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespenoYPor1TurnoProduce20GasVespeno() {

        int esperado = 20;
        Asimilador asimilador = new Asimilador();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        for (int i = 0; i < 6; i++){
            asimilador.construir();
        }

        casilla.agregarConstruccion(asimilador);
        int resultado = asimilador.recolectar(volcan);

        assertEquals(resultado, esperado);

    }

    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespenoYPor2TurnoProduce40GasVespeno() {
        int esperado = 40;
        int resultado = 0;
        Asimilador asimilador = new Asimilador();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        for (int i = 0; i < 6; i++){
            asimilador.construir();
        }

        casilla.agregarConstruccion(asimilador);
        resultado += asimilador.recolectar(volcan);
        resultado += asimilador.recolectar(volcan);// Supongo que aca se deberia pasar un turno para recolectar lo del Volcan

        assertEquals(resultado, esperado);

    }

}
