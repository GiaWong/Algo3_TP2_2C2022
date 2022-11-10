package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Recursos.Mineral;

public class NexoMineral extends Construccion {
    private  final int TIEMPO_CONSTRUCCION = 4;
    private int turnos;
    private int escudo = 250;

    public NexoMineral() {
        this.turnos = 0;
    }



    public void avanzarTurno(int i) {

        if(escudo<250){
            escudo=250;
        }
        this.turnos++;
    }


    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }

    public boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral) {
        return hayNodoMineral;
    }

    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return true;
    }

    public boolean estaOperativo() {
        return casilla.energizado();
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

    public void recolectar() {
    }

    public int obtenerMineralRecolectado() {
        return 0;
    }
}
