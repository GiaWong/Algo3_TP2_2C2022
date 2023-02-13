package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public abstract class UnidadZerg extends Unidad{


    public void recibirDanio(Danio danio){
        defensa.recibirDanio(danio, vida);
    }

    public abstract void modificarSuministro(Suministro suministro);


    public abstract void detectarUnidadesInvisibles(Mapa mapa, Coordenada coord);
}
