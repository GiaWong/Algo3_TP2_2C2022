package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionZerg;

import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Construccion.Guarida;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class ConstruccionZergTests {

    /*
    Mapa mapa = mock(Mapa.class);
    @Test
    public void SeArrancaAConstruirCriaderoYNoPasanTurnosYDeberiaEstarInactivo() {
        Criadero criadero = new Criadero();
        assertThrows( EdificioNoEstaOperativo.class, ()->criadero.crearZangano(new BancoDeRecursos()));
    }
    @Test
    public void SeArrancaAConstruirCriaderoPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Criadero criadero = new Criadero();
        criadero.avanzarTurno(mapa);
        assertThrows( EdificioNoEstaOperativo.class, ()->criadero.crearZangano(new BancoDeRecursos()));
    }

    @Test
    public void SeTerminaDeConstruirElCriaderoYDeberiaEstarActivo() {
        Criadero criadero = new Criadero();
        for(int i =0 ; i < 4;i++) {
            criadero.avanzarTurno(mapa);
        }
        assertDoesNotThrow(()->criadero.crearZangano(new BancoDeRecursos()));
    }

    @Test
    public void SeArrancaAConstruirReservaReproduccionYNoPasanTurnosYDeberiaEstarInactivo() {
        ReservaProduccion reserva = new ReservaProduccion();
        assertThrows( EdificioNoEstaOperativo.class, reserva::crearZerling);
    }
    @Test

    public void SeArrancaAConstruirReservaReproduccionPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.avanzarTurno(mapa);
        assertThrows( EdificioNoEstaOperativo.class, reserva::crearZerling);

    }
    @Test
    public void SeTerminaDeConstruirReservaReproduccionYDeberiaEstarActivo() {
        ReservaProduccion reserva = new ReservaProduccion();
        for(int i =0 ; i<=12;i++) {
            reserva.avanzarTurno(mapa);
        }
        assertDoesNotThrow(reserva::crearZerling);
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
        extractor.avanzarTurno(mapa);
        assertThrows( EdificioNoEstaOperativo.class, ()->extractor.agregarZangano(zangano));
    }
    @Test
    public void SeTerminaDeConstruirExtractorYDeberiaEstarActivo() {
        Extractor extractor = new Extractor();
        Zangano zangano = new Zangano();
        for(int i =0 ; i<=5;i++) {
            extractor.avanzarTurno(mapa);
        }
        assertDoesNotThrow(()-> extractor.agregarZangano(zangano));

    }

    @Test
    public void SeArrancaAConstruirGuaridaYNoPasanTurnosYDeberiaEstarInactivo() {
        Guarida guarida = new Guarida();
        assertThrows( EdificioNoEstaOperativo.class, guarida::crearHidralisco);
    }
    @Test
    public void SeArrancaAConstruirGuaridaYPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Guarida guarida = new Guarida();
        guarida.avanzarTurno(mapa);
        assertThrows( EdificioNoEstaOperativo.class, guarida::crearHidralisco);
    }

    @Test
    public void SeTerminaDeConstruirGuaridaYDeberiaEstarActivo() {
        Guarida guarida = new Guarida();
        for(int i =0 ; i<=12;i++) {
            guarida.avanzarTurno(mapa);
        }
        assertDoesNotThrow(()->{guarida.crearHidralisco();});
    }

    @Test
    public void SeArrancaAConstruirEspiralYNoPasanTurnosYDeberiaEstarInactivo() {
        Espiral espiral = new Espiral();
        assertThrows( EdificioNoEstaOperativo.class, espiral::crearMutalisco);
    }

    @Test
    public void SeArrancaAConstruirEspiralYAvanzaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {

        Espiral espiral = new Espiral();
        espiral.avanzarTurno(mapa);
        assertThrows( EdificioNoEstaOperativo.class, espiral::crearMutalisco);
    }

    @Test
    public void SeConstruyeEspiralYDeberiaEstarActivo() {
        Espiral espiral = new Espiral();
        for(int i =0 ; i<=9;i++) {
            espiral.avanzarTurno(mapa);
        }
        assertDoesNotThrow(()->{espiral.crearMutalisco();});
    }

 */
}








