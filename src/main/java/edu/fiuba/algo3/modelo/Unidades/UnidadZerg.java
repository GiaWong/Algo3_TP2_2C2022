package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionProtoss;

import java.util.ArrayList;
import java.util.List;

public abstract class UnidadZerg extends Unidad{


    public void recibirDanio(Danio danio){ // Si hago esto, no puedo resolver despues lo de Zealot cuando se vuelve invisible
        defensa.recibirDanio(danio);
    }
    public int rango() {
        return rango;
    }

    public int vida() {return vida.vidaActual();}

    public List<Integer> costo() {
        return costos;
    }

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    public abstract void modificarEstadisticas(int danio); //Este metodo estaba mal, no deberia existir

}
