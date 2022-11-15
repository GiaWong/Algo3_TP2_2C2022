package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionZerg;

import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Construccion.Guarida;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstruccionZergTests {
    @Test
    public void SeArrancaAConstruirCriaderoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        Criadero criadero = new Criadero();
        criadero.construir();
        boolean resultado= criadero.estaDisponible();
        assertEquals(resultado,esperado);

    }

    @Test
    public void SeConstruyeElCriaderoYDeberiaEstarActivo() {
        boolean esperado = true;
        Criadero criadero = new Criadero();
        for(int i =0 ; i<=3;i++) {

            criadero.construir();
        }
        boolean resultado = criadero.estaDisponible();
        assertEquals(resultado,esperado);
    }
    @Test

    public void SeArrancaAConstruirReservaReproduccionYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.construir();
        boolean resultado= reserva.estaDisponible();
        assertEquals(resultado,esperado);

    }
    @Test
    public void SeConstruyeReservaReproduccionYDeberiaEstarActivo() {
        boolean esperado = true;
        ReservaProduccion reserva = new ReservaProduccion();
        for(int i =0 ; i<=12;i++) {
            reserva.construir();
        }
        boolean resultado = reserva.estaDisponible();
        assertEquals(resultado,esperado);
    }
    @Test
    public void SeArrancaAConstruirExtractorYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        Extractor extractor = new Extractor();
        extractor.construir();
        boolean resultado = extractor.estaDisponible();
        assertEquals(resultado,esperado);


}
    @Test
    public void SeConstruyeExtractorYDeberiaEstarActivo() {
        boolean esperado = true;
        Extractor extractor = new Extractor();
        for(int i =0 ; i<=5;i++) {
            extractor.construir();
        }

        boolean resultado = extractor.estaDisponible();
        assertEquals(resultado,esperado);
    }
    @Test
    public void SeArrancaAConstruirGuaridaYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        Guarida guarida = new Guarida();
        guarida.construir();
        boolean resultado = guarida.estaDisponible();
        assertEquals(resultado,esperado);}

    @Test
    public void SeConstruyeGuaridaYDeberiaEstarActivo() {
        boolean esperado = true;
        Guarida guarida = new Guarida();
        for(int i =0 ; i<=12;i++) {
            guarida.construir();
        }
        boolean resultado = guarida.estaDisponible();
        assertEquals(resultado,esperado);
    }

    @Test
    public void SeArrancaAConstruirEspiralYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        Espiral espiral = new Espiral();
        espiral.construir();
        boolean resultado = espiral.estaDisponible();
        assertEquals(resultado,esperado);}
    @Test
    public void SeConstruyeEspiralYDeberiaEstarActivo() {
        boolean esperado = true;
        Espiral espiral = new Espiral();
        for(int i =0 ; i<=9;i++) {
            espiral.construir();
        }
        boolean resultado = espiral.estaDisponible();
        assertEquals(resultado,esperado);

    }
    }







