package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Turno.Turno;

public abstract class Construccion {
    protected boolean ESTADO_CONSTRUCCION = false;
    protected int costeMineral;
    protected int costeGasVespeno;

    public boolean estaDisponible() {
        return this.ESTADO_CONSTRUCCION;
    }

    public abstract void empezarAConstruirSegun(Alcance alcance,Turno turno);

    public void avanzarTurno(int i) {
    }
    public boolean costeDeMateriales(int mineral,int gasVespeno){
        return ((mineral == costeMineral)&&(gasVespeno == costeGasVespeno));
    }
}
