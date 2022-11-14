package edu.fiuba.algo3.modelo.Recursos;

public class Volcan extends Recurso {

    @Override
    public void extraer(int cant) {
        cantidad -= cant;
    }
}
