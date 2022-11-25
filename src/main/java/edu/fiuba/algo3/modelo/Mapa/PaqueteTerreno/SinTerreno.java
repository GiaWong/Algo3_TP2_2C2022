package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

public class SinTerreno implements Terreno{

    public void esPosibleConstruir(Construccion unaConstruccion) {
        unaConstruccion.esPosibleConstruirEn(this);
        /*

        Criadero criadero = new Criadero();
        Pilon pilon = new Pilon();
        boolean esCriadero = (unaConstruccion.getClass().equals(criadero.getClass()));
        boolean esPilon = (unaConstruccion.getClass().equals(pilon.getClass()));

        if (esCriadero || esPilon){
            return true;
        }else {
            return false;
        }

         */
    }
}
