package edu.fiuba.algo3.entrega_2.CasoDeUso20;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.EstaUnidadNoSeMuevePorAreaEspacial;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso20Test {

    @Test
    public void UnScoutPuedeUbicarseEnUnaCasillaEspacial(){

        Mapa mapa = new Mapa(20,20);
        Coordenada coordenadaEspacial = new Coordenada(5,5);
        mapa.setearArea(coordenadaEspacial,new AreaEspacial());
        mapa.agregar(new Pilon(0),new Coordenada(7,7));
        mapa.avanzarTurno();
        mapa.agregar(new Acceso(0), new Coordenada(7,8));
        mapa.agregar(new PuertoEstelar(0), new Coordenada(7,9));

        Scout scout = new Scout();

        assertDoesNotThrow(  ()-> {mapa.agregar(scout,coordenadaEspacial);});

    }

    @Test
    public void UnMutaliscoPuedeUbicarseEnUnaCasillaEspacial(){
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenadaEspacial = new Coordenada(5,5);
        mapa.setearArea(coordenadaEspacial,new AreaEspacial());
        mapa.agregar(new Criadero(0),new Coordenada(7,7));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0), new Coordenada(7,8));
        mapa.agregar(new Guarida(0), new Coordenada(7,9));
        mapa.agregar(new Espiral(0), new Coordenada(6,7));


        Mutalisco mutalisco = new Mutalisco();

        assertDoesNotThrow(  ()-> {mapa.agregar(mutalisco,coordenadaEspacial);});
    }

    @Test
    public void UnGuardianPuedeUbicarseEnUnaCasillaEspacial(){
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenadaEspacial = new Coordenada(5,5);
        mapa.setearArea(coordenadaEspacial,new AreaEspacial());
        mapa.agregar(new Criadero(0),new Coordenada(7,7));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0), new Coordenada(7,8));
        mapa.agregar(new Guarida(0), new Coordenada(7,9));
        mapa.agregar(new Espiral(0), new Coordenada(6,7));


        Guardian guardian = new Guardian();

        assertDoesNotThrow(  ()-> {mapa.agregar(guardian,coordenadaEspacial);});
    }

    @Test
    public void UnDevoradorPuedeUbicarseEnUnaCasillaEspacial(){
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenadaEspacial = new Coordenada(5,5);
        mapa.setearArea(coordenadaEspacial,new AreaEspacial());
        mapa.agregar(new Criadero(0),new Coordenada(7,7));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0), new Coordenada(7,8));
        mapa.agregar(new Guarida(0), new Coordenada(7,9));
        mapa.agregar(new Espiral(0), new Coordenada(6,7));


        Devorador devorador = new Devorador();

        assertDoesNotThrow(  ()-> {mapa.agregar(devorador,coordenadaEspacial);});
    }



    @Test
    public void UnDragonNoPuedeUbicarseEnUnaCasillaEspacial(){
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenadaEspacial = new Coordenada(5,5);
        mapa.setearArea(coordenadaEspacial,new AreaEspacial());
        mapa.agregar(new Pilon(0),new Coordenada(7,7));
        mapa.avanzarTurno();
        mapa.agregar(new Acceso(0), new Coordenada(7,8));

        for (int i = 0; i < 10; i++){
            mapa.avanzarTurno();
        }

        Dragon dragon = new Dragon();

        assertThrows( EstaUnidadNoSeMuevePorAreaEspacial.class, ()-> {
            mapa.agregar(dragon,coordenadaEspacial);
        });
    }

    @Test
    public void UnZealotNoPuedeUbicarseEnUnaCasillaEspacial(){
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenadaEspacial = new Coordenada(5,5);
        mapa.setearArea(coordenadaEspacial,new AreaEspacial());
        mapa.agregar(new Pilon(0),new Coordenada(7,7));
        mapa.avanzarTurno();
        mapa.agregar(new Acceso(0), new Coordenada(7,8));

        for (int i = 0; i < 10; i++){
            mapa.avanzarTurno();
        }

        Zealot zealot = new Zealot();

        assertThrows( EstaUnidadNoSeMuevePorAreaEspacial.class, ()-> {
            mapa.agregar(zealot,coordenadaEspacial);
        });
    }

    @Test
    public void UnHidraliscoNoPuedeUbicarseEnUnaCasillaEspacial(){
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenadaEspacial = new Coordenada(5,5);
        mapa.setearArea(coordenadaEspacial,new AreaEspacial());
        mapa.agregar(new Criadero(0),new Coordenada(7,7));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0), new Coordenada(7,8));
        mapa.agregar(new Guarida(0), new Coordenada(7,9));

        for (int i = 0; i < 10; i++){
            mapa.avanzarTurno();
        }

        Hidralisco hidralisco = new Hidralisco();

        assertThrows( EstaUnidadNoSeMuevePorAreaEspacial.class, ()-> {
            mapa.agregar(hidralisco,coordenadaEspacial);
        });
    }
    @Test
    public void UnZerlingNoPuedeUbicarseEnUnaCasillaEspacial(){
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenadaEspacial = new Coordenada(5,5);
        mapa.setearArea(coordenadaEspacial,new AreaEspacial());
        mapa.agregar(new Criadero(0),new Coordenada(7,7));
        mapa.avanzarTurno();
        mapa.agregar(new ReservaProduccion(0), new Coordenada(7,8));

        for (int i = 0; i < 10; i++){
            mapa.avanzarTurno();
        }

        Zerling zerling = new Zerling();

        assertThrows( EstaUnidadNoSeMuevePorAreaEspacial.class, ()-> {
            mapa.agregar(zerling,coordenadaEspacial);
        });
    }

    @Test
    public void UnZanganoNoPuedeUbicarseEnUnaCasillaEspacial(){
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenadaEspacial = new Coordenada(5,5);
        mapa.setearArea(coordenadaEspacial,new AreaEspacial());
        mapa.agregar(new Criadero(0),new Coordenada(7,7));
        mapa.avanzarTurno();

        for (int i = 0; i < 10; i++){
            mapa.avanzarTurno();
        }

        Zangano zangano = new Zangano();

        assertThrows( EstaUnidadNoSeMuevePorAreaEspacial.class, ()-> {
            mapa.agregar(zangano,coordenadaEspacial);
        });
    }

}
