package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaTerrestre;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Unidades.Unidad;


public class Casilla {

    public Coordenada coordenada;

    protected Unidad unidad;
    private Recurso recurso;
    private Area area;
    protected Terreno terreno;

    protected Construccion construccion;

    public Casilla(){
        area = new AreaTerrestre();
        recurso = new SinRecurso();
        terreno = new SinTerreno();
    }

    public Casilla(Coordenada coord){
        area = new AreaTerrestre();
        recurso = new SinRecurso();
        terreno = new SinTerreno();
        coordenada = coord;
    }

    public void agregar(Unidad unaUnidad){
        area.esPosibleAgregar(unaUnidad);
        unidad = unaUnidad;
    }

    public void agregar(Construccion unaConstruccion){
        recurso.esPosibleConstruir(unaConstruccion);
        terreno.esPosibleConstruir(unaConstruccion);
        construccion = unaConstruccion;

    }

    public boolean hayConstruccion() {
        return (construccion != null);
    }
    public boolean hayUnidad() {
        return (unidad != null);
    }


    public void destruirConstruccion() {
        construccion=null;
    }

    public boolean esConstruccion(Construccion construccionRadio) {
        if(this.hayConstruccion()){
            return construccionRadio.getClass().equals(construccion.getClass());
        }
        return false;
    }

    public void atacar(Unidad unidadAtacante) {
        if(this.hayConstruccion()){
            unidadAtacante.atacar(construccion);
        }else if(this.hayUnidad()){
            unidadAtacante.atacar(unidad);
        }
    }

    public boolean esUnidad(Unidad otraUnidad) {

        if(this.hayUnidad()){
            return unidad.getClass().equals(otraUnidad.getClass());
        }

        return false;
    }

    public int obtenerRadio() {
        return 0; //Como hago esto??

    }

    public void setArea(Area unArea){
        area = unArea;
    }

    public void setTerreno(Terreno unTerreno){
        terreno = unTerreno;
    }

    public void setRecurso(Recurso unRecurso){
        recurso = unRecurso;
    }

    public Coordenada coordenada(){
        return coordenada;
    }

    public boolean tipoTerreno(Terreno otroTerreno){
        return (terreno.getClass().equals(otroTerreno.getClass()));
    }

}
