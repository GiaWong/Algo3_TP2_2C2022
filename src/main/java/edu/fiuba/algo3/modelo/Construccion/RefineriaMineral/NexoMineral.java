package edu.fiuba.algo3.modelo.Construccion.RefineriaMineral;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.RefineriaGas.Refineria;

public class NexoMineral implements Refineria {
    private  final int TIEMPO_CONSTRUCCION = 4;
    private int mineralExtraido;
    private int turnos;

    private final int MINERAL_POR_TURNO = 20;
    private int escudo = 250;

    public NexoMineral() {
        this.turnos = 0;
        this.mineralExtraido =0;

    }



    public void avanzarTurno(int j) {

        if(escudo<250){
            escudo=250;
        }
        this.turnos += j;
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




    public int obtenerEscudo() {
        return 0;
    }

    public int obtenerVida() {
        return 0;
    }



    public int obtenerMineralRecolectado() {
        return 0;
    }

    @Override
    public void avanzarTurno() {

    }
}
