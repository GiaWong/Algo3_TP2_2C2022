package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class Movimiento implements Accion{

    private final Coordenada unaCoordenada;

    private final Coordenada otraCoordenada;

    private final Mapa mapa;

    public Movimiento(Coordenada coordenadaDeUnidad, Coordenada coordenadaAMoverse, Mapa unMapa){
        unaCoordenada = coordenadaDeUnidad;
        otraCoordenada = coordenadaAMoverse;
        mapa = unMapa;
    }

    @Override
    public void ejecutar() {
        //mapa.moverUnidad(unaCoordenada, otraCoordenada);
    }
}
