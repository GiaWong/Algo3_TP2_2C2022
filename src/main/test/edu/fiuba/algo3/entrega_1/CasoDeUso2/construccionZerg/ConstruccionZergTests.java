package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionZerg;

import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.RefineriaGas.Extractor;
import edu.fiuba.algo3.modelo.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Zerg.ReservaProduccion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstruccionZergTests {


    @Test
    public void SeArrancaAConstruirCriaderoYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Criadero criadero = new Criadero();
        criadero.avanzarTurno(1);
        boolean resultado = criadero.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeElCriaderoYDeberiaEstarActivo() {


        boolean esperado = true;
        Criadero criadero = new Criadero();
        criadero.avanzarTurno(4);
        boolean resultado = criadero.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirReservaReproduccionYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.avanzarTurno(1);
        boolean resultado = reserva.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeReservaReproduccionYDeberiaEstarActivo() {


        boolean esperado = false;
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.avanzarTurno(12);
        boolean resultado = reserva.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirExtractorYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Extractor extractor = new Extractor(new GasVespeno());
        extractor.avanzarTurno(1);
        boolean resultado = extractor.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeExtractorYDeberiaEstarActivo() {


        boolean esperado = false;
        Extractor extractor = new Extractor(new GasVespeno());
        extractor.avanzarTurno(6);
        boolean resultado = extractor.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirGuaridaYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Guarida guarida = new Guarida();
        guarida.avanzarTurno(1);
        boolean resultado = guarida.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeGuaridaYDeberiaEstarActivo() {


        boolean esperado = true;
        Guarida guarida = new Guarida();
        guarida.avanzarTurno(12);
        boolean resultado = guarida.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeArrancaAConstruirEspiralYDeberiaEstarInactivoPorFaltaDeTurnos() {


        boolean esperado = false;
        Espiral espiral = new Espiral();
        espiral.avanzarTurno(1);
        boolean resultado = espiral.estaDisponible();

        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeEspiralYDeberiaEstarActivo() {


        boolean esperado = false;
        Espiral espiral = new Espiral();
        espiral.avanzarTurno(1);
        boolean resultado = espiral.estaDisponible();

        assertEquals(resultado, esperado);
    }


}
