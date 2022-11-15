package edu.fiuba.algo3.modelo.Recursos;

public class NodoMineral implements Recurso{

    private int cantidad = 2000;
    @Override
    public void extraer(int cant) {
        cantidad -= cant;
    }
}
