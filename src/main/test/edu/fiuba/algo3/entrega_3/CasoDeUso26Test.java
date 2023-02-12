package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.HasLlegadAlLimiteDeUnidadesCreadas;
import edu.fiuba.algo3.modelo.Exception.NoTienesSuministroParaCrearMasUnidades;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CasoDeUso26Test {


    @Test
    public void SeAgregaZanganoConSuministroSuficienteYNoDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Criadero criadero = new Criadero(0);
        zerg.agregar(criadero,new Coordenada(4,6),mapa);
        Zangano zangano = new Zangano();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertDoesNotThrow(() -> {
            zerg.agregar(zangano,new Coordenada(5,6),mapa);
        });
    }



    @Test
    public void SeAgregaZanganoConSuministroInsuficienteYDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Zangano zangano = new Zangano();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( NoTienesSuministroParaCrearMasUnidades.class, ()-> {
            zerg.agregar(zangano,new Coordenada(5,6),mapa);
        });
    }

    @Test
    public void SeAgregaZerlingConSuministroSuficienteYNoDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Criadero criadero = new Criadero(0);
        zerg.agregar(criadero,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        zerg.agregar(new ReservaProduccion(0),new Coordenada(4,7),mapa);
        Zerling zerling = new Zerling();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertDoesNotThrow(() -> {
            zerg.agregar(zerling,new Coordenada(5,6),mapa);
        });
    }



    @Test
    public void SeAgregaZerlingConSuministroInsuficienteYDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Zerling zerling = new Zerling();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( NoTienesSuministroParaCrearMasUnidades.class, ()-> {
            zerg.agregar(zerling,new Coordenada(5,6),mapa);
        });
    }

    @Test
    public void SeAgregaHidraliscoConSuministroSuficienteYNoDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Criadero criadero = new Criadero(0);
        zerg.agregar(criadero,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        zerg.agregar(new ReservaProduccion(0),new Coordenada(4,7),mapa);
        zerg.agregar(new Guarida(0),new Coordenada(4,8),mapa);
        Hidralisco hidralisco = new Hidralisco();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertDoesNotThrow(() -> {
            zerg.agregar(hidralisco,new Coordenada(5,6),mapa);
        });
    }



    @Test
    public void SeAgregaHidraliscoConSuministroInsuficienteYDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Hidralisco hidralisco = new Hidralisco();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( NoTienesSuministroParaCrearMasUnidades.class, ()-> {
            zerg.agregar(hidralisco,new Coordenada(5,6),mapa);
        });
    }

    @Test
    public void SeAgregaMutaliscoConSuministroSuficienteYNoDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Criadero criadero = new Criadero(0);
        zerg.agregar(criadero,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        zerg.agregar(new ReservaProduccion(0),new Coordenada(4,7),mapa);
        zerg.agregar(new Guarida(0),new Coordenada(4,8),mapa);
        zerg.agregar(new Espiral(0),new Coordenada(4,9),mapa);
        Mutalisco mutalisco = new Mutalisco();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertDoesNotThrow(() -> {
            zerg.agregar(mutalisco,new Coordenada(5,6),mapa);
        });
    }



    @Test
    public void SeAgregaMutaliscoConSuministroInsuficienteYDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Mutalisco mutalisco = new Mutalisco();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( NoTienesSuministroParaCrearMasUnidades.class, ()-> {
            zerg.agregar(mutalisco,new Coordenada(5,6),mapa);
        });
    }

    @Test
    public void SeAgregaGuardianConSuministroSuficienteYNoDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Criadero criadero = new Criadero(0);
        zerg.agregar(criadero,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        zerg.agregar(new ReservaProduccion(0),new Coordenada(4,7),mapa);
        zerg.agregar(new Guarida(0),new Coordenada(4,8),mapa);
        zerg.agregar(new Espiral(0),new Coordenada(4,9),mapa);
        Guardian guardian = new Guardian();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertDoesNotThrow(() -> {
            zerg.agregar(guardian,new Coordenada(5,6),mapa);
        });
    }



    @Test
    public void SeAgregaGuardianConSuministroInsuficienteYDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Guardian guardian = new Guardian();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( NoTienesSuministroParaCrearMasUnidades.class, ()-> {
            zerg.agregar(guardian,new Coordenada(5,6),mapa);
        });
    }

    @Test
    public void SeAgregaDevoradorConSuministroSuficienteYNoDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Criadero criadero = new Criadero(0);
        zerg.agregar(criadero,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        zerg.agregar(new ReservaProduccion(0),new Coordenada(4,7),mapa);
        zerg.agregar(new Guarida(0),new Coordenada(4,8),mapa);
        zerg.agregar(new Espiral(0),new Coordenada(4,9),mapa);
        Devorador devorador = new Devorador();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertDoesNotThrow(() -> {
            zerg.agregar(devorador,new Coordenada(5,6),mapa);
        });
    }



    @Test
    public void SeAgregaDevoradorConSuministroInsuficienteYDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Zerg zerg = new Zerg();
        zerg.aumentarGas(1000);
        zerg.aumentarMineral(1000);
        Devorador devorador = new Devorador();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( NoTienesSuministroParaCrearMasUnidades.class, ()-> {
            zerg.agregar(devorador,new Coordenada(5,6),mapa);
        });
    }

    @Test
    public void SeAgregaZealotConSuministroSuficienteYNoDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Protoss protoss = new Protoss();
        protoss.aumentarGas(1000);
        protoss.aumentarMineral(1000);
        Pilon pilon = new Pilon(0);
        protoss.agregar(pilon,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        protoss.agregar(new Acceso(0),new Coordenada(4,7),mapa);

        Zealot zealot = new Zealot();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertDoesNotThrow(() -> {
            protoss.agregar(zealot,new Coordenada(5,6),mapa);
        });
    }



    @Test
    public void SeAgregaZealotConSuministroInsuficienteYDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Protoss protoss = new Protoss();
        protoss.aumentarGas(1000);
        protoss.aumentarMineral(1000);
        Zealot zealot = new Zealot();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( NoTienesSuministroParaCrearMasUnidades.class, ()-> {
            protoss.agregar(zealot,new Coordenada(5,6),mapa);
        });
    }

    @Test
    public void SeAgregaDragonConSuministroSuficienteYNoDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Protoss protoss = new Protoss();
        protoss.aumentarGas(1000);
        protoss.aumentarMineral(1000);
        Pilon pilon = new Pilon(0);
        protoss.agregar(pilon,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        protoss.agregar(new Acceso(0),new Coordenada(4,7),mapa);

        Dragon dragon = new Dragon();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertDoesNotThrow(() -> {
            protoss.agregar(dragon,new Coordenada(5,6),mapa);
        });
    }



    @Test
    public void SeAgregaDragonConSuministroInsuficienteYDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Protoss protoss = new Protoss();
        protoss.aumentarGas(1000);
        protoss.aumentarMineral(1000);
        Dragon dragon = new Dragon();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( NoTienesSuministroParaCrearMasUnidades.class, ()-> {
            protoss.agregar(dragon,new Coordenada(5,6),mapa);
        });
    }

    @Test
    public void SeAgregaScoutConSuministroSuficienteYNoDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Protoss protoss = new Protoss();
        protoss.aumentarGas(1000);
        protoss.aumentarMineral(1000);
        Pilon pilon = new Pilon(0);
        protoss.agregar(pilon,new Coordenada(4,6),mapa);
        mapa.avanzarTurno();
        protoss.agregar(new Acceso(0),new Coordenada(4,7),mapa);
        protoss.agregar(new PuertoEstelar(0),new Coordenada(4,8),mapa);

        Dragon dragon = new Dragon();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertDoesNotThrow(() -> {
            protoss.agregar(dragon,new Coordenada(5,6),mapa);
        });
    }



    @Test
    public void SeAgregaScoutConSuministroInsuficienteYDeberiaTirarError(){
        Mapa mapa = new Mapa(20,20);
        Protoss protoss = new Protoss();
        protoss.aumentarGas(1000);
        protoss.aumentarMineral(1000);
        Dragon dragon = new Dragon();

        for(int i =0; i<=15; i++) {
            mapa.avanzarTurno();
        }

        assertThrows( NoTienesSuministroParaCrearMasUnidades.class, ()-> {
            protoss.agregar(dragon,new Coordenada(5,6),mapa);
        });
    }


}
