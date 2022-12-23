package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

public class AmoSupremo extends UnidadZerg{

    // Necesitaria tener algo para poder detectar unidades

    public AmoSupremo(){
        vida = new Vida(200);;
        tiempoConstruccion = 5;
        rango = 4;
        costos.add(50); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
        superficie = new Aire();
    }

    public void atacar(Unidad unaUnidad){

    }

    public void atacar(Construccion unaConstruccion){

    }

    @Override
    public void modificarSuministro(Suministro suministro) {
        int aumentoDeSuministro = 5;
        suministro.aumentarCapacidad(aumentoDeSuministro);
    }

    public void esPosibleMoverseEn(AreaEspacial areaEspacial) {
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
        return false;
    }

    public boolean permiteCrear(Criadero criadero){
        return false;
    }
}
