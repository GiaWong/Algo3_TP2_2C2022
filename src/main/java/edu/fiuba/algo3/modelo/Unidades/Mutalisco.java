package edu.fiuba.algo3.modelo.Unidades;

public class Mutalisco extends Unidad{

    // Deberia poder evolucionarse a Guardian.

    public Mutalisco(){
        vida = 120;
        tiempoConstruccion = 7;
        rango = 3;
        superficie = new Aire();
        costos.add(100); //Esto es para Minerales
        costos.add(100); // Esto es para Gas
    }
}
