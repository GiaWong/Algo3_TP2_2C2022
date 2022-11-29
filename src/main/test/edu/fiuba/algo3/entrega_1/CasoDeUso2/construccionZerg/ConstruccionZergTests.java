package edu.fiuba.algo3.entrega_1.CasoDeUso2.construccionZerg;

import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Construccion.Guarida;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupada;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
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
            reserva.crearUnidad();});
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
        assertDoesNotThrow(()->{extractor.agregarZangano(zangano);});

    }

    @Test
    public void SeArrancaAConstruirGuaridaYNoPasanTurnosYDeberiaEstarInactivo() {
        Mapa mapa = new Mapa(20,20);
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.agregar(reserva,new Coordenada(1,2));
        Guarida guarida = new Guarida();
        mapa.agregar(guarida,new Coordenada(1,8));
        assertThrows( EdificioNoEstaOperativo.class, guarida::crearUnidad);
    }
    @Test
    public void SeArrancaAConstruirGuaridaYPasaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Mapa mapa = new Mapa(20,20);
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.agregar(reserva,new Coordenada(1,2));
        Guarida guarida = new Guarida();
        mapa.agregar(guarida,new Coordenada(1,8));
        guarida.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, guarida::crearUnidad);
    }

    @Test
    public void SeTerminaDeConstruirGuaridaYDeberiaEstarActivo() {
        Mapa mapa = new Mapa(20,20);
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.agregar(reserva,new Coordenada(1,2));
        Guarida guarida = new Guarida();
        mapa.agregar(guarida,new Coordenada(1,8));
        for(int i =0 ; i<=12;i++) {
            guarida.avanzarTurno();
        }
        assertDoesNotThrow(()->{guarida.crearUnidad();});
    }

    @Test
    public void SeArrancaAConstruirEspiralYNoPasanTurnosYDeberiaEstarInactivo() {
        Mapa mapa = new Mapa(20,20);
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.agregar(reserva,new Coordenada(1,2));
        Guarida guarida = new Guarida();
        mapa.agregar(guarida,new Coordenada(1,8));
        Espiral espiral = new Espiral();
        mapa.agregar(espiral,new Coordenada(2,6));
        assertThrows( EdificioNoEstaOperativo.class, espiral::crearUnidad);
    }

    @Test
    public void SeArrancaAConstruirEspiralYAvanzaUnTurnoYDeberiaEstarInactivoPorFaltaDeTurnos() {
        Mapa mapa = new Mapa(20,20);
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.agregar(reserva,new Coordenada(1,2));
        Guarida guarida = new Guarida();
        mapa.agregar(guarida,new Coordenada(1,8));
        Espiral espiral = new Espiral();
        mapa.agregar(espiral,new Coordenada(2,6));
        espiral.avanzarTurno();
        assertThrows( EdificioNoEstaOperativo.class, espiral::crearUnidad);
    }

    @Test
    public void SeConstruyeEspiralYDeberiaEstarActivo() {
        Mapa mapa = new Mapa(20,20);
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.agregar(reserva,new Coordenada(1,2));
        Guarida guarida = new Guarida();
        mapa.agregar(guarida,new Coordenada(1,8));
        Espiral espiral = new Espiral();
        mapa.agregar(espiral,new Coordenada(2,6));
        for(int i =0 ; i<=9;i++) {
            espiral.avanzarTurno();
        }
        assertDoesNotThrow(()->{guarida.crearUnidad();});
    }
}








