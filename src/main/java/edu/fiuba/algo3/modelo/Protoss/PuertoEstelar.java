package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

public class PuertoEstelar extends Construccion {
    private int escudo = 600;
    private final int TIEMPO_CONSTRUCCION = 10;

    private int turnos;

    public PuertoEstelar() {
        this.turnos = 0;
    }


    public void avanzarTurno(int i) {
        if(escudo<600){
            escudo=600;
        }
        this.turnos+=i;
    }


    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return (!hayMoho && energia != 0);
    }

    public boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral){
        return (!hayVolcan && !hayNodoMineral);
    }


    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }



    public boolean estaOperativo() {
        return casilla.energizado();
    }

    public void recibeDanio(int danio) {
        escudo -= danio;
        if(escudo < 0){
            vida += escudo;
            escudo = 0;
        }
    }

    public int obtenerEscudo() {
        return 0;
    }

    public int obtenerVida() {
        return 0;
    }
}
