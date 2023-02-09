package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Larva;
import edu.fiuba.algo3.modelo.Mapa.Casilla;

public class ConEnergia implements Terreno{

    protected int pilonesEnergizando;

    public ConEnergia(){
        pilonesEnergizando = 1;
    }

    public void esPosibleConstruir(Construccion unaConstruccion) {
        unaConstruccion.esPosibleConstruirEn(this);
    }


    public void verificarSiPuedeSetear(Terreno unTerreno, Casilla casilla) {
        unTerreno.verificarEnergizacion(casilla,this);
    }

    public void verificarEnergizacion(Casilla casilla, ConEnergia energia){
        energia.energizar();
        energia.verificarSiPuedePisarConstruccion(casilla);
    }

    public void verificarSiPuedePisarConstruccion(Casilla casilla){
        casilla.asignarTerreno(this);
    }

    public void energizar(){
        pilonesEnergizando++; }

    public void desenergizar(){
        pilonesEnergizando--; }

    public boolean tienePilonesEnergizando() {
        return (pilonesEnergizando > 0);
    }
}
