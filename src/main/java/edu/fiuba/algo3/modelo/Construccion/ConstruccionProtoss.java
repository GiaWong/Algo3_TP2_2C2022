package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Exception.EstaConstruccionEsZerg;

public abstract class ConstruccionProtoss extends Construccion {

    protected Escudo escudo;

    public abstract void avanzarTurno();

    public void recibirDanio(Danio danio){
        defensa.recibirDanio(danio, vida, escudo);
    }

    public void protoss(){
        return;
    }
    public   void zerg() throws EstaConstruccionEsZerg {
        throw  new EstaConstruccionEsZerg();
    }
}
