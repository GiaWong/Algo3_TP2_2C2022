package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Exception.HasLlegadAlLimiteDeUnidadesCreadas;
import edu.fiuba.algo3.modelo.Exception.NoTienesSuministroParaCrearMasConstrucciones;
import edu.fiuba.algo3.modelo.Exception.NoTienesSuministroParaCrearMasUnidades;
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

    public void agregar(Unidad unidad){

        if (unidad.sePuedeCrearConSuministro(capacidadSuministro)){
            unidad.modificarSuministro(this);
        } else {
            throw new NoTienesSuministroParaCrearMasUnidades();
        }
    }

    public void agregar(Construccion construccion) {
        if (capacidadSuministro < capacidadTotalSuministro){
            construccion.aumentarSuministro(this);
        }
    }

    public void aumentarCapacidadTotal(int unaCantidad){
        capacidadTotalSuministro += unaCantidad;
    }

    public void aumentarCapacidad(int unaCantidad){
        capacidadSuministro += unaCantidad;
    }

    public void disminuirCapacidad(int unaCantidad){
        capacidadSuministro -= unaCantidad;
    }

    public boolean haySuministro(){
        return capacidadSuministro > 0;
    }


}
