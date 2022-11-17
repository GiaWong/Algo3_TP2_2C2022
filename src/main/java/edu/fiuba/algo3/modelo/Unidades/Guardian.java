package edu.fiuba.algo3.modelo.Unidades;

import java.util.ArrayList;
import java.util.List;

public class Guardian extends Unidad{

    private int vida;
    private int tiempoConstruccion;
    private int rango;
    private Superficie superficie;
    private List<Integer> costos = new ArrayList<>();

    public Guardian(){
        vida = 100;
        tiempoConstruccion = 4;
        rango = 10;
        superficie = new Aire();
        costos.add(50);
        costos.add(100);
        danio=25;
    }

    @Override
    public void construir() {tiempoConstruccion--;

    }

    @Override
    public void recibirDanio(int danio) {

    }

    @Override
    public List<Integer> costo() {
        return costos;
    }

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }
}
