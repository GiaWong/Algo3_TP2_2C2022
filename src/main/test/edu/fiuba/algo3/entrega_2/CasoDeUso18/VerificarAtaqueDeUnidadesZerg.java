package edu.fiuba.algo3.entrega_2.CasoDeUso18;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Guardian;
import edu.fiuba.algo3.modelo.Unidades.Hidralisco;
import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificarAtaqueDeUnidadesZerg {

    //Verificar que todas las unidades cuasen el daño que dicen que causan en sus ataques

    // Unidad Zerg ataca a Construccion Protoss
    @Test
    public void UnZerlingAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {

        Mapa mapa = new Mapa();
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        mapa.agregarConstruccion(pilon,10,9);
        mapa.setearRadio();
        ReservaProduccion reserva = new ReservaProduccion();
        reserva.conZerg(new Zerling());//ver en reserva en dond se guardaré zerlings, lista? //cambiar nombre con eevolucionar

        Acceso construccionEnemiga = new Acceso();
        for(int i =0 ; i<=7;i++) {
            construccionEnemiga.construir();
        }
        mapa.agregarConstruccion(reserva,10,10);
        mapa.agregarConstruccion(construccionEnemiga,11,11);
        Zerling zerling = reserva.obtenerZerg();
        mapa.atacar(zerling,11,11);
        assertEquals(496,construccionEnemiga.obtenerEscudo());

    }

    @Test
    public void UnHidraliscoAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {
        Mapa mapa = new Mapa();
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        mapa.agregarConstruccion(pilon,10,9);
        mapa.setearRadio();
        Guarida guarida = new Guarida();
        guarida.conZerg(new Hidralisco());//ver en reserva en dond se guardaré zerlings, lista? //cambiar nombre con eevolucionar

        Acceso construccionEnemiga = new Acceso();
        for(int i =0 ; i<=7;i++) {
            construccionEnemiga.construir();
        }
        mapa.agregarConstruccion(guarida,10,10);
        mapa.agregarConstruccion(construccionEnemiga,11,11);
        Hidralisco hidralisco = guarida.obtenerZerg();
        mapa.atacar(hidralisco,11,11);
        assertEquals(496,construccionEnemiga.obtenerEscudo());

    }

    @Test
    public void UnMutaliscoAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {
        Mapa mapa = new Mapa();
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        mapa.agregarConstruccion(pilon,10,9);
        mapa.setearRadio();
        Espiral espiral = new Espiral();
        espiral.conZerg(new Mutalisco());//ver en reserva en dond se guardaré zerlings, lista? //cambiar nombre con eevolucionar

        Acceso construccionEnemiga = new Acceso();
        for(int i =0 ; i<=7;i++) {
            construccionEnemiga.construir();
        }
        mapa.agregarConstruccion(espiral,10,10);
        mapa.agregarConstruccion(construccionEnemiga,11,11);
        Mutalisco muta = espiral.obtenerZerg();
        mapa.atacar(muta,11,11);
        assertEquals(491,construccionEnemiga.obtenerEscudo());

    }

    @Test
    public void UnGuardianAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {
        //Deberia evolucionar de Mutalisco

        Mapa mapa = new Mapa();
        Pilon pilon = new Pilon();
        Guardian guardian = new Guardian();

        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        mapa.agregarConstruccion(pilon,10,9);
        mapa.setearRadio();

        Acceso construccionEnemiga = new Acceso();
        for(int i =0 ; i<=7;i++) {
            construccionEnemiga.construir();
        }

        mapa.agregarConstruccion(construccionEnemiga,11,11);
        mapa.atacar(guardian,11,11);
        assertEquals(475,construccionEnemiga.obtenerEscudo());

    }
}
