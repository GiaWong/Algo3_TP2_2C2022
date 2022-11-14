package edu.fiuba.algo3.modelo.Construccion.RefineriaGas;



public class Extractor implements Refineria{
    private int tiempoConstruccion = 6;
    private int vida =750 ;




    @Override
    public void avanzarTurno() {
        tiempoConstruccion--;


    }

    @Override
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }
}
