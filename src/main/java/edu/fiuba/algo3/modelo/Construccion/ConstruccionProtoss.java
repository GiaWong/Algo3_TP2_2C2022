package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Exception.EstaConstruccionEsZerg;

public abstract class ConstruccionProtoss extends Construccion {

    protected Escudo escudo;

    public void recibirDanio(Danio danio){
        defensa.recibirDanio(danio, vida, escudo);
    }

    public void esProtoss(){

    }
    public   void esZerg() throws EstaConstruccionEsZerg {
        throw  new EstaConstruccionEsZerg();
    }
}
