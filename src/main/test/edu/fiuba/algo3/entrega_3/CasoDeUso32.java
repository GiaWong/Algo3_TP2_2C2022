package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Comandos.CreacionPilon;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Partida.Partida;
import org.junit.jupiter.api.Test;

public class CasoDeUso32 {
    Coordenada coordenada = new Coordenada(5,5);
    @Test
    public void SeTesteaElFinDelJuego(){
        Partida patirdaPrueba = new Partida();
        Zerg zerg = new Zerg();
        Protoss protoss = new Protoss();
        Jugador jugador1 = new Jugador("Ramon","Azul",zerg);
        Jugador jugador2 = new Jugador("Poncho","Naranja",protoss);
        patirdaPrueba.asignarJugador(jugador1);
        patirdaPrueba.asignarJugador(jugador2);
        patirdaPrueba.inicializar2Bases();
        Accion agregarPilon = new CreacionPilon(coordenada,);
        Mapa mapa = new Mapa(20,20);
        mapa.inicializar2Bases();


    }

}
