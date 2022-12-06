package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class Ataque implements Accion{

    private final Unidad unidad;
    private final Coordenada coordenada;
    private final Mapa mapa;

    public Ataque(Unidad unaUnidad, Coordenada unaCoordenada, Mapa unMapa){
        unidad = unaUnidad; //en que momento busco la unidad con la que quiero atacar????
        coordenada = unaCoordenada;
        mapa = unMapa;
    }

    @Override
    public void ejecutar() {
        mapa.atacar(unidad, coordenada);
    }
}
