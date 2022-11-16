package edu.fiuba.algo3.modelo.Construccion;

import java.util.ArrayList;
import java.util.List;

public class ReservaProduccion implements ConstruccionNormal{

    private int vida =1000;
    private int tiempoConstruccion = 12;
    private List<Integer> costos = new ArrayList<>();

    public ReservaProduccion(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
    }

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

    @Override
    public List<Integer> costo() {
        return costos;
    }

}
