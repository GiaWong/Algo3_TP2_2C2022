package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

public class ConEnergia implements Terreno{

    public void esPosibleConstruir(Construccion unaConstruccion) {
        unaConstruccion.esPosibleConstruirEn(this);
        /*
        NexoMineral nexo = new NexoMineral();
        Pilon pilon = new Pilon();
        Asimilador asimilador = new Asimilador();
        Acceso acceso = new Acceso();
        PuertoEstelar puerto = new PuertoEstelar();
        boolean esNexoMineral = (unaConstruccion.getClass().equals(nexo.getClass()));
        boolean esPilon = (unaConstruccion.getClass().equals(pilon.getClass()));
        boolean esAsimilador = (unaConstruccion.getClass().equals(asimilador.getClass()));
        boolean esAcceso = (unaConstruccion.getClass().equals(acceso.getClass()));
        boolean esPuertoEstelar = (unaConstruccion.getClass().equals(puerto.getClass()));

        if (esNexoMineral || esPilon || esAsimilador || esAcceso || esPuertoEstelar){
            return true;
        }
        return false;

         */

    }
}
