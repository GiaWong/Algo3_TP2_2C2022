package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Unidades.Unidad;


public class Casilla {

    protected Unidad unidad;
    private Recurso recurso;
    protected Terreno terreno;
    protected Construccion construccion;

    public boolean hayConstruccion() {
        return (construccion != null);
    }

    public void agregarUnidad(Unidad unaUnidad){
        unidad = unaUnidad;
    }

    public void agregarConstruccion(Construccion unaConstruccion){
        if (terreno.esPosibleConstruir(unaConstruccion) && recurso.esPosibleConstruir(unaConstruccion)){
            construccion = unaConstruccion;
        } else {

        }
    }


    public void setTerreno(Terreno unTerreno){
        terreno = unTerreno;
    }

    public void setRecurso(Recurso unRecurso){
        recurso = unRecurso;
    }
}
