package edu.fiuba.algo3.modelo.Construccion;


import java.util.List;

public class Pilon implements ConstruccionConRadio {
    private int vida = 300;
    private int escudo = 300;
    private int tiempoConstruccion = 5 ;

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
    public List<Integer> costo() {
        return null;
    }

    @Override
    public void ampliarRadio() {

    }
}
