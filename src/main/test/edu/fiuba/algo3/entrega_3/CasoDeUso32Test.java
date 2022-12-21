package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Dragon;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CasoDeUso32Test { //Verificar devuelta el fin del juego
    Mapa mapa = new Mapa(20,20);
    Coordenada coordenadaDragon = new Coordenada(5,5);
    Coordenada coordenadaPilon = new Coordenada(6,6);
    Coordenada coordenadaCriadero = new Coordenada(6,8);


    @Test
    public void SeTesteaElFinDelJuego() {
        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        Dragon dragon = new Dragon();
        mapa.agregar(dragon, coordenadaDragon);
        mapa.agregar(pilon,coordenadaPilon);
        mapa.agregar(criadero,coordenadaCriadero);

        for (int i = 0; i < 4; i++) {
            dragon.construir();
            pilon.construir();
        }
        pilon.energizar(mapa);

        for (int j = 0; j < 50; j++) {
            dragon.atacar(criadero);
        }
        //assertTrue(mapa.finJuego());


    }
}
