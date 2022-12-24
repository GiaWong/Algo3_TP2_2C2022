package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Exception.EstaConstruccionEsZerg;

public abstract class ConstruccionProtoss extends Construccion {

    protected Escudo escudo;

    public void recibirDanio(Danio danio){
        defensa.recibirDanio(danio, vida, escudo);
    }

    public void regenerarEscudo() {
        escudo.regenerarEscudo(10);
    }

    public int obtenerEscudo(){
        return escudo.escudoActual();
    }

}
