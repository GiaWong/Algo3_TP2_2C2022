package edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal;

public class Espiral implements ConstruccionNormal{
    private int tiempoConstruccion = 10;
    private int vida =1300 ;


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
