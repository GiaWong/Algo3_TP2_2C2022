package edu.fiuba.algo3.entrega_1.CasoDeUso17;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Construccion.PuertoEstelar;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso17 {

    @Test
    public void PreRequisitoPuertoEstelar(){
        PuertoEstelar puerto = new PuertoEstelar();
        List<Construccion> lisst = new ArrayList<>();
        Acceso acceso = new Acceso();
        lisst.add(acceso);
        assertEquals(true,puerto.PreRequisito(lisst));
    }
}
