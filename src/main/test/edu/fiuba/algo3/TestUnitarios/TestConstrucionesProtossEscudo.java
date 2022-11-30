package edu.fiuba.algo3.TestUnitarios;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Construccion.PuertoEstelar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConstrucionesProtossEscudo {

    @Test
    public void unPuertoEstelarSeCreaCorrectamenteConElEscudoCorrespondiente(){
        PuertoEstelar construccion =new PuertoEstelar();
        assertEquals(600,construccion.obtenerEscudo());
    }

    @Test
    public void unPilonSeCreaCorrectamenteConElEscudoCorrespondiente(){
        Pilon construccion =new Pilon();
        assertEquals(300,construccion.obtenerEscudo());
    }

    @Test
    public void unAccesoSeCreaCorrectamenteConElEscudoCorrespondiente(){
        Acceso construccion =new Acceso();
        assertEquals(500,construccion.obtenerEscudo());
    }

    @Test
    public void unNexoMineralSeCreaCorrectamenteConElEscudoCorrespondiente(){
        NexoMineral construccion =new NexoMineral();
        assertEquals(250,construccion.obtenerEscudo());
    }
}
