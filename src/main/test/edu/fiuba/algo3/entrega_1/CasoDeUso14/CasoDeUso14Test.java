package edu.fiuba.algo3.entrega_1.CasoDeUso14;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Exception.NoEstaEnergizado;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso14Test {

    Mapa mapa = new Mapa(20,20);
    Coordenada coordCriadero = new Coordenada(0,0);
    Coordenada coordPilon = new Coordenada(2,2);

    @Test
    public void SeCreaUnPilonYNoDeberiaEnergizarUnaCasillaConMoho(){

        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        mapa.agregar(criadero,coordCriadero);
        mapa.agregar(pilon,coordPilon);
        for(int i = 0; i<4; i++){
            mapa.avanzarTurno();
        }
        assertThrows( NoEstaEnergizado.class, ()-> {
            mapa.agregar(new Acceso(),new Coordenada(1,1));
        });

    }

    @Test
    public void MohoNoSeExpandeACasillasConConstrucciones(){

        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        mapa.agregar(criadero,coordCriadero);
        mapa.agregar(pilon,coordPilon);
        for(int i = 0; i<5; i++){
            mapa.avanzarTurno();
        }
        mapa.destruirConstruccion(coordPilon); //??
        /*
        assertDoesNotThrow( ()-> {
            mapa.agregar(new Pilon(), coordenadaPilon);
        });

        Porque este assert?
         */
    }


}



