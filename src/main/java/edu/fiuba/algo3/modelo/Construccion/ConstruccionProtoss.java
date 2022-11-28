package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Acciones.Escudo;

public abstract class ConstruccionProtoss extends Construccion {

    protected Escudo escudo;

    public abstract void avanzarTurno();

    public void recibirDanio(Danio danio){
        defensa.recibirDanio(danio, vida, escudo);
    }

}
