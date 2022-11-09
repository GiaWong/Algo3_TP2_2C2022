package edu.fiuba.algo3.entrega_1.CasoDeUso11;

import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.RefineriaGas.Asimilador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DanioConstruccionProtossNoAfectaVidaTest {
    @Test
    public void NexoMineralRecibeDanioYElEscudoNoEsDestruidoYEsElEsperado() {

        int escudoEsperado = 200;
        Mapa mapa = new Mapa();
        NexoMineral nexoMineral = new NexoMineral();
        mapa.agregar(nexoMineral,0,1);
        nexoMineral.avanzarTurno(4); //empieza a estarDisponible y tiene vida max
        nexoMineral.recibeDanio(50); //si el valor supera 250 empieza a afectar la vida
        int escudoObtenido = nexoMineral.obtenerEscudo(); //0 es el mínimo, en este caso será mayor que 0 por el enunciado
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void NexoMineralRecibeDanioYPasanCiertosTurnosYEscudoEstaAlMaximo() {

        int escudoEsperado = 250;
        Mapa mapa = new Mapa();
        NexoMineral nexoMineral = new NexoMineral();
        mapa.agregar(nexoMineral,0,1);
        nexoMineral.avanzarTurno(4); //empieza a estarDisponible y tiene vida max
        nexoMineral.recibeDanio(50); //si el valor supera 250 empieza a afectar la vida
        nexoMineral.avanzarTurno(5);// hay que decidir la cantidad para que el escudo vuelva al máximo
        int escudoObtenido = nexoMineral.obtenerEscudo(); //0 es el mínimo, en este caso será mayor que 0 por el enunciado
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void AsimiladorRecibeDanioYElEscudoNoEsDestruidoYEsElEsperado() {

        int escudoEsperado = 400;
        Mapa mapa = new Mapa();
        Asimilador asimilador = new Asimilador();
        mapa.agregar(asimilador,0,1);
        asimilador.avanzarTurno(6); //empieza a estarDisponible y tiene vida max
        asimilador.recibeDanio(50); //si el valor supera 250 empieza a afectar la vida
        int escudoObtenido = asimilador.obtenerEscudo(); //0 es el mínimo, en este caso será mayor que 0 por el enunciado
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void AsimiladorRecibeDanioYPasanCiertosTurnosYEscudoEstaAlMaximo() {

        int escudoEsperado = 450;
        Mapa mapa = new Mapa();
        Asimilador asimilador = new Asimilador();
        mapa.agregar(asimilador,0,1);
        asimilador.avanzarTurno(6); //empieza a estarDisponible y tiene vida max
        asimilador.recibeDanio(50); //si el valor supera 250 empieza a afectar la vida
        asimilador.avanzarTurno(5);// hay que decidir la cantidad para que el escudo vuelva al máximo
        int escudoObtenido = asimilador.obtenerEscudo(); //0 es el mínimo, en este caso será mayor que 0 por el enunciado
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void AccesoRecibeDanioYElEscudoNoEsDestruidoYEsElEsperado() {

        int escudoEsperado = 450;
        Mapa mapa = new Mapa();
        Acceso acceso = new Acceso();
        mapa.agregar(acceso,0,1);
        acceso.avanzarTurno(8); //empieza a estarDisponible y tiene vida max
        acceso.recibeDanio(50); //si el valor supera 250 empieza a afectar la vida
        int escudoObtenido = acceso.obtenerEscudo(); //0 es el mínimo, en este caso será mayor que 0 por el enunciado
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void AccesoRecibeDanioYPasanCiertosTurnosYEscudoEstaAlMaximo() {

        int escudoEsperado = 500;
        Mapa mapa = new Mapa();
        Acceso acceso = new Acceso();
        mapa.agregar(acceso,0,1);
        acceso.avanzarTurno(8); //empieza a estarDisponible y tiene vida max
        acceso.recibeDanio(50); //si el valor supera 250 empieza a afectar la vida
        acceso.avanzarTurno(5);// hay que decidir la cantidad para que el escudo vuelva al máximo
        int escudoObtenido = acceso.obtenerEscudo(); //0 es el mínimo, en este caso será mayor que 0 por el enunciado
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void PuertoEstelarRecibeDanioYElEscudoNoEsDestruidoYEsElEsperado() {

        int escudoEsperado = 550;
        Mapa mapa = new Mapa();
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        mapa.agregar(puertoEstelar,0,1);
        puertoEstelar.avanzarTurno(10); //empieza a estarDisponible y tiene vida max
        puertoEstelar.recibeDanio(50); //si el valor supera 250 empieza a afectar la vida
        int escudoObtenido = puertoEstelar.obtenerEscudo(); //0 es el mínimo, en este caso será mayor que 0 por el enunciado
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void AccesoRecibeDanioYPasanCiertosTurnosYEscudoEstaAlMaximo() {

        int escudoEsperado = 600;
        Mapa mapa = new Mapa();
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        mapa.agregar(puertoEstelar,0,1);
        puertoEstelar.avanzarTurno(10); //empieza a estarDisponible y tiene vida max
        puertoEstelar.recibeDanio(50); //si el valor supera 250 empieza a afectar la vida
        puertoEstelar.avanzarTurno(5);// hay que decidir la cantidad para que el escudo vuelva al máximo
        int escudoObtenido = puertoEstelar.obtenerEscudo(); //0 es el mínimo, en este caso será mayor que 0 por el enunciado
        assertEquals(escudoEsperado,escudoObtenido);
    }
}
