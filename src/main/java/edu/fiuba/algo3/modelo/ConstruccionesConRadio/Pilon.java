package edu.fiuba.algo3.modelo.ConstruccionesConRadio;

import edu.fiuba.algo3.modelo.Turno.Turno;

public class Pilon extends Alcance {
    private int costeMineral = 100;
    public Pilon(int radio) {
        super();
        this.radio = radio;
    }

    public void empezarAConstruirSegun(Turno turno) {
        /*if(turno.getCantidad() == 5){
            this.ESTADO_CONSTRUCCION= true;
        }*/
    }


    public boolean estaDisponible() {
        return this.ESTADO_CONSTRUCCION;
    }

    public boolean costeDeMateriales(int mineral,int gasVespeno){
        return (mineral == costeMineral);
    }
    public void avanzarTurno(int i) {
        if(i == 5){
            this.ESTADO_CONSTRUCCION= true;
        }
    }
}
