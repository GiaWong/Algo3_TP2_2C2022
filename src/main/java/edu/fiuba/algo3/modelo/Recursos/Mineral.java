package edu.fiuba.algo3.modelo.Recursos;

public class Mineral extends Recursos{

    private int cantidad;
    public Mineral(int cant){
        super();
        cantidad = cant;
    }

    public int extraerMineral(){
        return cantidad;
    }
}
