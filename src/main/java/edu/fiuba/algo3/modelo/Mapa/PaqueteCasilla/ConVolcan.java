package edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla;


import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;

public class ConVolcan extends Casilla {

    private Volcan volcan;

    @Override
    public void agregarConstruccion(Construccion unaConstruccion) {
        //verifica que es de tipo Refineria (gas)
        Asimilador asimilador = new Asimilador();
        Extractor extractor = new Extractor();

        boolean esAsimilador, esExtractor;
        esAsimilador = (unaConstruccion.getClass().equals(asimilador.getClass()));
        esExtractor = (unaConstruccion.getClass().equals(extractor.getClass()));

        if(esAsimilador || esExtractor) {
            construccion = unaConstruccion;
        }
    }

    @Override
    public void setTerreno(Terreno unTerreno) {
        terreno = unTerreno;
    }
}
