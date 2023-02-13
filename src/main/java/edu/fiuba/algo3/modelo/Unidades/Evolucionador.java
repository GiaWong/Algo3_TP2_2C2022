package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public interface Evolucionador {

    void evolucionarGuardian(BancoDeRecursos banco, Mapa mapa);

    void evolucionarDevorador(BancoDeRecursos banco, Mapa mapa);
}
