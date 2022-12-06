package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionCriadero implements Accion {
    private final Coordenada coordenada;
    private final Mapa mapa;
    private final Raza raza;


    public  CreacionCriadero(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }
    public void ejecutar() {
        Construccion criadero = new Criadero();
        raza.comprar(criadero);
        mapa.agregar(criadero, coordenada);
    }
}

