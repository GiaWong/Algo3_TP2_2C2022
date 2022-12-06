package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Comandos.CreacionPilon;
import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Partida.Partida;
import edu.fiuba.algo3.modelo.Unidades.Dragon;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CasoDeUso32Test {
    Coordenada coordenada = new Coordenada(5,5);
    @Test
    public void SeTesteaElFinDelJuego() {
        Mapa mapa = new Mapa(20, 20);
        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        Dragon dragon = new Dragon();
        mapa.agregar(dragon, coordenada);
        coordenada = new Coordenada(6,6);
        mapa.agregar(pilon,coordenada);
        coordenada = new Coordenada(6,8);
        mapa.agregar(criadero,coordenada);

        for (int i = 0; i < 4; i++) {
            dragon.construir();
            pilon.construir();
        }
        pilon.energizar(mapa,coordenada);
        for (int j = 0; j < 50; j++) {
            dragon.atacar(criadero);
        }
        assertEquals(true,mapa.FinJuego());


    }
}
