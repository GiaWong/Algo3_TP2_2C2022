package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Comandos.Ataque;
import edu.fiuba.algo3.modelo.Comandos.CreacionConstrucciones.CreacionCriadero;
import edu.fiuba.algo3.modelo.Comandos.CreacionConstrucciones.CreacionPilon;
import edu.fiuba.algo3.modelo.Comandos.CreacionConstrucciones.CreacionReserva;
import edu.fiuba.algo3.modelo.Comandos.CreacionUnidades.CreacionZerling;
import edu.fiuba.algo3.modelo.Comandos.PasarTurno;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Exception.FinDelJuego;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Partida.Partida;
import edu.fiuba.algo3.modelo.Unidades.Dragon;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.fiuba.algo3.modelo.Unidades.Unidad;
import org.junit.jupiter.api.Test;

public class CasoDeUso32Test { //Verificar devuelta el fin del juego
    Mapa mapa = new Mapa(20,20);
    Coordenada coordenadaDragon = new Coordenada(5,5);
    Coordenada coordenadaPilon = new Coordenada(6,6);
    Coordenada coordenadaCriadero = new Coordenada(6,8);

    Coordenada coordenadaZerling = new Coordenada(6,7);



    @Test
    public void SeTesteaElFinDelJuego() {
        /*
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

         */

        // TODO: Otra nueva forma de pensar el fin del juego. Con Acciones.
        Raza protoss = new Protoss();
        Raza zerg = new Zerg();
        Jugador jugadorUno = new Jugador("Eduardo", "Rojo", zerg);
        Jugador jugadorDos = new Jugador("Fernando", "Amarillo", protoss);
        Partida partida = new Partida(mapa, jugadorUno, jugadorDos);

        //Juega jugador uno
        partida.asignarAccionAlJugador(new CreacionCriadero(zerg, coordenadaCriadero, mapa));
        partida.ejecutarAccionDeJugador();
        partida.asignarAccionAlJugador(new PasarTurno(partida));
        partida.ejecutarAccionDeJugador();

        //Juega jugador dos
        partida.asignarAccionAlJugador(new CreacionPilon(protoss, coordenadaPilon, mapa));
        partida.ejecutarAccionDeJugador();
        partida.asignarAccionAlJugador(new PasarTurno(partida));
        partida.ejecutarAccionDeJugador();

        for(int i = 0; i < 10; i++){
            partida.asignarAccionAlJugador(new PasarTurno(partida));
            partida.ejecutarAccionDeJugador();
        }

        //Juega jugador uno
        partida.asignarAccionAlJugador(new CreacionReserva(zerg, coordenadaZerling, mapa));
        partida.ejecutarAccionDeJugador();
        for(int i = 0; i < 10; i++){
            partida.asignarAccionAlJugador(new PasarTurno(partida));
            partida.ejecutarAccionDeJugador();
        }

        partida.asignarAccionAlJugador(new CreacionZerling(zerg, coordenadaZerling, mapa));
        partida.ejecutarAccionDeJugador();

        for(int i = 0; i < 10; i++) {
            partida.asignarAccionAlJugador(new PasarTurno(partida));
            partida.ejecutarAccionDeJugador();
        }
        //Sigue jugando jugador uno
        Unidad zerling = mapa.devolverUnidad(coordenadaZerling);
        for(int i = 0; i < 1000; i++){
            partida.asignarAccionAlJugador(new Ataque(zerling, coordenadaPilon, mapa));
            partida.ejecutarAccionDeJugador();
        }
        partida.asignarAccionAlJugador(new PasarTurno(partida));
        partida.ejecutarAccionDeJugador();

        //Le tocaria al jugador dos, pero deberia terminar el juego por no tener mas construcciones
        assertThrows(FinDelJuego.class, partida::verificarFinDelJuego);

    }
}
