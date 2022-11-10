package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;


public class Extractor extends Construccion{

    private final int TIEMPO_CONSTRUCCION = 6;
    private int turnos;


    @Override
    public void avanzarTurno(int i) {
        this.turnos++;
    }

    @Override
    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }


    public void recibeDanio(int i) {
    }

    public int obtenerVida() {
        return 0;
    }

    public void cargarZerg(Zangano zangano1) {
    }

    public void recolectar() {
    }

    public int gasRecolectado() {
        return 0;
    }
}
