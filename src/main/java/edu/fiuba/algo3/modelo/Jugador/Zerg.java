package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionZerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import edu.fiuba.algo3.modelo.Unidades.UnidadZerg;

public class Zerg extends Raza {


    public void agregar(ConstruccionZerg construccion, Coordenada coordenada, Mapa mapa) {
        mapa.agregar(construccion, coordenada);
    }

    public void agregar(UnidadZerg unidad, Coordenada coordenada, Mapa mapa) {
        mapa.agregar(unidad, coordenada);
    }


    @Override
    public void recolectar() {

    }


    public void evolucionar(Mutalisco mutalisco) {

    }

}
