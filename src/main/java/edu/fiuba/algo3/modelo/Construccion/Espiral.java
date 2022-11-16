package edu.fiuba.algo3.modelo.Construccion;

import java.util.List;

public class Espiral implements ConstruccionNormal{
    private int tiempoConstruccion = 10;
    private int vida = 1300 ;


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
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    @Override
    public List<Integer> costo() {
        return null;
    }

    @Override
    public void evolucionar() {

    }
}
