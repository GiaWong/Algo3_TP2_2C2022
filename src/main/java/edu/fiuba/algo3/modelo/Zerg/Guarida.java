package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Guarida extends Construccion {

    private final int TIEMPO_CONSTRUCCION = 12;

    private int turnos;

    public Guarida() {
        super();
        vida = 1250;

    }

    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return (hayMoho);
    }

    public boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral){
        return (!hayVolcan && !hayNodoMineral);
    }


    public void avanzarTurno(int i) {
        if(vida<=1250){
            vida = 1250;
        }

        this.turnos += i;
    }


    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }



    public void recibeDanio(int danio) {
        vida-= danio;
    }


}
