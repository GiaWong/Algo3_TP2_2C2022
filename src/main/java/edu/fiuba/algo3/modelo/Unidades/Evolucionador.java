package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public interface Evolucionador {

    Guardian evolucionarGuardian(BancoDeRecursos banco, Mapa mapa);

    Devorador evolucionarDevorador(BancoDeRecursos banco, Mapa mapa);
}
