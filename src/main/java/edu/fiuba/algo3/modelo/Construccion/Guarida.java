package edu.fiuba.algo3.modelo.Construccion;

import java.util.ArrayList;
import java.util.List;

public class Guarida implements ConstruccionNormal{

    private int vida = 1250;
    private int tiempoConstruccion = 12;

    private List<Integer> costos = new ArrayList<>();

    public Guarida(){
        costos.add(200); //esto es para Mineral
        costos.add(100); //esto es para Gas
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
