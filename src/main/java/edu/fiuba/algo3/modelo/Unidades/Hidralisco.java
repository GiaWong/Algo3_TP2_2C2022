package edu.fiuba.algo3.modelo.Unidades;

public class Hidralisco extends Unidad{

    private Guardian guardian;

    public Hidralisco(){
        vida = 80;
        tiempoConstruccion = 4;
        rango = 4;
        superficie = new Tierra();
        guardian = new Guardian();
        costos.add(75); //Esto es para Minerales
        costos.add(25); // Esto es para Gas
    }
}
