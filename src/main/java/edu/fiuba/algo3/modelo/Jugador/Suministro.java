package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Exception.HasLlegadAlLimiteDeUnidadesCreadas;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class Suministro {

    private int capacidadTotalSuministro;

    private int capacidadSuministro;

    public Suministro(int capacidad){
        capacidadTotalSuministro = capacidad;
        capacidadSuministro = 0;
    }

    public int  capacidadActual(){
        return this.capacidadSuministro;
    }

    public int capacidadTotal() {
        return this.capacidadTotalSuministro;
    }

    public void agregar(Unidad unidad)throws HasLlegadAlLimiteDeUnidadesCreadas{

        if (capacidadSuministro < capacidadTotalSuministro){ // este if es para ver si se puede agregar una Unidad o no por la capacidad de Poblacion
            unidad.modificarSuministro(this);
        } else {
            throw new HasLlegadAlLimiteDeUnidadesCreadas();
        }
    }

    public void agregar(Construccion construccion)throws HasLlegadAlLimiteDeUnidadesCreadas {
        if (capacidadSuministro < capacidadTotalSuministro){
            construccion.aumentarSuministro(this);
        } else {
            throw new HasLlegadAlLimiteDeUnidadesCreadas();
        }
    }

    public void aumentarCapacidadTotal(int unaCantidad){
        capacidadTotalSuministro += unaCantidad;
        if (capacidadTotalSuministro>200){
            capacidadTotalSuministro =200;
        }
    }

    public void aumentarCapacidad(int unaCantidad){
        capacidadSuministro += unaCantidad;
        if (capacidadSuministro>200){
            capacidadSuministro = 200;
        }
    }

   /* public void disminuirCapacidad(int unaCantidad){
        capacidadSuministro -= unaCantidad;
    }*/


}
