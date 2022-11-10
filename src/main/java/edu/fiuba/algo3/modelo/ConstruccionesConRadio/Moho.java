package edu.fiuba.algo3.modelo.ConstruccionesConRadio;

import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class Moho{

    private final int RADIO_INICIAL = 5;
    private int radio;

    private int filaCentro;
    private int colCentro;

    private int turnos;

    private Mapa mapa;

    public Moho() {
        super();
        this.radio = RADIO_INICIAL;
    }

    public Moho(int fila, int col, Mapa mapa) {
        super();
        this.radio = RADIO_INICIAL;
        this.turnos = 0;
        this.filaCentro = fila;
        this.colCentro = col;
        this.mapa = mapa;
        this.ocuparMapa();
    }

    public void ocuparMapa(){
        for(int i = filaCentro - radio ; i < filaCentro + radio ; i++){
            for(int j = colCentro - radio ; j < colCentro + radio ; j++){
                this.mapa.fijarMoho(i,j);
            }
        }
    }

    public int obtenerRadio() {
        return this.radio;
    }

    public void ampliarRadio(int i){
        this.radio += (i);
    }

    public void avanzarTurno(int i) {
        this.turnos += i;
        this.ampliarRadio(i/2);
        ocuparMapa();
    }
}
