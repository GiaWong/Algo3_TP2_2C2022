package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Jugador.Suministro;

import java.util.List;

public abstract class UnidadProtoss extends Unidad{

    protected Escudo escudo;

    public void recibirDanio(Danio danio) {
        defensa.recibirDanio(danio, vida, escudo);
    }

    public int escudo(){ return escudo.escudoActual();}
    public abstract void modificarSuministro(Suministro suministro);
}
