package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionZerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import edu.fiuba.algo3.modelo.Unidades.UnidadZerg;

public class Zerg extends Raza {


    public void agregar(ConstruccionZerg construccion, Coordenada coordenada, Mapa mapa) {
        if (banco.esPosibleComprar(construccion)){
            this.comprar(construccion);
            mapa.agregar(construccion, coordenada);
        }
    }

    public void agregar(UnidadZerg unidad, Coordenada coordenada, Mapa mapa) {
        if (banco.esPosibleComprar(unidad)){
            this.comprar(unidad);
            mapa.agregar(unidad, coordenada);
        }
    }

    public void crearUnidad(Coordenada coordenada, Mapa mapa){

    }



    @Override
    public void recolectar() {

    }

}
