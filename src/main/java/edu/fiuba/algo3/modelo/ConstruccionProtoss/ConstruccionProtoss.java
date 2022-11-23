package edu.fiuba.algo3.modelo.ConstruccionProtoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.ArrayList;
import java.util.List;

public abstract class ConstruccionProtoss extends Construccion {
    protected int vida;
    protected int escudo,tiempoConstruccion;
    protected int Escudo_total;

    public abstract void construir();

    public int obtenerEscudo() {return escudo; }
    @Override
    public void recibeDanio(int cant) {

        escudo-= cant;

        if (escudo<0){
            vida += escudo;
            escudo = 0;
        }


    }

    public int obtenerVida() {return vida; }


    public void avanzarTurno() {
        this.regenerarEscudo();

    }
    public void regenerarEscudo(){
        if(escudo < (Escudo_total)){
            escudo += 10;
        }
    }

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }



}
