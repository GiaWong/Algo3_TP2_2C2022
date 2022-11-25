package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Unidades.Mutalisco;

public class Zerg extends Raza {

    @Override
    public void recolectar() {

    }


    public void evolucionar(Mutalisco mutalisco) {

        int cantidad= unidades.size();
        this.comprar(mutalisco.evolucionar());
        if(cantidad== unidades.size()){
            unidades.remove(mutalisco);
        }


    }

}
