package edu.fiuba.algo3.modelo.Recursos;

public class NodoMineral{

    private int cantidad = 2000;

    public int recolectar(int cant) {
        if (cantidad > 0){
            cantidad -= cant;
            return cant;
        }
        return 0;
    }
}
