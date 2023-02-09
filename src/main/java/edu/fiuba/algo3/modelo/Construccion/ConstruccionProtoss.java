package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Exception.EstaConstruccionEsZerg;

public abstract class ConstruccionProtoss extends Construccion {

    protected Escudo escudo;
    protected boolean energizada;

    public void recibirDanio(Danio danio){
        defensa.recibirDanio(danio, vida, escudo);
    }

    public void regenerarEscudo() {
        escudo.regenerarEscudo(10);
    }

    public int obtenerEscudo(){
        return escudo.escudoActual();
    }

    public void desenergizarConstruccion(){
        energizada = false;
    }

    public boolean estaEnergizado(){
        return energizada;
    }

}
