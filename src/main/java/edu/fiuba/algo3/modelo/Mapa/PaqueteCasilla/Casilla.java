package edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;

public abstract class Casilla {

    protected Terreno terreno;
    protected Construccion construccion;

    public boolean hayConstruccion(){
        return (construccion!= null);
    }

    public abstract void agregarConstruccion(Construccion c);
    public abstract void setTerreno(Terreno t);
}
