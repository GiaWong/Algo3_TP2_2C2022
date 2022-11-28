package edu.fiuba.algo3.entrega_2.CasoDeUso18;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificarAtaqueDeUnidadesZerg {

    //Verificar que todas las unidades cuasen el daño que dicen que causan en sus ataques

    // Unidad Zerg ataca a Construccion Protoss
    @Test
    public void UnZerlingAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {

        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        mapa.agregar(pilon, new Coordenada(10,9));
        mapa.setearRadio();
        ReservaProduccion reserva = new ReservaProduccion();
        Unidad zerling = reserva.crearUnidad();

        Acceso construccionEnemiga = new Acceso();
        for(int i =0 ; i<=7;i++) {
            construccionEnemiga.construir();
        }

        Coordenada coordReserva = new Coordenada(11,10);
        Coordenada coordAtacada = new Coordenada(11,11);
        Coordenada coordZerling = new Coordenada(12,12);

        mapa.agregar(reserva,coordReserva);
        mapa.agregar(construccionEnemiga,coordAtacada);
        mapa.agregar(zerling, coordZerling);
        mapa.atacar(zerling,coordAtacada);
        assertEquals(496,construccionEnemiga.obtenerEscudo());

    }

    @Test
    public void UnHidraliscoAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {
        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        mapa.agregar(pilon,new Coordenada(10,9));
        mapa.setearRadio();
        Guarida guarida = new Guarida();


        Acceso construccionEnemiga = new Acceso();
        for(int i =0 ; i<=7;i++) {
            construccionEnemiga.construir();
        }

        Coordenada coordGuarida = new Coordenada(10,10);
        Coordenada coordAtacada = new Coordenada(11,11);
        Coordenada coordHidra = new Coordenada(12, 12);

        mapa.agregar(guarida,coordGuarida);
        mapa.agregar(construccionEnemiga,coordAtacada);
        Unidad hidralisco = new Hidralisco();
        mapa.agregar(hidralisco,coordHidra);
        mapa.atacar(hidralisco,coordAtacada);
        assertEquals(490,construccionEnemiga.obtenerEscudo());

    }

    @Test
    public void UnMutaliscoAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {
        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon();
        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        mapa.agregar(pilon,new Coordenada(10,9));
        mapa.setearRadio();
        Espiral espiral = new Espiral();
        espiral.conZerg(new Mutalisco());//ver en reserva en dond se guardaré zerlings, lista? //cambiar nombre con eevolucionar

        Acceso construccionEnemiga = new Acceso();
        for(int i =0 ; i<=7;i++) {
            construccionEnemiga.construir();
        }

        Coordenada coordEspiral = new Coordenada(10,10);
        Coordenada coordAtacada = new Coordenada(11,11);
        Coordenada coordMutalisco = new Coordenada(12, 12);

        mapa.agregar(espiral,coordEspiral);
        mapa.agregar(construccionEnemiga,coordAtacada);
        Unidad muta = new Mutalisco();
        mapa.agregar(muta,coordMutalisco);
        mapa.atacar(muta,coordAtacada);
        assertEquals(491,construccionEnemiga.obtenerEscudo());

    }

    @Test
    public void UnGuardianAtacaAUnaConstruccionProtossYDeberiaHacerleDanio() {
        //Deberia evolucionar de Mutalisco

        Mapa mapa = new Mapa(20,20);
        Pilon pilon = new Pilon();
        Guardian guardian = new Guardian();

        for(int i =0 ; i<=4;i++) {
            pilon.construir();
        }
        mapa.agregar(pilon,new Coordenada(10,9));
        mapa.setearRadio();

        Acceso construccionEnemiga = new Acceso();
        for(int i =0 ; i<=7;i++) {
            construccionEnemiga.construir();
        }
        Coordenada coordAtacada = new Coordenada(11,11);
        Coordenada coordGuardian = new Coordenada(12, 12);

        mapa.agregar(construccionEnemiga,coordAtacada);
        mapa.agregar(guardian,coordGuardian);
        mapa.atacar(guardian,coordAtacada);
        assertEquals(475,construccionEnemiga.obtenerEscudo());

    }
}
