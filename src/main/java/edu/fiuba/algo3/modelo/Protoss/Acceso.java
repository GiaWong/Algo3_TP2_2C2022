package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

public  class Acceso extends Construccion {
    private int escudo = 500;
    private final int TIEMPO_CONSTRUCCION = 8;

    private int turnos;

    public Acceso() {
        this.turnos = 0;
    }


    @Override
    public void avanzarTurno(int i) {
        if(escudo<500){
            escudo=500;
        }
        this.turnos+=i;
    }

    @Override
    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }


    public boolean estaOperativo() {
        return casilla.energizado();
    }
    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return (!hayMoho && energia != 0);
    }

    public boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral){
        return (!hayVolcan && !hayNodoMineral);
    }

    public void recibeDanio(int danio) {
        escudo-=danio;
        if(escudo<0){
            vida +=escudo;
            escudo=0;
        }
    }

    public int obtenerEscudo() {
        return 0;
    }

    public int obtenerVida() {
        return 0;
    }
}
