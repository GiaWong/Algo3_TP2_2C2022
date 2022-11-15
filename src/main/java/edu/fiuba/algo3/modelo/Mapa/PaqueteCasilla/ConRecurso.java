package edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Recursos.Recurso;

public class ConRecurso extends Casilla{

    private Recurso recurso;

    public void setRecurso(Recurso unRecurso){
        recurso = unRecurso;
    }

    @Override
    public void agregarConstruccion(Construccion c) {
        //if ( verifica que es de tipo Refineria)
        Asimilador asimilador = new Asimilador();
        Extractor extractor = new Extractor();
        //NexoMineral nexo = new NexoMineral();
        boolean a,e,n;
        a=(c.getClass().equals(asimilador.getClass()));
        e=(c.getClass().equals(extractor.getClass()));
        if(a || e ) {
            construccion = c;
        }
    }

    @Override
    public void setTerreno(Terreno t) {
        terreno = t;
    }
}
