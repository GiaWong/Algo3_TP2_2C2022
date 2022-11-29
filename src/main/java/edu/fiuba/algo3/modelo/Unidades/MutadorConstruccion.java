package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Mapa.Casilla;

public interface MutadorConstruccion {

    void mutarReservaProduccion(Casilla casilla);

    void mutarExtractor(Casilla casilla);

    void mutarGuarida(Casilla casilla);

    void mutarEspiral(Casilla casilla);
}
