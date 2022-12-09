package edu.fiuba.algo3.entrega_1.CasoDeUso14;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Exception.NoEstaEnergizado;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso14Test {
    @Test
    public void SeCreaUnPilonYNoDeberiaEnergizarUnaCasillaConMoho(){
        Mapa mapa = new Mapa(20,20);
        Coordenada coordenada = new Coordenada(10,10);
        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        mapa.agregar(criadero,coordenada);
        mapa.agregar(pilon,new Coordenada(10,13));
        for(int i = 0; i<4; i++){
            criadero.avanzarTurno(mapa);
            pilon.avanzarTurno();
        }
        assertThrows( NoEstaEnergizado.class, ()-> {
            mapa.agregar(new Acceso(),new Coordenada(10,12));
        });

    }

    @Test
    public void MohoNoSeExpandeACasillasConConstrucciones(){
        Mapa mapa = new Mapa(20,20);

        Coordenada coordenada = new Coordenada(10,10);
        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        mapa.agregar(criadero,new Coordenada(10,10));
        Coordenada coordenadaPilon = new Coordenada(10,16);
        mapa.agregar(pilon,coordenadaPilon);
        for(int i = 0; i<5; i++){
            criadero.avanzarTurno(mapa);
            pilon.avanzarTurno();
        }
        mapa.destruirConstruccion(coordenadaPilon);
        assertDoesNotThrow( ()-> {
            mapa.agregar(new Pilon(), coordenadaPilon);
        });
    }


}



