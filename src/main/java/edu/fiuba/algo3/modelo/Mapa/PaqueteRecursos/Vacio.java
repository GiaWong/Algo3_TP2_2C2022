package edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;

public class Vacio implements Recurso, Terreno {


    @Override
    public boolean esPosibleConstruir(Construccion unaConstruccion) {
        return false;
    }
}
