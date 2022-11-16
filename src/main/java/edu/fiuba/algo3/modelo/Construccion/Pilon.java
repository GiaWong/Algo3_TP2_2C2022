package edu.fiuba.algo3.modelo.Construccion;


import java.util.ArrayList;
import java.util.List;

public class Pilon implements ConstruccionConRadio {

    private int vida = 300;
    private int escudo = 300;
    private int tiempoConstruccion = 5 ;
    private List<Integer> costos = new ArrayList<>();

    public Pilon(){
        costos.add(100); //esto es para Mineral
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
    public void ampliarRadio() {

    }
}
