package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class Ataque implements Accion{

    private Unidad unidadAtacante;
    private Coordenada coordenada;
    private Mapa mapa;

    public Ataque(Unidad unaUnidad, Coordenada unaCoordenada, Mapa unMapa){
        this.unidadAtacante = unaUnidad;
        this.coordenada = unaCoordenada;
        this.mapa = unMapa;
    }

    @Override
    public void ejecutar() {
        mapa.atacar(unidadAtacante, coordenada);
    }
}
