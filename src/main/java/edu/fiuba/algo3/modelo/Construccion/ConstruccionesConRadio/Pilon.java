package edu.fiuba.algo3.modelo.Construccion.ConstruccionesConRadio;


public class Pilon implements ConstruccionConRadio {
    private int vida =300 ;
    private int tiempoConstruccion =5 ;

    @Override
    public void avanzarTurno() {
        tiempoConstruccion--;


    }

    @Override
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }

    @Override
    public void ampliarRadio() {

    }
}
