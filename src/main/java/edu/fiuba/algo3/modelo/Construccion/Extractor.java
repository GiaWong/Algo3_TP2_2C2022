package edu.fiuba.algo3.modelo.Construccion;



public class Extractor implements Refineria{
    private int tiempoConstruccion = 6;
    private int vida =750 ;


    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    @Override
    public void quitarVida(int cant) {
        vida  -= 750;
    }

    @Override
    public void avanzarTurno() {

    }

    @Override
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }

    @Override
    public void recolectar() {

    }
}
