package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionProtoss;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.UnidadProtoss;

public class Protoss extends Raza {

    public void agregar(ConstruccionProtoss construccion, Coordenada coordenada, Mapa mapa) {
        Casilla casilla = mapa.buscar(coordenada);
        casilla.agregar(construccion);
    }

    public void agregar(UnidadProtoss unidad, Coordenada coordenada, Mapa mapa) {
        Casilla casilla = mapa.buscar(coordenada);
        casilla.agregar(unidad);
    }

    @Override
    public void recolectar() {

    }


}
