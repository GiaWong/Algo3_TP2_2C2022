package edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Recursos.Recurso;

public class ConRecurso extends Casilla{

    private Recurso recurso;

    @Override
    public void agregarConstruccion(Construccion c) {
        //if ( verifica que es de tipo Refineria)
            construccion = c;
    }

    @Override
    public void setTerreno(Terreno t) {
        terreno = t;
    }
}
