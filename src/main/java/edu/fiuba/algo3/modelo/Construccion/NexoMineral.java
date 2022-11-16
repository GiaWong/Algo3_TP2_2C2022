package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;

import java.util.List;

public class NexoMineral implements RefineriaMineral {
    private int vida =250 ;
    private int escudo = 250;
    private int tiempoConstruccion = 4 ;

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    @Override
    public List<Integer> costo() {
        return null;
    }

    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    @Override
    public void quitarVida(int cant) {

    }

    @Override
    public void avanzarTurno() {

    }

    @Override
    public int recolectar(NodoMineral nodo) {
       if (this.estaDisponible()) {
            return nodo.recolectar(20);
        }
       return 0;
    }
}
