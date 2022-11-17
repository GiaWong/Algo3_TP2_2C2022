package edu.fiuba.algo3.modelo.Unidades;

public class Scout extends Unidad{

    private int escudo = 100;

    public Scout(){
        vida = 150;
        tiempoConstruccion = 9;
        rango = 4;
        superficie = new Aire();
        costos.add(300); //Esto es para Minerales
        costos.add(150); // Esto es para Gas
    }

    @Override
    public void construir() {

    }

    @Override
    public void recibirDanio(int danio) {

    }
}
