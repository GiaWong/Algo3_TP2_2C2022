package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class Ataque implements Accion{

    private Unidad unidadAtacante;

    private Unidad unidadDefensiva;


    public Ataque(){

    }

    public Ataque(Coordenada coordenadaAtacante, Coordenada coordenadaDefensiva, Mapa unMapa){
        unidadAtacante = unMapa.devolverUnidad(coordenadaAtacante); //en que momento busco la unidad con la que quiero atacar????
        unidadDefensiva = unMapa.devolverUnidad(coordenadaDefensiva); //asi!
    }

    @Override
    public void ejecutar() {
        unidadAtacante.atacar(unidadDefensiva);
    }
}
