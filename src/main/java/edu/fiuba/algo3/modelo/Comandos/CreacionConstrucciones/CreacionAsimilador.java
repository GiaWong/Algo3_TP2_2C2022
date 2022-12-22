package edu.fiuba.algo3.modelo.Comandos.CreacionConstrucciones;

import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionAsimilador implements Accion {
    private final Coordenada coordenada;
    private final Mapa mapa;
    private final Raza raza;


    public  CreacionAsimilador(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }
    public void ejecutar() {
        Construccion asimilador = new Asimilador();
        raza.comprar(asimilador);
        mapa.agregar(asimilador, coordenada);
    }
}

