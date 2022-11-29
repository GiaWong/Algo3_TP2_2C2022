package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionZerg;

import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Construccion.Guarida;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupada;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConstruccionZergTests {

    @Test
    public void SeArrancaAConstruirCriaderoYNoPasanTurnosYDeberiaEstarInactivo() {
        Criadero criadero = new Criadero();
        assertThrows( EdificioNoEstaOperativo.class, criadero::evolucionarLarva);
    }
    @Test
    public void SeArrancaAConstruirCriaderoPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Criadero criadero = new Criadero();
        criadero.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, criadero::evolucionarLarva);
    }

    @Test
    public void SeTerminaDeConstruirElCriaderoYDeberiaEstarActivo() {
        Criadero criadero = new Criadero();
        for(int i =0 ; i <= 3;i++) {
            criadero.avanzarTurno();
        }
        assertDoesNotThrow(criadero::evolucionarLarva);
    }

    @Test
    public void SeArrancaAConstruirReservaReproduccionYNoPasanTurnosYDeberiaEstarInactivo() {
        ReservaProduccion reserva = new ReservaProduccion();
        assertThrows( EdificioNoEstaOperativo.class, reserva::crearUnidad);
    }
    @Test

    public void SeArrancaAConstruirReservaReproduccionPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, reserva::crearUnidad);

    }
    @Test
    public void SeTerminaDeConstruirReservaReproduccionYDeberiaEstarActivo() {
        ReservaProduccion reserva = new ReservaProduccion();
        for(int i =0 ; i<=12;i++) {
            reserva.avanzarTurno();
        }
        assertDoesNotThrow(()->{
            reserva.crearUnidad();
        });
    }

    @Test
    public void SeArrancaAConstruirExtractorYNoPasanTurnosYDeberiaEstarInactivo() {
        Extractor extractor = new Extractor();
        Zangano zangano = new Zangano();
        assertThrows( EdificioNoEstaOperativo.class, ()->extractor.agregarZangano(zangano));
    }
    @Test
    public void SeArrancaAConstruirExtractorYPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Extractor extractor = new Extractor();
        Zangano zangano = new Zangano();
        extractor.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, ()->extractor.agregarZangano(zangano));
    }
    @Test
    public void SeTerminaDeConstruirExtractorYDeberiaEstarActivo() {
        Extractor extractor = new Extractor();
        Zangano zangano = new Zangano();
        for(int i =0 ; i<=5;i++) {
            extractor.avanzarTurno();
        }
        assertDoesNotThrow(()->{extractor.agregarZangano(zangano);}

    }

    @Test
    public void SeArrancaAConstruirGuaridaYNoPasanTurnosYDeberiaEstarInactivo() {
        Guarida guarida = new Guarida(); //acá quedé
        guarida.esRequisitoDe(new Guarida());
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







