package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class Suministro {

    private int capacidadTotalSuministro;

    private int capacidadSuministro;

    public Suministro(int capacidad){
        capacidadTotalSuministro = capacidad;
        capacidadSuministro = 0;
    }

    public void agregar(Unidad unidad){
        if (capacidadSuministro == capacidadTotalSuministro){ // este if es para ver si se puede agregar una Unidad o no por la capacidad de Poblacion
            unidad.modificarSuministro(this);
        } else {
            //Lanzar error capaz o hacer nada
        }
    }

    public void agregar(Construccion construccion){
        if (capacidadSuministro == capacidadTotalSuministro){
            construccion.aumentarSuministro(this);
        } else {
            //Lanzar error capaz o hacer nada
        }
    }

    public void aumentarCapacidadTotal(int unaCantidad){
        capacidadTotalSuministro += unaCantidad;
    }

    public void aumentarCapacidad(int unaCantidad){
        capacidadSuministro += unaCantidad;
    }
}
