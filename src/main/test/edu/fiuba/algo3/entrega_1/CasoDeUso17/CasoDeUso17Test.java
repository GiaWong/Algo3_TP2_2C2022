package edu.fiuba.algo3.entrega_1.CasoDeUso17;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.ErrorEsteEdificioSoloSeConstruyeEnUnRecurso;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso17Test {

    @Test
    public void SeVerificaPreRequisitoPuertoEstelar(){
        Mapa mapa = new Mapa(20,20);
        Acceso acceso = new Acceso();
        mapa.setearRadio(new Coordenada(10,10),3,new ConEnergia());
        mapa.agregar(acceso,new Coordenada(10,10));
        mapa.setearRadio(new Coordenada(13,13),3,new ConEnergia());
        assertDoesNotThrow(()->{mapa.agregar(new PuertoEstelar(),new Coordenada(13,13));});
    }
    @Test
    public void SeVerificaPreRequisitoEspiral(){
        Mapa mapa = new Mapa(30,30);
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.setearRadio(new Coordenada(10,10),5,new ConMoho());
        mapa.agregar(reserva,new Coordenada(10,10));
        mapa.setearRadio(new Coordenada(15,15),5,new ConMoho());
        mapa.agregar(new Guarida(),new Coordenada(15,15));
        mapa.setearRadio(new Coordenada(20,20),5,new ConMoho());
        assertDoesNotThrow(()->{mapa.agregar(new Espiral(),new Coordenada(20,20));});
    }


    @Test
    public void SeVerificaPreRequisitoGuarida(){
        Mapa mapa = new Mapa(20,20);
        ReservaProduccion reserva = new ReservaProduccion();
        mapa.setearRadio(new Coordenada(10,10),5,new ConMoho());
        mapa.agregar(reserva,new Coordenada(10,10));
        mapa.setearRadio(new Coordenada(15,15),5,new ConMoho());
        assertDoesNotThrow(()->{mapa.agregar(new Guarida(),new Coordenada(15,15));});
    }
}
