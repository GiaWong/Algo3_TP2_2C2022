package edu.fiuba.algo3.modelo.Construccion.ConstruccionesConRadio;


import edu.fiuba.algo3.modelo.Construccion.ConstruccionNormal.ConstruccionNormal;

public class Criadero implements ConstruccionNormal {

    private int larvas = 3;
    private int tiempoConstruccion = 4;
    private int vida =500 ;
    public void evolucionar() {
        larvas--;
    }
    public void ampliarRadio(){

    }
    public void avanzarTurno(){
        if(larvas<3){larvas++;}

    }

    public int obtenerCantidadLarvas(){
        return larvas;
    }

}
