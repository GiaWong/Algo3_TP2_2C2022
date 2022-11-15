package edu.fiuba.algo3.modelo.Construccion;


public  class Acceso implements ConstruccionNormal {
    private int vida = 500;
    private int escudo = 500;
    private int tiempoConstruccion = 8 ;

    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    @Override
    public void quitarVida(int cant) {

    }

    @Override
    public void avanzarTurno() {

    }

    @Override
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }

    @Override
    public void evolucionar() {

    }
}
