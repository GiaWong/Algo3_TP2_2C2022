package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Danio;

public abstract class ConstruccionZerg  extends Construccion {

    public abstract void avanzarTurno();

    public void recibirDanio(Danio danio){
        defensa.recibirDanio(danio, vida);
    }

}
