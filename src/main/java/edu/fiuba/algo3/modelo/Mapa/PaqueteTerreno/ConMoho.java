package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;

public class ConMoho implements Terreno {

    public void esPosibleConstruir(Construccion unaConstruccion) {
        unaConstruccion.esPosibleConstruirEn(this);
    }

    @Override
    public void verificarSiPuedeSetear(Terreno unTerreno, Casilla casilla) {
        //No va a cambiar porque el moho no desaparece, queda por toda la partida.
    }
    @Override
    public boolean esMoho(){ return true; }


}
