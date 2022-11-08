package edu.fiuba.algo3.modelo.ConstruccionesConRadio;

import edu.fiuba.algo3.modelo.Turno.Turno;

public abstract class Alcance {
    protected static boolean ESTA_EN_RANGO = false;
    protected boolean ESTADO_CONSTRUCCION = false;
    protected int radio;

    public abstract void empezarAConstruirSegun(Turno turno);
    public boolean estaEnRangoDelRadio(int tamanio) {
        if(tamanio <= this.radio){
            ESTA_EN_RANGO = true;
        }
        return  ESTA_EN_RANGO;
    }

    public boolean estaEnRango() {
        return ESTA_EN_RANGO;
    }
}
