package edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal;

public class PuertoEstelar implements ConstruccionNormal{
    private int vida =600 ;
    private int tiempoConstruccion = 10;
    @Override
    public void avanzarTurno() {
        tiempoConstruccion--;

    }

    @Override
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    @Override
    public void evolucionar() {

    }
}
