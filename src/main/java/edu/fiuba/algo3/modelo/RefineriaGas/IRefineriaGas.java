package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Turno.Turno;

public interface IRefineriaGas {
    void conTurno(Turno turno);

    boolean estaDisponible();
}
