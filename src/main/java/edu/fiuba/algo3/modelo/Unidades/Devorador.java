package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.AtaqueAire;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

public class Devorador extends UnidadZerg{

    public Devorador(){
        vida = new Vida(200);
        tiempoConstruccion = 4;
        rango = 5;
        costoMineral = 150;
        costoGas = 50;
        superficie = new Aire();
        atacador = new AtaqueAire(15);
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

    }

    @Override
    public void esPosibleMoverseEn(AreaEspacial areaEspacial) {

    }

    @Override
    public void modificarSuministro(Suministro suministro) {

    }
}
