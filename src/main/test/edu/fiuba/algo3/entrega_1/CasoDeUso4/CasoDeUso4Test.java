package edu.fiuba.algo3.entrega_1.CasoDeUso4;

import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.FaltaUnZanganoParaRecolectar;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeAgregarOtroZangano;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CasoDeUso4Test {

    Volcan volcan = mock(Volcan.class);

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYAlNoTenerZanganoNoProduceGasVespeno() {
        int esperado = 0;
        Extractor extractor = new Extractor();
        when(volcan.recolectar(0)).thenReturn(esperado);
        for (int i = 0; i < 6; i++){ //Esto lo hago porque supongo que solo se pueden meter zanganos a extractor una vez que esta construida.
            extractor.construir();
        }
        //No le meto ningún zángano
        assertThrows(FaltaUnZanganoParaRecolectar.class,()->{extractor.recolectar(volcan);});
    }


    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon1ZanganoProduce10GasVespeno() throws EdificioNoEstaOperativo, FaltaUnZanganoParaRecolectar, NoSePuedeAgregarOtroZangano {
        int esperado = 10;
        Extractor extractor = new Extractor();
        when(volcan.recolectar(10)).thenReturn(esperado);
        for (int i = 0; i < 6; i++){
            extractor.construir();
        }
        //Le meto zángano a extractor.
        Zangano zangano = new Zangano();
        extractor.agregarZangano(zangano);
        int resultado =extractor.recolectar(volcan);
        assertEquals(esperado, resultado);
    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon2ZanganoProduce20GasVespeno() throws NoSePuedeAgregarOtroZangano, EdificioNoEstaOperativo, FaltaUnZanganoParaRecolectar {
        int esperado = 20;
        Extractor extractor = new Extractor();
        when(volcan.recolectar(20)).thenReturn(esperado);
        for (int i = 0; i < 6; i++){
            extractor.construir();
        }
        //Le meto zángano a extractor.
        Zangano zangano = new Zangano();
        extractor.agregarZangano(zangano);
        extractor.agregarZangano(zangano);

        int resultado =extractor.recolectar(volcan);
        assertEquals(esperado, resultado);
        verify(volcan).recolectar(20);

    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon3ZanganoProduce30GasVespeno() throws EdificioNoEstaOperativo, FaltaUnZanganoParaRecolectar, NoSePuedeAgregarOtroZangano {
        int esperado = 30;
        Extractor extractor = new Extractor();
        when(volcan.recolectar(30)).thenReturn(esperado);
        for (int i = 0; i < 6; i++){
            extractor.construir();
        }
        //Le meto zángano a extractor.
        Zangano zangano = new Zangano();
        extractor.agregarZangano(zangano);
        extractor.agregarZangano(zangano);
        extractor.agregarZangano(zangano);

        int resultado =extractor.recolectar(volcan);
        assertEquals(esperado, resultado);
        verify(volcan).recolectar(30);
    }

    @Test
    public void SeConstruyeUnExtractorSobreGasVespenoYCon4ZanganoYaNoProduceGasVespeno() throws EdificioNoEstaOperativo, FaltaUnZanganoParaRecolectar, NoSePuedeAgregarOtroZangano {

        int esperado = 30;
        Extractor extractor = new Extractor();
        when(volcan.recolectar(30)).thenReturn(esperado);
        for (int i = 0; i < 6; i++){
            extractor.construir();
        }
        //Le meto zángano a extractor.
        Zangano zangano = new Zangano();
        extractor.agregarZangano(zangano);
        extractor.agregarZangano(zangano);
        extractor.agregarZangano(zangano);
        assertThrows(NoSePuedeAgregarOtroZangano.class,()->{extractor.agregarZangano(zangano);});
        int resultado =extractor.recolectar(volcan);
        assertEquals(esperado, resultado);
        verify(volcan).recolectar(30);

    }

    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespenoYPor1TurnoProduce20GasVespeno() throws EdificioNoEstaOperativo {

        int esperado = 20;
        Asimilador asimilador = new Asimilador();
        when(volcan.recolectar(20)).thenReturn(esperado);
        Volcan volcan = new Volcan();
        for (int i = 0; i < 6; i++){
            asimilador.construir();
        }
        int resultado = asimilador.recolectar(volcan);
        assertEquals(resultado, esperado);

    }

    @Test
    public void SeConstruyeUnAsimiladorSobreGasVespenoYPor2TurnoProduce40GasVespeno() throws EdificioNoEstaOperativo {
        int esperado = 40;
        Asimilador asimilador = new Asimilador();
        when(volcan.recolectar(20)).thenReturn(20);
        Volcan volcan = new Volcan();
        for (int i = 0; i < 6; i++){
            asimilador.construir();
        }
        int resultado = asimilador.recolectar(volcan);
         resultado += asimilador.recolectar(volcan);

        assertEquals(40 , resultado);

    }

}
