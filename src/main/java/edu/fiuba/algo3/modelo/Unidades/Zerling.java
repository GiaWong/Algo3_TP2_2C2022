package edu.fiuba.algo3.modelo.Unidades;

public class Zerling extends Unidad{

    public Zerling(){
        vida = 35;
        tiempoConstruccion = 2;
        rango = 1;
        superficie = new Tierra();
        costos.add(25); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
    }
}
