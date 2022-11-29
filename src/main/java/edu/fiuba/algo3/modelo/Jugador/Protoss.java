package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionProtoss;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Dragon;
import edu.fiuba.algo3.modelo.Unidades.Scout;
import edu.fiuba.algo3.modelo.Unidades.UnidadProtoss;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import javafx.scene.layout.CornerRadii;

public class Protoss extends Raza {

    public void agregar(ConstruccionProtoss construccion, Coordenada coordenada, Mapa mapa) {
        mapa.agregar(construccion, coordenada);

    }

    public void agregar(UnidadProtoss unidad, Coordenada coordenada, Mapa mapa) {
        mapa.agregar(unidad, coordenada);

    }

    @Override
    public void recolectar() {
    }

    public void crearUnidad(Zealot Zealot, Mapa mapa){
        //mapa.buscar
        //mapa.agregar(new Acceso());

    }
    public void crearUnidad(Scout Scout){

    }
    public void crearUnidad(Dragon Dragon){}


}
