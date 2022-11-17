package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;

public class Zangano implements Unidad{
    private int cantidad;

    private int tiempoDeConstruccion = 1;
    public int getCantidad (){
        return this.cantidad;
    }

    public int extraerMineral() {
        return 10;
    }

    public int recolectar(NodoMineral nodo) {
        return nodo.recolectar(10);
    }

}
