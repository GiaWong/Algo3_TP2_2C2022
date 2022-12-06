package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Exception.EstaConstruccionEsProtoss;

public abstract class ConstruccionZerg  extends Construccion {

    public abstract void avanzarTurno();

    public void recibirDanio(Danio danio){
        defensa.recibirDanio(danio, vida);
    }


    public   void protoss()throws EstaConstruccionEsProtoss {
        throw new EstaConstruccionEsProtoss();
    }
    public   void zerg(){
        return;
    }
}
