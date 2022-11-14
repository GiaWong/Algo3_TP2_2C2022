package edu.fiuba.algo3.modelo.Construccion.RefineriaGas;


public class  Asimilador implements Refineria {
    private int vida = 450 ;
    private int tiempoConstruccion =6 ;


    @Override
    public void avanzarTurno() {
        tiempoConstruccion--;


    }

    @Override
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }
}
