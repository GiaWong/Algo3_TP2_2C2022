package edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;

public class Vacia extends Casilla{

    @Override
    public void agregarConstruccion(Construccion c) {
        //if ( verificar que es de tipo Cualquier Construccion exceptuando las Refinerias)
            construccion = c;
    }

    @Override
    public void setTerreno(Terreno t) {
        terreno = t;
    }
}
