package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Jugador.Suministro;

import java.util.List;

public abstract class UnidadProtoss extends Unidad{

    protected Escudo escudo;

    public void recibirDanio(Danio danio) {
        defensa.recibirDanio(danio, vida, escudo); //Esto despues analiza como le saca vida a que cosa, si le tiene que sacar al escudo o a la vida.
    }

    public int vida() {return vida.vidaActual();}

    public List<Integer> costo() {
        return costos;
    }

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    public abstract void modificarSuministro(Suministro suministro);
}
