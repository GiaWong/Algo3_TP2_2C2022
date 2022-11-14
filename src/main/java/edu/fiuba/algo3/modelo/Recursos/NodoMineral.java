package edu.fiuba.algo3.modelo.Recursos;

public class NodoMineral extends Recurso{

    @Override
    public void extraer(int cant) {
        cantidad -= cant;
    }
}
