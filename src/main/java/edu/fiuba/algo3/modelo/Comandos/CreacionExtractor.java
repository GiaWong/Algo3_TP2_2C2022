package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionExtractor implements Accion {
    private final Coordenada coordenada;
    private final Mapa mapa;
    private final Raza raza;


    public  CreacionExtractor(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }
    public void ejecutar() {
        Construccion extractor = new Extractor();
        raza.comprar(extractor);
        mapa.agregar(extractor, coordenada);
    }
}

