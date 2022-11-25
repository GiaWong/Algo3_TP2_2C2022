package edu.fiuba.algo3.entrega_2.CasoDeUso22;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Unidades.Guardian;
import edu.fiuba.algo3.modelo.Unidades.Hidralisco;
import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso22Zerg {

    @Test
    public void SeVerificaPreRequisitoZerling() {
        Zerling zerling = new Zerling();
        List<Construccion> lisst = new ArrayList<>();
        ReservaProduccion reserva = new ReservaProduccion();
        lisst.add(reserva);
        for(int i=0;i<2;i++ ){
            zerling.construir();
        }
        assertEquals(true,zerling.estaDisponible());

        assertEquals(true, zerling.preRequisito(lisst));
    }

    @Test
    public void SeVerificaPreRequisitoHidralisco() {
        Hidralisco hidralisco = new Hidralisco();
        List<Construccion> lisst = new ArrayList<>();
        Guarida guarida = new Guarida();
        lisst.add(guarida);
        for(int i=0;i<4;i++ ){
            hidralisco.construir();
        }
        assertEquals(true,hidralisco.estaDisponible());

        assertEquals(true, hidralisco.preRequisito(lisst));
    }

    @Test
    public void SeVerificaPreRequisitoMutalisco() {
        Mutalisco mutalisco = new Mutalisco();
        List<Construccion> lisst = new ArrayList<>();
        Espiral espiral = new Espiral();
        lisst.add(espiral);
        for(int i=0;i<7;i++ ){
            mutalisco.construir();
        }
        assertEquals(true,mutalisco.estaDisponible());

        assertEquals(true, mutalisco.preRequisito(lisst));
    }
    @Test
    public void SeverificaElTiempoConstuccionGuardian() {
        Guardian guardian = new Guardian();
        for(int i=0;i<4;i++ ){
            guardian.construir();
        }
        assertEquals(true,guardian.estaDisponible());
    }
}
