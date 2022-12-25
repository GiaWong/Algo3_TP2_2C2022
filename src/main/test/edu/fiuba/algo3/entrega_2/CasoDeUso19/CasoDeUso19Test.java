package edu.fiuba.algo3.entrega_2.CasoDeUso19;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CasoDeUso19Test {

    //Mapa y coordenadas
    Mapa mapa = new Mapa(20,20);

    @Test
    public void ZerlingNoDeberiaPoderAtacarAUnScout(){
        Construccion criadero = new Criadero(0);
        Construccion reservaProduccion = new ReservaProduccion(0);
        Construccion pilon = new Pilon(0);
        Unidad atacante = new Zerling();
        UnidadProtoss defensora = new Scout();
        mapa.agregar(pilon,new Coordenada(10,10));
        mapa.agregar(criadero,new Coordenada(10,11));

        for (int i = 0; i < 2; i++){
            criadero.avanzarTurno(mapa);
            pilon.avanzarTurno(mapa);
        }

        mapa.agregar(reservaProduccion,new Coordenada(10,12));
        mapa.agregar(atacante,new Coordenada(10,15));
        mapa.agregar(defensora,new Coordenada(10,16));


        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(atacante,new Coordenada(10,16));

        assertEquals(100,defensora.escudo());
    }



    @Test
    public void ZerlingNoDeberiaPoderAtacarAUnMutalisco(){ //

        Construccion criadero = new Criadero(0);
        Construccion reservaProduccion = new ReservaProduccion(0);
        Construccion espiral = new Espiral(0);
        Unidad atacante = new Zerling();
        Unidad defensora = new Mutalisco();
        mapa.agregar(criadero,new Coordenada(10,11));

        for (int i = 0; i < 2; i++){
            criadero.avanzarTurno(mapa);
        }

        mapa.agregar(reservaProduccion,new Coordenada(10,12));
        mapa.agregar(espiral,new Coordenada(10,13));
        mapa.agregar(atacante,new Coordenada(10,15));
        mapa.agregar(defensora,new Coordenada(10,16));


        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(atacante,new Coordenada(10,16));

        assertEquals(120,defensora.vida());

    }


    @Test
    public void ZerlingNoDeberiaPoderAtacarAUnGuardian(){ //
        Construccion criadero = new Criadero(0);
        Construccion reservaProduccion = new ReservaProduccion(0);
        Construccion espiral = new Espiral(0);
        Unidad atacante = new Zerling();
        Unidad defensora = new Guardian();
        mapa.agregar(criadero,new Coordenada(10,11));

        for (int i = 0; i < 2; i++){
            criadero.avanzarTurno(mapa);
        }

        mapa.agregar(reservaProduccion,new Coordenada(10,12));
        mapa.agregar(espiral,new Coordenada(10,13));
        mapa.agregar(atacante,new Coordenada(10,15));
        mapa.agregar(defensora,new Coordenada(10,16));


        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(atacante,new Coordenada(10,16));

        assertEquals(100,defensora.vida());
    }

    @Test
    public void GuardianNoDeberiaPoderAtacarAUnMutalisco(){ //
        Construccion criadero = new Criadero(0);
        Construccion espiral = new Espiral(0);
        Unidad atacante = new Guardian();
        Unidad defensora = new Mutalisco();
        mapa.agregar(criadero,new Coordenada(10,11));

        for (int i = 0; i < 2; i++){
            criadero.avanzarTurno(mapa);
        }

        mapa.agregar(espiral,new Coordenada(10,13));
        mapa.agregar(atacante,new Coordenada(10,15));
        mapa.agregar(defensora,new Coordenada(10,16));


        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(atacante,new Coordenada(10,16));

        assertEquals(120,defensora.vida());
    }

    @Test
    public void GuardianNoDeberiaPoderAtacarAOtroGuardian(){ //
        Construccion criadero = new Criadero(0);
        Construccion espiral = new Espiral(0);
        Unidad atacante = new Guardian();
        Unidad defensora = new Guardian();
        mapa.agregar(criadero,new Coordenada(10,11));

        for (int i = 0; i < 2; i++){
            criadero.avanzarTurno(mapa);
        }

        mapa.agregar(espiral,new Coordenada(10,13));
        mapa.agregar(atacante,new Coordenada(10,15));
        mapa.agregar(defensora,new Coordenada(10,16));


        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(atacante,new Coordenada(10,16));

        assertEquals(100,defensora.vida());

    }

    @Test
    public void GuardianNoDeberiaPoderAtacarAUnScout(){ //
        Construccion criadero = new Criadero(0);
        Construccion reserva = new ReservaProduccion(0);
        Construccion guarida = new Guarida(0);
        Construccion espiral = new Espiral(0);
        Construccion pilon = new Pilon(0);
        Unidad atacante = new Guardian();
        UnidadProtoss defensora = new Scout();
        mapa.agregar(criadero,new Coordenada(10,11));
        mapa.agregar(pilon,new Coordenada(10,12));

        for (int i = 0; i < 2; i++){
            criadero.avanzarTurno(mapa);
            pilon.avanzarTurno(mapa);
        }
        mapa.agregar(reserva,new Coordenada(11,13));
        mapa.agregar(guarida,new Coordenada(12,13));
        mapa.agregar(espiral,new Coordenada(10,13));
        mapa.agregar(atacante,new Coordenada(10,15));
        mapa.agregar(defensora,new Coordenada(10,16));


        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(atacante,new Coordenada(10,16));

        assertEquals(100,defensora.escudo());
    }


    @Test
    public void ZealotNoDeberiaPoderAtacarAUnMutalisco(){ //
        Construccion criadero = new Criadero(0);
        Construccion reserva = new ReservaProduccion(0);
        Construccion guarida = new Guarida(0);
        Construccion acceso = new Acceso(0);
        Construccion espiral = new Espiral(0);
        Construccion pilon = new Pilon(0);
        Unidad atacante = new Zealot();
        Unidad defensora = new Mutalisco();

        mapa.agregar(criadero,new Coordenada(5,11));
        mapa.agregar(pilon,new Coordenada(14,12));

        for (int i = 0; i < 2; i++){
            criadero.avanzarTurno(mapa);
            pilon.avanzarTurno(mapa);
        }

        mapa.agregar(reserva,new Coordenada(6,13));
        mapa.agregar(guarida,new Coordenada(7,13));
        mapa.agregar(espiral,new Coordenada(8,13));
        mapa.agregar(acceso,new Coordenada(14,14));
        mapa.agregar(atacante,new Coordenada(10,15));
        mapa.agregar(defensora,new Coordenada(10,16));


        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(atacante,new Coordenada(10,16));

        assertEquals(120,defensora.vida());

    }


    @Test
    public void ZealotNoDeberiaPoderAtacarAUnGuardian(){ //
        Construccion criadero = new Criadero(0);
        Construccion reserva = new ReservaProduccion(0);
        Construccion guarida = new Guarida(0);
        Construccion acceso = new Acceso(0);
        Construccion espiral = new Espiral(0);
        Construccion pilon = new Pilon(0);
        Unidad atacante = new Zealot();
        Unidad defensora = new Guardian();
        mapa.agregar(criadero,new Coordenada(4,12));
        mapa.agregar(pilon,new Coordenada(10,12));

        for (int i = 0; i < 2; i++){
            criadero.avanzarTurno(mapa);
            pilon.avanzarTurno(mapa);
        }

        mapa.agregar(reserva,new Coordenada(5,13));
        mapa.agregar(guarida,new Coordenada(6,13));
        mapa.agregar(espiral,new Coordenada(4,13));
        mapa.agregar(acceso,new Coordenada(10,14));
        mapa.agregar(atacante,new Coordenada(10,15));
        mapa.agregar(defensora,new Coordenada(10,16));


        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(atacante,new Coordenada(10,16));

        assertEquals(100,defensora.vida());

    }

    @Test
    public void ZealotNoDeberiaPoderAtacarAUnScout(){ //
        Construccion acceso = new Acceso(0);
        Construccion puertoEstelar = new PuertoEstelar(0);
        Construccion pilon = new Pilon(0);
        Unidad atacante = new Zealot();
        UnidadProtoss defensora = new Scout();
        mapa.agregar(pilon,new Coordenada(10,12));

        for (int i = 0; i < 2; i++){
            pilon.avanzarTurno(mapa);
        }

        mapa.agregar(acceso,new Coordenada(10,14));
        mapa.agregar(puertoEstelar,new Coordenada(10,13));
        mapa.agregar(atacante,new Coordenada(10,15));
        mapa.agregar(defensora,new Coordenada(10,16));


        for(int i = 0; i < 15; i++){
            mapa.avanzarTurno();
        }
        mapa.atacar(atacante,new Coordenada(10,16));

        assertEquals(100,defensora.escudo());
    }



}
