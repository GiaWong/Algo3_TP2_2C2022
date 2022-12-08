package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupada;
import edu.fiuba.algo3.modelo.Exception.NoCumplePrerequisito;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaTerrestre;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Unidades.Unidad;


public class Casilla {

    public Coordenada coordenada;

    protected Construccion construccion;

    protected Unidad unidad;
    private Recurso recurso;
    protected Terreno terreno;
    private Area area;

    public Casilla(Coordenada coord){
        area = new AreaTerrestre();
        recurso = new SinRecurso();
        terreno = new SinTerreno();
        coordenada = coord;
    }

    public void agregar(Unidad unaUnidad){
        if (hayUnidad()){
            throw new CasillaOcupada();
        }
        area.esPosibleAgregar(unaUnidad);
        unidad = unaUnidad;
    }
    public void agregar(Construccion unaConstruccion, Mapa mapa){
        if (hayConstruccion()){
            throw new CasillaOcupada();
        }
        recurso.esPosibleConstruir(unaConstruccion);
        terreno.esPosibleConstruir(unaConstruccion);
        try {
            unaConstruccion.verificarPrerequisito(mapa);
        } catch (NoCumplePrerequisito e) {
            System.out.println("No cumple con los prerequisitos.");
        }
        construccion = unaConstruccion;
    }
    /*
    public  void avanzarTurno(){ //Uso este avanzar turno en algun lado??
        construccion.estaDisponible();
    }

     */

    public void avanzarTurno(Mapa mapa){
        if (this.hayConstruccion()){
            construccion.avanzarTurno(mapa);

        } else if (this.hayUnidad()) {
            unidad.construir();
        }
    }

    public void agregar(Construccion unaConstruccion){
        if (hayConstruccion()){
            throw new CasillaOcupada();
        }
        recurso.esPosibleConstruir(unaConstruccion);
        terreno.esPosibleConstruir(unaConstruccion);
        construccion = unaConstruccion;
    }

    public boolean hayConstruccion() {
        DestruirConstruccionMuerta();
        return (construccion != null );
    }

    public boolean hayUnidad() {
        return (unidad != null);
    }
    public void construccionProtoss(){
        construccion.esProtoss();
    }

    public void construccionZerg(){
        construccion.esZerg();
    }

    public void destruirConstruccion() {
        construccion=null;
    }
    public boolean esConstruccion(Construccion construccionRadio) {
        if(this.hayConstruccion()){
            return construccionRadio.getClass().equals(construccion.getClass()); //Arreglar este getClass()
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

    public Unidad devolverUnidad(){
        return unidad;
    }

    public void DestruirConstruccionMuerta(){
        try{
            construccion.estaVivo();}
        catch (Exception ConstruccionDestruida){
            construccion = null;
        }
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

    public boolean esPrerequisito(Construccion construccion1) {
        if(construccion != null){
            return construccion.esPrerequisito(construccion1);
        } else {
            return false;
        }
    }

    public void destruirUnidad() { unidad = null;
    }
}
