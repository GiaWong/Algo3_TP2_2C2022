package edu.fiuba.algo3.entrega_1.CasoDeUso17;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso17 {
 /*
    @Test
    public void SeVerificaPreRequisitoPuertoEstelar(){
        PuertoEstelar puerto = new PuertoEstelar();
        List<Construccion> lisst = new ArrayList<>();
        Acceso acceso = new Acceso();
        lisst.add(acceso);
        assertTrue(puerto.preRequisito(lisst));
    }
    @Test
    public void SeVerificaPreRequisitoEspiral(){
        Espiral espiral = new Espiral();
        List<Construccion> lisst = new ArrayList<>();
        Guarida guarida = new Guarida();
        lisst.add(guarida);
        assertTrue(espiral.preRequisito(lisst));
    } */
    @Test
    public void SeVerificaPreRequisitoGuarida(){
        Mapa mapa = new Mapa(20,20);
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.casillaConTerrenoMoho(new Coordenada(10,10));
        mapa.agregar(reserva,new Coordenada(10,10));
        mapa.casillaConTerrenoMoho(new Coordenada(15,15));
        assertDoesNotThrow(()->{mapa.agregar(new Guarida(),new Coordenada(15,15));});

    }
}
