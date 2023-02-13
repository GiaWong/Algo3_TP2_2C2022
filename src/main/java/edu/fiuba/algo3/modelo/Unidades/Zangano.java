package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupadaPorNexoMineral;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupadaPorZangano;
import edu.fiuba.algo3.modelo.Exception.EstaUnidadNoSeMuevePorAreaEspacial;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;

public class Zangano extends UnidadZerg implements MutadorConstruccion {

    public Zangano(){
        vida = new Vida(25);
        tiempoConstruccion = 1;
        rango = 0;
        costoMineral = 25;
        costoGas = 0;
        superficie = new Tierra();
        defensa = new Detectable();
        costoSuministro = 1;
    }

    public void atacar(Unidad unaUnidad){
    }

    public void esPosibleConstruir(Construccion construccion){
        construccion.permiteConstruirConUnidad(this);
    }

    public void atacar(Construccion unaConstruccion){
    }

    public void permiteAgregarConstruccion(NexoMineral nexoMineral){
        throw new CasillaOcupadaPorNexoMineral();
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

    public int recolectar(NodoMineral nodo) {

        if(!estaDisponible()){
            throw new UnidadNoOperativa();
        }
        return nodo.recolectar(10);
    }

    @Override
    public void esPosibleMoverseEn(AreaEspacial areaEspacial) {
        throw new EstaUnidadNoSeMuevePorAreaEspacial();
    }

    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.disminuirCapacidad(costoSuministro);
    }

    @Override
    public void mutarReservaProduccion(Casilla casilla) {
        casilla.agregar(new ReservaProduccion());
    }

    @Override
    public void mutarExtractor(Casilla casilla) {
        casilla.agregar(new Extractor());
    }

    @Override
    public void mutarGuarida(Casilla casilla) {
        casilla.agregar(new Guarida());
    }

    @Override
    public void mutarEspiral(Casilla casilla) {
        casilla.agregar(new Espiral());
    }
}
