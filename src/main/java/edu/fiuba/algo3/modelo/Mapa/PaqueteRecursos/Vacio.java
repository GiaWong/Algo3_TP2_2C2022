package edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos;

import edu.fiuba.algo3.modelo.ConstruccionProtoss.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionZerg.Extractor;
import edu.fiuba.algo3.modelo.ConstruccionProtoss.NexoMineral;

public class Vacio implements Recurso {


    @Override
    public boolean esPosibleConstruir(Construccion unaConstruccion) {

        Asimilador asimilador = new Asimilador();
        Extractor extractor = new Extractor();
        NexoMineral nexo = new NexoMineral();
        boolean esAsimilador, esExtractor, esNexo;
        esAsimilador = unaConstruccion.getClass().equals(asimilador.getClass());
        esExtractor = unaConstruccion.getClass().equals(extractor.getClass());
        esNexo = unaConstruccion.getClass().equals(nexo.getClass());

        return (!esAsimilador || !esExtractor || !esNexo );//Devuelve True si la construccion NO es una Refineria.
    }
}
