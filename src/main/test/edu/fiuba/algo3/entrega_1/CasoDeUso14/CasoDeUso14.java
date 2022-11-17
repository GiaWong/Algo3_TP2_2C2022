package edu.fiuba.algo3.entrega_1.CasoDeUso14;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso14 {

    @Test
    public void SeCreaUnPilonYNoDeberiaEnergizarUnaCasillaConMoho(){
        Mapa mapa = new Mapa();
        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        for(int i = 0; i<3; i++){
            criadero.construir();
            pilon.construir();
        }
        mapa.agregar(criadero,10,10);
        mapa.agregar(pilon,10,16);
        mapa.setearRadio();
        assertEquals(true, mapa.tipoTerreno(new ConMoho(),10,14));

    }

    @Test
    public void SeCreaUnCriaderoYElMohoPisaAlaEnergia(){
        Mapa mapa = new Mapa();
        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        for(int i = 0; i<3; i++){
            criadero.construir();
            pilon.construir();
        }
        mapa.agregar(criadero,10,10);
        mapa.agregar(pilon,10,16);
        mapa.setearRadio();
        assertEquals(true, mapa.tipoTerreno(new ConMoho(),10,14));
        assertEquals(false, mapa.tipoTerreno(new ConMoho(),10,15));
        criadero.avanzarTurno();
        criadero.avanzarTurno();
        mapa.setearRadio();
        assertEquals(true, mapa.tipoTerreno(new ConMoho(),10,15));

    }
}
