package edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos;

import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;

public class Vacio implements Recurso {


    @Override
    public boolean esPosibleConstruir(Construccion unaConstruccion) {

        if(unaConstruccion.getClass().equals(Vacio.class)){//si el terrno es Vacio

            System.out.println("mmmm");
            return false;
        }


        Asimilador asimilador = new Asimilador();
        Extractor extractor = new Extractor();
        NexoMineral nexo = new NexoMineral();
        boolean esAsimilador, esExtractor, esNexo;
        esAsimilador = unaConstruccion.getClass().equals(asimilador.getClass());
        esExtractor = unaConstruccion.getClass().equals(extractor.getClass());
        esNexo = unaConstruccion.getClass().equals(nexo.getClass());
        System.out.println("no entró al if de Recurso");

        return (!esAsimilador || !esExtractor || !esNexo );//Devuelve True si la construccion NO es una Refineria.
    }
}