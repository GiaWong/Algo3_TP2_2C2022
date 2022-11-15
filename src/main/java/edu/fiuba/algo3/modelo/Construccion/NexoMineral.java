package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;

public class NexoMineral implements RefineriaMineral {
    private int vida =250 ;
    private int escudo = 250;
    private int tiempoConstruccion = 4 ;
    //private int mineralExtraido;


    private final int MINERAL_POR_TURNO = 20;

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
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
