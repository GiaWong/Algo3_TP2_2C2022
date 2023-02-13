package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.AtaqueTierra;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupadaPorNexoMineral;
import edu.fiuba.algo3.modelo.Exception.EstaUnidadNoSeMuevePorAreaEspacial;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

public class Zerling extends UnidadZerg{


    //private Construccion preRequisito = new ReservaProduccion();
    public Zerling(){

        vida = new Vida(35);
        tiempoConstruccion = 2;
        rango = 1;
        costoMineral = 25;
        costoGas = 0;
        superficie = new Tierra();
        atacador = new AtaqueTierra(4);
        costoSuministro = 1;

    }

    public  void esPosibleConstruir(Construccion construccion){
        construccion.permiteConstruirConUnidad(this);
    }

    public void atacar(Unidad unaUnidad){
        if (!estaDisponible()){
            throw  new UnidadNoOperativa();
        }
        if (unaUnidad.esPosibleSerAtacadoPor(atacador)){
            atacador.atacar(unaUnidad);
        }
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
        return true;
    }

    public boolean permiteCrear(Guarida guarida){
        return false;
    }

    public boolean permiteCrear(Espiral espiral){
        return false;
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
        throw new EstaUnidadNoSeMuevePorAreaEspacial();
    }

    public int obtenerVida() {return vida.vidaActual(); }

    /*
    public boolean preRequisito(List<Construccion> lista) {
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getClass().equals(preRequisito.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }
    public int obtenerVida() {return vida.vidaActual(); }
     */

    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.disminuirCapacidad(costoSuministro);
    }
}

