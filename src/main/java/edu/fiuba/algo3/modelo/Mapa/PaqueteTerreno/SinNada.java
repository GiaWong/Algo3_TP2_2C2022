package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;

public class SinNada implements Terreno{
    @Override
    public boolean esPosibleConstruir(Construccion unaConstruccion) {
        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        boolean esCriadero = (unaConstruccion.getClass().equals(criadero.getClass()));
        boolean esPilon = (unaConstruccion.getClass().equals(pilon.getClass()));

        if (esCriadero || esPilon){
            return true;
        }
        return false;
    }
}
