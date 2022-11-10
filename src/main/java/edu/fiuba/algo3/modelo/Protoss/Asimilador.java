package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

public class Asimilador extends Construccion {

    private  final int TIEMPO_CONSTRUCCION = 6;

    private final int GAS_POR_TURNO = 20;
    private int turnos;

    private int gasRecolectado;

    @Override
    public void avanzarTurno(int i) {
        this.turnos += i;
        for(int j = 0; j < i; j++){
            this.recolectar();
        }
    }

    public void recolectar(){
        this.gasRecolectado += GAS_POR_TURNO;
    }

    @Override
    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }

    public int gasRecolectado() {
        return this.gasRecolectado;
    }

    public Asimilador(){
        this.turnos = 0;
        this.gasRecolectado = 0;
    }
}
