package edu.fiuba.algo3.modelo.Unidades;

import java.util.List;

public class Mutalisco extends Unidad{

    // Deberia poder evolucionarse a Guardian.

    public Mutalisco(){
        vida = 120;
        tiempoConstruccion = 7;
        rango = 3;
        superficie = new Aire();
        costos.add(100); //Esto es para Minerales
        costos.add(100); // Esto es para Gas
        danio=9;
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

    public Unidad evolucionar() {
        return new Guardian();
    }
}
