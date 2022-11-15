package edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;


public abstract class Casilla {

    protected Unidad unidad;
    protected Terreno terreno;
    protected Construccion construccion;

    public boolean hayConstruccion(){
        return (construccion!= null);
    }

    public abstract void agregarConstruccion(Construccion c);
    public abstract void setTerreno(Terreno t);
}
