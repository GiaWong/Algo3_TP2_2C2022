package edu.fiuba.algo3.modelo.Construccion;


public class  Asimilador implements Refineria {

    private int vida = 450;
    private int escudo = 450;
    private int tiempoConstruccion =6 ;


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
    public void recolectar() {

    }
}
