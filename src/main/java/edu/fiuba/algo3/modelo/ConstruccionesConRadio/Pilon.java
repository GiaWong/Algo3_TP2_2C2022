package edu.fiuba.algo3.modelo.ConstruccionesConRadio;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Pilon extends Construccion {

    private final int TIEMPO_CONSTRUCCION = 5;
    private final int RADIO_INICIAL = 3;

    private int turnos;
    private int radio;

    public Pilon(int fila, int columna, Mapa mapa) {
        super();
        this.radio = RADIO_INICIAL;
    }

    public Pilon() {
        this.turnos = 0;
        this.radio = RADIO_INICIAL;
    }


    public void avanzarTurno(int i) {
        this.turnos++;
    }

    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }
}
