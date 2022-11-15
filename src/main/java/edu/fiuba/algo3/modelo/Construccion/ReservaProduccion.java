package edu.fiuba.algo3.modelo.Construccion;

public class ReservaProduccion implements ConstruccionNormal{

    private int tiempoConstruccion = 12;
    private int vida =1000 ;


    public void evolucionar() {
    }

    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    @Override
    public void quitarVida(int cant) {
        vida -= cant;
    }

    @Override
    public void avanzarTurno() {

    }

    @Override
    public boolean estaDisponible() { return (tiempoConstruccion<=0); }

}
