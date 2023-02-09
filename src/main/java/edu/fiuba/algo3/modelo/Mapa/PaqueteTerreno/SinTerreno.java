package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;

public class SinTerreno implements Terreno{

    public void esPosibleConstruir(Construccion unaConstruccion) {
        unaConstruccion.esPosibleConstruirEn(this);
    }

    @Override
    public void verificarSiPuedeSetear(Terreno unTerreno, Casilla casilla) { //siempre se puede pisar SinTerreno
        unTerreno.verificarSiPuedePisarConstruccion(casilla);
    }

    public void verificarSiPuedePisarConstruccion(Casilla casilla){
        casilla.asignarTerreno(this);
    }

    public void verificarEnergizacion(Casilla casilla, ConEnergia energia){
        energia.desenergizar();
        if(!energia.tienePilonesEnergizando()){
            casilla.asignarTerreno(this);
            if(casilla.hayConstruccion()){
                casilla.desenergizarConstruccion();
            }
        }

    }
}
