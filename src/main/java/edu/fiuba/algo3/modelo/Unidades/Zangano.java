package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;

public class Zangano extends Unidad{

    public Zangano(){
        vida = 25;
        tiempoConstruccion = 1;
        superficie = new Tierra();
        costos.add(25); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
    }

    public int extraerMineral() {
        return 10;
    }

    public int recolectar(NodoMineral nodo) {
        return nodo.recolectar(10);
    }

    @Override
    public void construir() {

    }

    @Override
    public void recibirDanio(int danio) {

    }
}
