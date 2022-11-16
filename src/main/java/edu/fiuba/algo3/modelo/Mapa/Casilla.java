package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Unidades.Unidad;


public class Casilla {

    protected Unidad unidad;
    private Recurso recurso;
    private boolean indicadorHayConstruccion = false;
    protected Terreno terreno;
    protected Construccion construccion;

    public boolean hayConstruccion() {
        return (indicadorHayConstruccion);
    }

    public void agregarUnidad(Unidad unaUnidad){
        unidad = unaUnidad;
    }

    public void agregarConstruccion(Construccion unaConstruccion){
        if (terreno.esPosibleConstruir(unaConstruccion) && recurso.esPosibleConstruir(unaConstruccion)){
            indicadorHayConstruccion = true;
            construccion = unaConstruccion;
        }
    }


    public void setTerreno(Terreno unTerreno){
        terreno = unTerreno;
    }

    public void setRecurso(Recurso unRecurso){
        recurso = unRecurso;
    }
}
