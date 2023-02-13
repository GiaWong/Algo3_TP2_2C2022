package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

public class AmoSupremo extends UnidadZerg{

    // Necesitaria tener algo para poder detectar unidades

    public AmoSupremo(){
        vida = new Vida(200);;
        tiempoConstruccion = 5;
        rango = 4;
        costoMineral = 50;
        costoGas = 0;
        superficie = new Aire();
        costoSuministro = 0;
    }

    public void atacar(Unidad unaUnidad){

    }

    public void atacar(Construccion unaConstruccion){

    }

    public void detectado(){

    }

    public void detectarUnidadesInvisibles(Mapa mapa, Coordenada coord){
        mapa.detectarInvisibles(coord,4);
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
        return true;
    }
}
