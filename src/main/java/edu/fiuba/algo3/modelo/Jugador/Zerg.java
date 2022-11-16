package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionZerg;

import java.util.List;

public class Zerg extends Raza {

    private List<ConstruccionZerg> construcciones;

    @Override
    public void agregarConstruccion(Construccion construccion) {
        if(construccion.obtenerCostoMateriales(bancoMinerales,bancoGasvespeno));

    }

    @Override
    public void recolectar() {

    }

    @Override
    public void evolucionar() {

    }
}
