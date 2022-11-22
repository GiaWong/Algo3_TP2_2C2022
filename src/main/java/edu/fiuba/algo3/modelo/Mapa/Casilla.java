package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionConRadio;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupada;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupadaPorZangano;

import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Vacio;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinNada;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Unidades.Superficie;
import edu.fiuba.algo3.modelo.Unidades.Tierra;
import edu.fiuba.algo3.modelo.Unidades.Unidad;


public class Casilla {

    private int fila;
    private int columna;

    protected Unidad unidad;
    private Recurso recurso;
    private Superficie superficie;
    protected Terreno terreno;
    protected Construccion construccion;

    public Casilla(){
        superficie = new Tierra();
        recurso = new Vacio();
        terreno = new SinNada();
    }

    public Casilla(int f, int c){
        superficie = new Tierra();
        recurso = new Vacio();
        terreno = new SinNada();
        fila = f;
        columna = c;
    }

    public boolean hayConstruccion() {
        return (construccion != null);
    }

    public void asignarSuperficie(Superficie superficie1){
        superficie =superficie1;
    }
    public boolean hayUnidad() {
        return (unidad != null);
    }

    public boolean tipoTerreno(Terreno otroTerreno){
        return (terreno.getClass().equals(otroTerreno.getClass()));
    }

    public void agregar(Unidad unaUnidad){
        if(superficie.esPosibleAgregar(unaUnidad)){
            unidad = unaUnidad;
        }
    }

    public void agregar(Construccion unaConstruccion) throws CasillaOcupada, CasillaOcupadaPorZangano {
        boolean hayConst = this.hayConstruccion();
        if(hayConst){
            throw new CasillaOcupada();
        }else if(unidad!=null){
            throw new CasillaOcupadaPorZangano();
        }
        if (terreno.esPosibleConstruir(unaConstruccion) && recurso.esPosibleConstruir(unaConstruccion)){

            construccion = unaConstruccion;
        }
    }


    public void setTerreno(Terreno unTerreno){
        terreno = unTerreno;
    }

    public void setRecurso(Recurso unRecurso){
        recurso = unRecurso;
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

    public int obtenerRadio() {

       ConstruccionConRadio construccionConRadio = (ConstruccionConRadio) construccion;
        return (construccionConRadio.obtenerRadio()) ;
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

}
