package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;

public class ConEnergia implements Terreno{

    public void esPosibleConstruir(Construccion unaConstruccion) {
        unaConstruccion.esPosibleConstruirEn(this);
    }
}
