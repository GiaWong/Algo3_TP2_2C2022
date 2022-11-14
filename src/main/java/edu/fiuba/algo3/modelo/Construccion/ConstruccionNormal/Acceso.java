package edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal;


public  class Acceso implements ConstruccionNormal {
    private int vida = 500;
    private int tiempoConstruccion =8 ;

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
