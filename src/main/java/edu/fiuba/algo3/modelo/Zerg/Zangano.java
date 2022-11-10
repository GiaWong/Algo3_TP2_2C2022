package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Recursos.NodoMineral;

public class Zangano {
    private int cantidad;
    public Zangano(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCantidad (){
        return this.cantidad;
    }

    public int extraerMineral() {
        return 10;
    }

    public void recolectar(NodoMineral nodo) {
    }

    public void avanzarTurno(int i) {
    }

    public int obtenerMineralRecolectado() {
    }
}
