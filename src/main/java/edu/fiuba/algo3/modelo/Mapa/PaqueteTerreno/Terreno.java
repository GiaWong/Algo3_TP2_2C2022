package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;

public interface Terreno {

    void esPosibleConstruir(Construccion unaConstruccion);

    void verificarSiPuedeSetear(Terreno unTerreno, Casilla casilla);

    boolean esMoho();

}
