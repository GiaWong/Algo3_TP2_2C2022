package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Danio;

import java.util.List;

public abstract class UnidadZerg extends Unidad{


    public int vida() {return vida.vidaActual();}

    public List<Integer> costo() {
        return costos;
    }

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    public abstract void modificarEstadisticas(int danio); //Este metodo estaba mal, no deberia existir

    public void recibirDanio(Danio danio){
        defensa.recibirDanio(danio, vida);
    }

}
