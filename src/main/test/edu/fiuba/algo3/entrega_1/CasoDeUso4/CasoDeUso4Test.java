package edu.fiuba.algo3.entrega_1.CasoDeUso4;

import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Exception.FaltaUnZanganoParaRecolectar;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeAgregarOtroZangano;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnVolcan;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso4Test {
    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYAlNoTenerZanganoNoProduceGasVespeno() {
        Extractor extractor = new Extractor();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        casilla.setTerreno(new ConMoho());
        for (int i = 0; i < 6; i++){ //Esto lo hago porque supongo que solo se pueden meter zanganos a extractor una vez que esta construida.
            extractor.avanzarTurno();
        }
        //No le meto ningún zángano
        casilla.agregar(extractor);
        assertThrows( FaltaUnZanganoParaRecolectar.class,()->{extractor.recolectar(volcan);});
    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon1ZanganoProduce10GasVespeno() {
        int esperado = 10;
        Extractor extractor = new Extractor();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        casilla.setTerreno(new ConMoho());
        for (int i = 0; i < 6; i++){
            extractor.avanzarTurno();
        }
        //Le meto zángano a extractor.
        extractor.agregarZangano(new Zangano());
        casilla.agregar(extractor);
        int resultado = extractor.recolectar(volcan);
        assertEquals(resultado, esperado);


    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon2ZanganosProduce20GasVespeno() {
        int esperado = 20;
        Extractor extractor = new Extractor();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        casilla.setTerreno(new ConMoho());
        for (int i = 0; i < 6; i++){
            extractor.avanzarTurno();
        }
        //Le meto 2 zánganos a extractor.
        extractor.agregarZangano(new Zangano());
        extractor.agregarZangano(new Zangano());
        casilla.agregar(extractor);
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
        casilla.setTerreno(new ConMoho());
        for (int i = 0; i < 6; i++){
            extractor.construir();
        }
        //Le meto 3 zánganos a extractor.
        extractor.agregarZangano(new Zangano());
        extractor.agregarZangano(new Zangano());
        extractor.agregarZangano(new Zangano());
        casilla.agregar(extractor);
        int resultado = extractor.recolectar(volcan);

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYTiraErrorAlIntentarAgregarUnCuartoZangano() {
        Extractor extractor = new Extractor();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        casilla.setTerreno(new ConMoho());

        extractor.agregarZangano(new Zangano());
        extractor.agregarZangano(new Zangano());
        extractor.agregarZangano(new Zangano());
        casilla.agregar(extractor);
        assertThrows( NoSePuedeAgregarOtroZangano.class,()->{extractor.agregarZangano(new Zangano());});

    }

    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespenoYPor1TurnoProduce20GasVespeno() {

        int esperado = 20;
        Asimilador asimilador = new Asimilador();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        casilla.setTerreno(new ConEnergia());
        for (int i = 0; i < 6; i++){
            asimilador.avanzarTurno();
        }

        casilla.agregar(asimilador);
        int resultado = asimilador.recolectar(volcan);

        assertEquals(resultado, esperado);

    }

    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespenoYPor2TurnosProduce40GasVespeno() {
        int esperado = 40;
        int resultado = 0;
        Asimilador asimilador = new Asimilador();
        Casilla casilla = new Casilla();
        Volcan volcan = new Volcan();
        casilla.setRecurso(volcan);
        casilla.setTerreno(new ConEnergia());
        for (int i = 0; i < 6; i++){
            asimilador.avanzarTurno();
        }

        casilla.agregar(asimilador);
        resultado += asimilador.recolectar(volcan);
        asimilador.avanzarTurno();
        resultado += asimilador.recolectar(volcan);
        assertEquals(resultado, esperado);

    }

}
