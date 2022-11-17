package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionConRadio;
import edu.fiuba.algo3.modelo.Construccion.Criadero;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupada;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupadaPorZangano;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Vacio;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinNada;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Unidades.Unidad;


public class Casilla {

    protected Unidad unidad;
    private Recurso recurso;
    protected Terreno terreno;
    protected Construccion construccion;

    public Casilla(){

        recurso = new Vacio();
        terreno = new SinNada();
    }

    public boolean hayConstruccion() {
        return (construccion != null);
    }

    public boolean tipoTerreno(Terreno otroTerreno){
        return (terreno.getClass().equals(otroTerreno.getClass()));
    }

    public void agregarUnidad(Unidad unaUnidad){
        unidad = unaUnidad;
    }

    public void agregarConstruccion(Construccion unaConstruccion) throws CasillaOcupada, CasillaOcupadaPorZangano {
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

        //System.out.println(construccionRadio.getClass());
        if(this.hayConstruccion()){
            //System.out.println("entrooo");
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
        }
       // unidadAtacante.atacar(unidad);
    }

}
