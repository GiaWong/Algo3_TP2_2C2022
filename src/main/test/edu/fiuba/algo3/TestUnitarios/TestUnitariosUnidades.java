package edu.fiuba.algo3.TestUnitarios;

import edu.fiuba.algo3.modelo.Construccion.PuertoEstelar;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitariosUnidades {

    @Test
    public void unDragonSeCreaCorrectamenteConLaVidaCorrespondiente(){
        Dragon unidad =new Dragon();
        assertEquals(100,unidad.obtenerVida());
    }

    @Test
    public void unDragonSeCreaCorrectamenteConElEscudoCorrespondiente(){
        Dragon unidad =new Dragon();
        assertEquals(60,unidad.obtenerEscudo());
    }

    @Test
    public void unZealotSeCreaCorrectamenteConLaVidaCorrespondiente(){
        Zealot unidad =new Zealot();
        assertEquals(100,unidad.obtenerVida());
    }

    @Test
    public void unZealotSeCreaCorrectamenteConElEscudoCorrespondiente(){
        Zealot unidad =new Zealot();
        assertEquals(100,unidad.obtenerEscudo());
    }

    @Test
    public void unScoutSeCreaCorrectamenteConLaVidaCorrespondiente(){
        Scout unidad =new Scout();
        assertEquals(150,unidad.obtenerVida());
    }

    @Test
    public void unScoutSeCreaCorrectamenteConElEscudoCorrespondiente(){
        Scout unidad =new Scout();
        assertEquals(100,unidad.obtenerEscudo());
    }
    @Test
    public void unGuardianSeCreaCorrectamenteConLaVidaCorrespondiente(){
        Guardian unidad =new Guardian();
        assertEquals(100,unidad.obtenerVida());
    }
    @Test
    public void unHidraliscoSeCreaCorrectamenteConLaVidaCorrespondiente(){
        Hidralisco unidad =new Hidralisco();
        assertEquals(80,unidad.obtenerVida());
    }
    @Test
    public void unZerlingSeCreaCorrectamenteConLaVidaCorrespondiente(){
        Zerling unidad =new Zerling();
        assertEquals(35,unidad.obtenerVida());
    }
    @Test
    public void unMutaliscoSeCreaCorrectamenteConLaVidaCorrespondiente(){
        Mutalisco unidad =new Mutalisco();
        assertEquals(120,unidad.obtenerVida());
    }


}
