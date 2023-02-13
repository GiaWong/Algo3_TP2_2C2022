package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.AtaqueTierra;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

public class Guardian extends UnidadZerg{

    public Guardian(){
        vida = new Vida(100);
        tiempoConstruccion = 4;
        rango = 10;
        costoMineral = 50;
        costoGas = 100;
        superficie = new Aire();
        atacador = new AtaqueTierra(25);
        costoSuministro = 4;

    }

    public void atacar(Unidad unaUnidad){
        if (!estaDisponible()){
            throw  new UnidadNoOperativa();
        }
        if (unaUnidad.esPosibleSerAtacadoPor(atacador)){
            atacador.atacar(unaUnidad);
        }
    }

    public void esPosibleConstruir(Construccion construccion){
        construccion.permiteConstruirConUnidad(this);

    }

    public void detectarUnidadesInvisibles(Mapa mapa, Coordenada coord){

    }

    public void detectado(){

    }

    public void permiteAgregarConstruccion(NexoMineral nexoMineral){

    }

    public boolean permiteCrear(Acceso acceso){
        return false;
    }

    public boolean permiteCrear(PuertoEstelar puertoEstelar){
        return false;
    }

    public boolean permiteCrear(ReservaProduccion reservaProduccion){
        return false;
    }

    public boolean permiteCrear(Guarida guarida){
        return false;
    }

    public boolean permiteCrear(Espiral espiral){
        return true;
    }

    public boolean permiteCrear(Criadero criadero){
        return false;
    }

    public void atacar(Construccion unaConstruccion){

        if (!estaDisponible()){
            throw  new UnidadNoOperativa();
        }
        atacador.atacar(unaConstruccion);
    }

    @Override
    public void esPosibleMoverseEn(AreaEspacial areaEspacial) {

    }


    public int obtenerVida() {return vida.vidaActual(); }
    @Override
    public void modificarSuministro(Suministro suministro) {

    }
}
