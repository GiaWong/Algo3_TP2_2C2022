package edu.fiuba.algo3.modelo.Construccion;


import java.util.ArrayList;
import java.util.List;

public  class Acceso implements ConstruccionNormal {

    private int vida = 500;
    private int escudo = 500;
    private int tiempoConstruccion = 8 ;
    private List<Integer> costos = new ArrayList<>();

    public Acceso(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
    }
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
        return costos;
    }

    @Override
    public void evolucionar() {

    }
}
