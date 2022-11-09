package edu.fiuba.algo3.modelo.ConstruccionesConRadio;

import edu.fiuba.algo3.modelo.Turno.Turno;

public class Moho extends Alcance{
    public Moho(int radio) {
        super();
        this.radio = radio;
    }
    public void ampliarRadio(){
        this.radio+=1;
    }

    @Override
    public void empezarAConstruirSegun(Turno turno) {
        /*no ddebe hacer nada*/
    }
}
