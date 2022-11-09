package edu.fiuba.algo3.entrega_1.CasoDeUso12;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.RefineriaGas.Asimilador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DanioConstruccionProtossAfectaVidaTest {

    @Test
    public void NexoMineralRecibeDanioYLaVidaEsAfectadaYEsLaEsperada() {

        int vidaEsperada = 200;
        Mapa mapa = new Mapa();
        NexoMineral nexoMineral = new NexoMineral();
        mapa.agregar(nexoMineral,0,1);
        nexoMineral.avanzarTurno(4); //empieza a estarDisponible y tiene vida max
        nexoMineral.recibeDanio(300); //si el valor supera 250 empieza a afectar la vida
        int vidaObtenida = nexoMineral.obtenerVida(); //0 es el mínimo,
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void NexoMineralRecibeDanioYElEscudoEsDerribadoYEsElEsperado() {

        int escudoEsperado = 0;
        Mapa mapa = new Mapa();
        NexoMineral nexoMineral = new NexoMineral();
        mapa.agregar(nexoMineral,0,1);
        nexoMineral.avanzarTurno(4); //empieza a estarDisponible y tiene vida max
        nexoMineral.recibeDanio(300); //si el valor supera 250 empieza a afectar la vida
        int escudoObtenido = nexoMineral.obtenerEscudo(); //0 es el mínimo,
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void NexoMineralRecibeDanioYLaVidaEsAfectadaYPasanCiertosTurnosYElEscudoEstaAlMaximo() {

        int escudoEsperado = 250;
        Mapa mapa = new Mapa();
        NexoMineral nexoMineral = new NexoMineral();
        mapa.agregar(nexoMineral,0,1);
        nexoMineral.avanzarTurno(4); //empieza a estarDisponible y tiene vida max
        nexoMineral.recibeDanio(300); //si el valor supera 250 empieza a afectar la vida
        nexoMineral.avanzarTurno(5);// hay que decidir la cantidad para que el escudo vuelva al máximo
        int escudoObtenido = nexoMineral.obtenerEscudo(); //0 es el mínimo,
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void AsimiladorRecibeDanioYLaVidaEsAfectadaYEsLaEsperada() {

        int vidaEsperada = 400;
        Mapa mapa = new Mapa();
        Asimilador asimilador = new Asimilador();
        mapa.agregar(asimilador,0,1);
        asimilador.avanzarTurno(6); //empieza a estarDisponible y tiene vida max
        asimilador.recibeDanio(500); //si el valor supera 450 empieza a afectar la vida
        int vidaObtenida = asimilador.obtenerVida(); //0 es el mínimo,
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void AsimiladorRecibeDanioYElEscudoEsDerribadoYEsElEsperado() {

        int escudoEsperado = 0;
        Mapa mapa = new Mapa();
        Asimilador asimilador = new Asimilador();
        mapa.agregar(asimilador,0,1);
        asimilador.avanzarTurno(4); //empieza a estarDisponible y tiene vida max
        asimilador.recibeDanio(500); //si el valor supera 250 empieza a afectar la vida
        int escudoObtenido = asimilador.obtenerEscudo(); //0 es el mínimo,
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void AsimiladorRecibeDanioYLaVidaEsAfectadaYPasanCiertosTurnosYElEscudoEstaAlMaximo() {

        int escudoEsperado = 450;
        Mapa mapa = new Mapa();
        Asimilador asimilador = new Asimilador();
        mapa.agregar(asimilador,0,1);
        asimilador.avanzarTurno(6); //empieza a estarDisponible y tiene vida max
        asimilador.recibeDanio(500); //si el valor supera 450 empieza a afectar la vida
        asimilador.avanzarTurno(5);// hay que decidir la cantidad para que el escudo vuelva al máximo
        int escudoObtenido = asimilador.obtenerEscudo(); //0 es el mínimo,
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void AccesoRecibeDanioYLaVidaEsAfectadaYEsLaEsperada() {

        int vidaEsperada = 450;
        Mapa mapa = new Mapa();
        Acceso acceso = new Acceso();
        mapa.agregar(acceso,0,1);
        acceso.avanzarTurno(8); //empieza a estarDisponible y tiene vida max
        acceso.recibeDanio(550); //si el valor supera 500 empieza a afectar la vida
        int vidaObtenida = acceso.obtenerVida(); //0 es el mínimo,
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void AccesoRecibeDanioYElEscudoEsDerribadoYEsElEsperado() {

        int escudoEsperado = 0;
        Mapa mapa = new Mapa();
        Acceso acceso = new Acceso();
        mapa.agregar(acceso,0,1);
        acceso.avanzarTurno(4); //empieza a estarDisponible y tiene vida max
        acceso.recibeDanio(550); //si el valor supera 250 empieza a afectar la vida
        int escudoObtenido = acceso.obtenerEscudo(); //0 es el mínimo
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void AccesoRecibeDanioYLaVidaEsAfectadaYPasanCiertosTurnosYElEscudoEstaAlMaximo() {

        int escudoEsperado = 500;
        Mapa mapa = new Mapa();
        Acceso acceso = new Acceso();
        mapa.agregar(acceso,0,1);
        acceso.avanzarTurno(8); //empieza a estarDisponible y tiene vida max
        acceso.recibeDanio(550); //si el valor supera 250 empieza a afectar la vida
        acceso.avanzarTurno(5);// hay que decidir la cantidad para que el escudo vuelva al máximo
        int escudoObtenido = acceso.obtenerEscudo(); //0 es el mínimo
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void PuertoEstelarRecibeDanioYLaVidaEsAfectadaYEsLaEsperada() {

        int vidaEsperada = 550;
        Mapa mapa = new Mapa();
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        mapa.agregar(puertoEstelar,0,1);
        puertoEstelar.avanzarTurno(10); //empieza a estarDisponible y tiene vida max
        puertoEstelar.recibeDanio(650); //si el valor supera 600 empieza a afectar la vida
        int vidaObtenida = puertoEstelar.obtenerVida(); //0 es el mínimo
        assertEquals(vidaEsperada,vidaObtenida);
    }

    @Test
    public void PuertoEstelarRecibeDanioYElEscudoEsDerribadoYEsElEsperado() {

        int escudoEsperado = 0;
        Mapa mapa = new Mapa();
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        mapa.agregar(puertoEstelar,0,1);
        puertoEstelar.avanzarTurno(4); //empieza a estarDisponible y tiene vida max
        puertoEstelar.recibeDanio(650); //si el valor supera 600 empieza a afectar la vida
        int escudoObtenido = puertoEstelar.obtenerEscudo(); //0 es el mínimo
        assertEquals(escudoEsperado,escudoObtenido);
    }

    @Test
    public void PuertoEstelarRecibeDanioYLaVidaEsAfectadaYPasanCiertosTurnosYElEscudoEstaAlMaximo() {

        int escudoEsperado = 600;
        Mapa mapa = new Mapa();
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        mapa.agregar(puertoEstelar,0,1);
        puertoEstelar.avanzarTurno(8); //empieza a estarDisponible y tiene vida max
        puertoEstelar.recibeDanio(650); //si el valor supera 600 empieza a afectar la vida
        puertoEstelar.avanzarTurno(5);// hay que decidir la cantidad para que el escudo vuelva al máximo
        int escudoObtenido = puertoEstelar.obtenerEscudo(); //0 es el mínimo
        assertEquals(escudoEsperado,escudoObtenido);
    }
}
