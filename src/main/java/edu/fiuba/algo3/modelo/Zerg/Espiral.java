package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Espiral extends Construccion {

    private final int TIEMPO_CONSTRUCCION = 10;

    private int turnos;


    public Espiral() {
        vida = 1000;
        this.turnos = 0;
    }


    public void avanzarTurno(int i) {
        if(vida<=1000){
            vida = 1000;
        }

        this.turnos+=i;
    }


    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return (hayMoho);
    }

    public boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral){
        return (!hayVolcan && !hayNodoMineral);
    }


    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }



    public void recibeDanio(int danio) {
        vida-= danio;
    }


}
