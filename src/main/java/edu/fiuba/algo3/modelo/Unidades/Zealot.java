package edu.fiuba.algo3.modelo.Unidades;

public class Zealot extends Unidad{

    private int escudo = 60;
    public Zealot(){
        vida = 100;
        tiempoConstruccion = 4;
        rango = 1;
        superficie = new Tierra();
        costos.add(100); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
    }
}
