package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Recursos.Mineral;

public class NexoMineral extends Construccion {
    private  final int TIEMPO_CONSTRUCCION = 4;
    private int turnos;

    public NexoMineral() {
        this.turnos = 0;
    }



    public void avanzarTurno(int i) {
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
        return true;
    }

    public void recibeDanio(int i) {
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
