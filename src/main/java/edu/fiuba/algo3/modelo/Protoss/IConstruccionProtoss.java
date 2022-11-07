package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Turno.Turno;

public interface IConstruccionProtoss {
    void conTurno(Turno turno);

    boolean estaDisponible();
}
