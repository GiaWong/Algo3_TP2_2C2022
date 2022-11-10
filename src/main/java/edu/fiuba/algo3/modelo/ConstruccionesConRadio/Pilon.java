package edu.fiuba.algo3.modelo.ConstruccionesConRadio;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Pilon extends Construccion {

    private final int TIEMPO_CONSTRUCCION = 5;
    private final int RADIO_INICIAL = 3;

    private int filaCentro;
    private int colCentro;

    private int turnos;

    private int radio;

    public Pilon(int fila, int col, Mapa mapa) {
        super();
        this.radio = RADIO_INICIAL;
        this.turnos = 0;
        this.filaCentro = fila;
        this.colCentro = col;
        this.ocuparMapa(mapa);
    }

    public Pilon() {
        this.turnos = 0;
        this.radio = RADIO_INICIAL;
    }

    public void ocuparMapa(Mapa mapa){
        for(int i = filaCentro - radio ; i < filaCentro + radio ; i++){
            for(int j = colCentro - radio ; j < colCentro + radio ; j++){
                mapa.sumarEnergia(i,j);
            }
        }
    }


    public void avanzarTurno(int i) {

        this.turnos += i;
    }

    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }
}
