package edu.fiuba.algo3.modelo.Recursos;

public class Volcan implements Recurso {

    private int cantidad = 5000;
    @Override
    public void extraer(int cant) {
        cantidad -= cant;
    }
}
