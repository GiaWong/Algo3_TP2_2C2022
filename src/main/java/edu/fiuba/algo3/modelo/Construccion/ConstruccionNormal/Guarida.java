package edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal;

public class Guarida implements ConstruccionNormal{

    private int tiempoConstruccion = 12;
    private int vida =1250 ;


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
