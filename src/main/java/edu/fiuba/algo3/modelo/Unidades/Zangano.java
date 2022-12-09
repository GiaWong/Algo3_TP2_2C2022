package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupadaPorZangano;
import edu.fiuba.algo3.modelo.Exception.EstaUnidadNoSeMuevePorAreaEspacial;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;

public class Zangano extends UnidadZerg implements MutadorConstruccion {

    public Zangano(){
        vida = new Vida(25);
        tiempoConstruccion = 1;
        rango = 0;
        costos.add(25); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
        superficie = new Tierra();
        defensa = new Detectable();
    }

    public void atacar(Unidad unaUnidad){
    }

    public void esPosibleConstruir(Construccion construccion){
        construccion.permiteConstruirConUnidad(this);
    }

    public void atacar(Construccion unaConstruccion){
    }

    public int recolectar(NodoMineral nodo) {
        return nodo.recolectar(10);
    }

    @Override
    public void esPosibleMoverseEn(AreaEspacial areaEspacial) {
        throw new EstaUnidadNoSeMuevePorAreaEspacial();
    }

    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.aumentarCapacidad(1);
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
