package edu.fiuba.algo3.modelo.Construccion;


public class Criadero implements ConstruccionNormal {

    private int larvas = 3;
    private int tiempoConstruccion = 4;
    private int vida = 500 ;
    private int radio = 5;
    public void evolucionar() {
        larvas--;
    }
    public void ampliarRadio(){
        radio++;
    }

    public int obtenerCantidadLarvas(){
        return larvas;
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
    public void avanzarTurno(){
        if(larvas<3){
            larvas++;
        }
    }
    @Override
    public boolean estaDisponible() {
        return tiempoConstruccion<=0;
    }
}
