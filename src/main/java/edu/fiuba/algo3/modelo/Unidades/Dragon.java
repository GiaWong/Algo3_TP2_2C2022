package edu.fiuba.algo3.modelo.Unidades;

import java.util.List;

public class Dragon extends Unidad{

    private int escudo = 60;
    public Dragon(){
        vida = 100;
        tiempoConstruccion = 6;
        rango = 4;
        superficie = new Tierra();
        costos.add(125); //Esto es para Minerales
        costos.add(50); // Esto es para Gas
    }

    @Override
    public void construir() {

    }

    @Override
    public void recibirDanio(int danio) {

    }

    @Override
    public List<Integer> costo() {
        return costos;
    }
}
