package edu.fiuba.algo3.modelo.Construccion;


import java.util.List;

public class Criadero implements ConstruccionNormal {

    private int larvas = 3;
    private int tiempoConstruccion = 4;

    private int tiempoAmpliacion = 2;
    private int vida = 500 ;
    private int radio = 5;
    public void evolucionar() {
        larvas--;
    }
    public void ampliarRadio() {
        if (tiempoAmpliacion == 0) {
            radio++;
            tiempoAmpliacion =2;
        }
    }
    public int obtenerRadio(){
        return radio;
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
        tiempoAmpliacion--;
        this.ampliarRadio();

    }
    @Override
    public boolean estaDisponible() {
        return tiempoConstruccion<=0;
    }

    @Override
    public List<Integer> costo() {
        return null;
    }
}
