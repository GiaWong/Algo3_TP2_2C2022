package edu.fiuba.algo3.entrega_2.CasoDeUso22;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso22Protoss {
    @Test
    public void SeVerificaPreRequisitoZealot() {
        Zealot zealot = new Zealot();
        List<Construccion> lisst = new ArrayList<>();
        Acceso acceso = new Acceso();
        lisst.add(acceso);
        for(int i=0;i<4;i++ ){
            zealot.construir();
        }
        assertEquals(true,zealot.estaDisponible());
        assertEquals(true, zealot.preRequisito(lisst));
    }

    @Test
    public void SeVerificaPreRequisitoDragon() {
        Dragon dragon = new Dragon();
        List<Construccion> lisst = new ArrayList<>();
        Acceso acceso = new Acceso();
        lisst.add(acceso);
        for(int i=0;i<6;i++ ){
            dragon.construir();
        }
        assertEquals(true,dragon.estaDisponible());

        assertEquals(true, dragon.preRequisito(lisst));
    }

    @Test
    public void SeVerificaPreRequisitoScout() {
        Scout scout = new Scout();
        List<Construccion> lisst = new ArrayList<>();
        PuertoEstelar puerto = new PuertoEstelar();
        lisst.add(puerto);
        for(int i=0;i<9;i++ ){
            scout.construir();
        }
        assertEquals(true,scout.estaDisponible());
        assertEquals(true, scout.preRequisito(lisst));
    }
}
