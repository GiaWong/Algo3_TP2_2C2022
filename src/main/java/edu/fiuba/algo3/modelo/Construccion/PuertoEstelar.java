package edu.fiuba.algo3.modelo.Construccion;

public class PuertoEstelar implements ConstruccionNormal{
    private int vida = 600;
    private int escudo = 600;
    private int tiempoConstruccion = 10;

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
