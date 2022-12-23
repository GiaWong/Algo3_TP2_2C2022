package edu.fiuba.algo3.entrega_2.CasoDeUso22;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso22Zerg {

    /*Verificar los tiempos de construccion de unidades y que tengan el edificio que permite
construirlas. */

    //Supuesto: ya existe la construccion que permite crear una unidad porque el jugador no podría seleccionar el mensaje
    //para crearla sino


    @Test
    public void testUnZanganoNoOperativoNoDeberiaPoderAtacar(){

        Zangano zangano = new Zangano();

        assertThrows(UnidadNoOperativa.class, ()-> {
            zangano.atacar(new Zealot());
        });
    }
    @Test
    public void unZerlingNoSePuedeAgregarAlMapaSiNoExisteReserva() {
        Zerling zerling = new Zerling();
        Mapa mapa = new Mapa(20,20);
        Criadero criadero = new Criadero();
        mapa.agregar(criadero,new Coordenada(10,10));
        assertDoesNotThrow(() -> mapa.agregar(zerling,new Coordenada(10,15)));
    }

    @Test
    public void SeVerificaPreRequisitoHidralisco() {
        Hidralisco hidralisco = new Hidralisco();
        List<Construccion> lisst = new ArrayList<>();
        Guarida guarida = new Guarida();
        lisst.add(guarida);
        for(int i=0;i<4;i++ ){
            hidralisco.construir();
        }
        assertEquals(true,hidralisco.estaDisponible());

        assertEquals(true, hidralisco.preRequisito(lisst));
    }

    @Test
    public void SeVerificaPreRequisitoMutalisco() {
        Mutalisco mutalisco = new Mutalisco();
        List<Construccion> lisst = new ArrayList<>();
        Espiral espiral = new Espiral();
        lisst.add(espiral);
        for(int i=0;i<7;i++ ){
            mutalisco.construir();
        }
        assertEquals(true,mutalisco.estaDisponible());

        assertEquals(true, mutalisco.preRequisito(lisst));
    }
    @Test
    public void SeverificaElTiempoConstuccionGuardian() {
        Guardian guardian = new Guardian();
        for(int i=0;i<4;i++ ){
            guardian.construir();
        }
        assertEquals(true,guardian.estaDisponible());
    }


}
