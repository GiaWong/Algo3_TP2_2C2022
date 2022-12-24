package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;

public class ConEnergia implements Terreno{

    public void esPosibleConstruir(Construccion unaConstruccion) {
        unaConstruccion.esPosibleConstruirEn(this);
    }

    @Override
    public void verificarSiPuedeSetear(Terreno unTerreno, Casilla casilla) {
        if(unTerreno.esMoho()){
            casilla.asignarTerreno(unTerreno);
        }
    }
    @Override
    public boolean esMoho(){ return false; }
}
