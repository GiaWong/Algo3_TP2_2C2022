package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionProtoss;
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
        if (construccion != null){
            construccion.esPosibleAgregarUnidad(unaUnidad);
        }
        unidad = unaUnidad;
    }
    public void agregar(Construccion unaConstruccion, Mapa mapa){
        if (hayConstruccion()){
            throw new CasillaOcupada();
        }

        if (unidad != null){
            unidad.esPosibleConstruir(unaConstruccion);
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

    public void agregar(Construccion unaConstruccion){ //Con este metodo no verifica los prerequisitos
        if (hayConstruccion()){
            throw new CasillaOcupada();
        }
        recurso.esPosibleConstruir(unaConstruccion);
        terreno.esPosibleConstruir(unaConstruccion);
        construccion = unaConstruccion;
    }

    public void avanzarTurno(Mapa mapa){
        if (this.hayConstruccion()){
            construccion.avanzarTurno(mapa);

        }
        if (this.hayUnidad()) {
            unidad.construir();
        }
    }

    public boolean hayConstruccion() {
        return (construccion != null );
    }

    public boolean hayUnidad() {
        return (unidad != null);
    }

    public void destruirConstruccion(Mapa mapa) {
        if(construccion != null){
            construccion.destruir(mapa);
        }
        construccion = null;
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

    /*public void DestruirConstruccionMuerta(){
        try{
            construccion.estaVivo();}
        catch (Exception ConstruccionDestruida){
            construccion = null;
        }
    }

     */

    public void setArea(Area unArea){
        area = unArea;
    }

    public void setTerreno(Terreno unTerreno){// SinTerreno y ConEnergia pueden pisarse pero ninguno puede pisar a ConMoho. ConMoho puede pisar a los otros.
        if(terreno == null){ //Solo la primera vez entra aca (cuando se crea el mapa)
            asignarTerreno(unTerreno);
        } else {
            terreno.verificarSiPuedeSetear(unTerreno, this);
        }
    }

    public void asignarTerreno(Terreno unTerreno){
        terreno = unTerreno;
    }

    public void setRecurso(Recurso unRecurso){
        recurso = unRecurso;
    }

    public Coordenada coordenada(){
        return coordenada;
    }


    public boolean esPrerequisito(Construccion unaConstruccion) {
        if(construccion != null){
            return construccion.esPrerequisito(unaConstruccion);
        } else {
            return false;
        }
    }

    public boolean esPrerequisito(Unidad unidad) {
        if(construccion != null){
            return construccion.esPrerequisito(unidad);
        } else {
            return false;
        }
    }

    public void destruirUnidad() { unidad = null; }

    public boolean hayCriaderoConLarvas() {
        if(construccion != null){
            return construccion.hayLarvaParaEvolucionar();
        } else {
            return false;
        }
    }

    public void desenergizarConstruccion() {

        ConstruccionProtoss construccion1 = (ConstruccionProtoss) construccion;
        construccion1.desenergizarConstruccion();

    }

    public void detectarInvisible() {
        if(hayUnidad()){
            unidad.detectado();
        }
    }
}
