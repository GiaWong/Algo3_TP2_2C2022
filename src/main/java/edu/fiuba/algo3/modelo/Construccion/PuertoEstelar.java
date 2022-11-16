package edu.fiuba.algo3.modelo.Construccion;

import java.util.ArrayList;
import java.util.List;

public class PuertoEstelar implements ConstruccionNormal{

    private int vida = 600;
    private int escudo = 600;
    private int tiempoConstruccion = 10;
    private List<Integer> costos = new ArrayList<>();

    public PuertoEstelar(){
        costos.add(150); //esto es para Mineral
        costos.add(150); //esto es para Gas
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
