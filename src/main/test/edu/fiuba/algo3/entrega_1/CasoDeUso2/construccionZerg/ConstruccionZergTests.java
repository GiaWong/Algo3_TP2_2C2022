package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionZerg;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal.Espiral;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal.Guarida;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal.ReservaProduccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionesConRadio.Criadero;
import edu.fiuba.algo3.modelo.Construccion.RefineriaGas.Extractor;
import edu.fiuba.algo3.modelo.Unidades.Larva;
import org.junit.jupiter.api.Test;

import javax.security.auth.login.CredentialException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstruccionZergTests {
    @Test
    public void SeArrancaAConstruirCriaderoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        Criadero criadero = new Criadero();
        criadero.avanzarTurno();
        esperado= criadero.estaDisponible();
        assertEquals(false,esperado);

    }

    @Test
    public void SeConstruyeElCriaderoYDeberiaEstarActivo() {
        boolean esperado = true;
        Criadero criadero = new Criadero();
        for(int i =0 ; i<=3;i++) {

            criadero.avanzarTurno();
        }
        esperado = criadero.estaDisponible();
        assertEquals(true,esperado);
    }
    @Test

    public void SeArrancaAConstruirReservaReproduccionYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.avanzarTurno();
        esperado= reserva.estaDisponible();
        assertEquals(false,esperado);

    }
    @Test
    public void SeConstruyeReservaReproduccionYDeberiaEstarActivo() {
        boolean esperado = true;
        ReservaProduccion reserva = new ReservaProduccion();
        for(int i =0 ; i<=12;i++) {
            reserva.avanzarTurno();
        }
        esperado= reserva.estaDisponible();
        assertEquals(true,esperado);
    }
    @Test
    public void SeArrancaAConstruirExtractorYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        Extractor extractor = new Extractor();
        extractor.avanzarTurno();
        esperado= extractor.estaDisponible();
        assertEquals(false,esperado);


}
    @Test
    public void SeConstruyeExtractorYDeberiaEstarActivo() {
        boolean esperado = true;
        Extractor extractor = new Extractor();
        for(int i =0 ; i<=5;i++) {
            extractor.avanzarTurno();
        }

        esperado= extractor.estaDisponible();
        assertEquals(true,esperado);
    }
    @Test
    public void SeArrancaAConstruirGuaridaYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        Guarida guarida = new Guarida();
        guarida.avanzarTurno();
        esperado= guarida.estaDisponible();
        assertEquals(false,esperado);}

    @Test
    public void SeConstruyeGuaridaYDeberiaEstarActivo() {
        boolean esperado = true;
        Guarida guarida = new Guarida();
        for(int i =0 ; i<=12;i++) {
            guarida.avanzarTurno();
        }
        esperado= guarida.estaDisponible();
        assertEquals(true,esperado);
    }

    @Test
    public void SeArrancaAConstruirEspiralYDeberiaEstarInactivoPorFaltaDeTurnos() {
        boolean esperado = false;
        Espiral espiral = new Espiral();
        espiral.avanzarTurno();
        esperado= espiral.estaDisponible();
        assertEquals(false,esperado);}
    @Test
    public void SeConstruyeEspiralYDeberiaEstarActivo() {
        boolean esperado = true;
        Espiral espiral = new Espiral();
        for(int i =0 ; i<=9;i++) {
            espiral.avanzarTurno();
        }
        esperado= espiral.estaDisponible();
        assertEquals(true,esperado);

    }
    }







