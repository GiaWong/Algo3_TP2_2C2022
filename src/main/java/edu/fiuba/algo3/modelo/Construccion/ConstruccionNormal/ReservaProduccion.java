package edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal.ConstruccionNormal;

public class ReservaProduccion implements ConstruccionNormal{

    private int tiempoConstruccion = 12;
    private int vida =1000 ;


    public void evolucionar() {
    }

    @Override
    public void avanzarTurno() {
        tiempoConstruccion--;


    }

    @Override
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }
}
