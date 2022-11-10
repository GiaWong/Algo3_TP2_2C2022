package edu.fiuba.algo3.entrega_1.CasoDeUso9;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DestruccionEdificiosProtosTest {

    @Test
    public void NexoMineralEstaOperativoYSeDestruyeUnPilonYDebeSeguirOperativo() {

        boolean esperado = true;
        Mapa mapa = new Mapa();
        Pilon pilonUno = new Pilon(3);
        Pilon pilonDos = new Pilon(3);
        mapa.agregar(pilonUno,0,1); //cómo pasar una coordenada?
        mapa.agregar(pilonDos,0,4);
        NexoMineral nexo = new NexoMineral();
        mapa.agregar(nexo,0,2); //esta casilla ya tiene enrgia = 2 pq esto pasa en los for al crear pilones
        //nexo.setearDisponibilidad(mapa.conseguirEnergia(0,2)); esto se implementa adentro
        nexo.avanzarTurno(4);
        mapa.vaciar(0,1); //casilla tiene la instancia de la clase Nada
        // cuando elimino un pilon, las casillas aledañas tienen que hacer -1 energía
        //hacemos que nexo sepa que la casilla donde está ubicado tiene energía para que siga estando operativo
        boolean resultado = nexo.estaOperativo();
        assertEquals(resultado, esperado);
    }

    @Test
    public void AsimiladorEstaOperativoYSeDestruyeUnPilonYDebeSeguirOperativo() {

        boolean esperado = true;
        Mapa mapa = new Mapa();
        Pilon pilonUno = new Pilon(3);
        Pilon pilonDos = new Pilon(3);
        mapa.agregar(pilonUno,0,1); //cómo pasar una coordenada?
        mapa.agregar(pilonDos,0,4);
        Asimilador asimilador = new Asimilador();
        mapa.agregar(asimilador,0,2); //esta casilla ya tiene enrgia = 2 pq esto pasa en los for al crear pilones
        //nexo.setearDisponibilidad(mapa.conseguirEnergia(0,2)); esto se implementa adentro
        asimilador.avanzarTurno(6);
        mapa.vaciar(0,1); //casilla tiene la instancia de la clase Nada
        // cuando elimino un pilon, las casillas aledañas tienen que hacer -1 energía
        //hacemos que nexo sepa que la casilla donde está ubicado tiene energía para que siga estando operativo
        boolean resultado = asimilador.estaOperativo();
        assertEquals(resultado, esperado);
    }

    @Test
    public void AccesoEstaOperativoYSeDestruyeUnPilonYDebeSeguirOperativo() {

        boolean esperado = true;
        Mapa mapa = new Mapa();
        Pilon pilonUno = new Pilon(3);
        Pilon pilonDos = new Pilon(3);
        mapa.agregar(pilonUno,0,1); //cómo pasar una coordenada?
        mapa.agregar(pilonDos,0,4);
        Acceso acceso = new Acceso();
        mapa.agregar(acceso,0,2); //esta casilla ya tiene enrgia = 2 pq esto pasa en los for al crear pilones
        //nexo.setearDisponibilidad(mapa.conseguirEnergia(0,2)); esto se implementa adentro
        acceso.avanzarTurno(10);
        mapa.vaciar(0,1); //casilla tiene la instancia de la clase Nada
        // cuando elimino un pilon, las casillas aledañas tienen que hacer -1 energía
        //hacemos que nexo sepa que la casilla donde está ubicado tiene energía para que siga estando operativo
        boolean resultado = acceso.estaOperativo();
        assertEquals(resultado, esperado);
    }

    @Test
    public void PuertoEstelarEstaOperativoYSeDestruyeUnPilonYDebeSeguirOperativo() {

        boolean esperado = true;
        Mapa mapa = new Mapa();
        Pilon pilonUno = new Pilon(3);
        Pilon pilonDos = new Pilon(3);
        mapa.agregar(pilonUno,0,1); //cómo pasar una coordenada?
        mapa.agregar(pilonDos,0,4);
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        mapa.agregar(puertoEstelar,0,2); //esta casilla ya tiene enrgia = 2 pq esto pasa en los for al crear pilones
        //nexo.setearDisponibilidad(mapa.conseguirEnergia(0,2)); esto se implementa adentro
        puertoEstelar.avanzarTurno(10);
        mapa.vaciar(0,1); //casilla tiene la instancia de la clase Nada
        // cuando elimino un pilon, las casillas aledañas tienen que hacer -1 energía
        //hacemos que nexo sepa que la casilla donde está ubicado tiene energía para que siga estando operativo
        boolean resultado = puertoEstelar.estaOperativo();
        assertEquals(resultado, esperado);
    }
}