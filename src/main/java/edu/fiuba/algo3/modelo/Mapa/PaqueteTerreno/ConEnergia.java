package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

public class ConEnergia implements Terreno{
    @Override
    public boolean esPosibleConstruir(Construccion unaConstruccion) {
        return false;
    }
}
