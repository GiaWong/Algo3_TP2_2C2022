package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;

public interface Evolucionador {

    Unidad evolucionarGuardian(BancoDeRecursos banco);

    Unidad evolucionarDevorador(BancoDeRecursos banco);
}
