package edu.fiuba.algo3.modelo.ConstruccionesConRadio;

import edu.fiuba.algo3.modelo.Turno.Turno;

public class Moho{

    private final int RADIO_INICIAL = 5;
    private int radio;
    public Moho() {
        super();
        this.radio = RADIO_INICIAL;
    }


    public int obtenerRadio() {
        return this.radio;
    }

    public void ampliarRadio(){
        this.radio += 1;
    }

    public void avanzarTurno(int i) {
    }
}
