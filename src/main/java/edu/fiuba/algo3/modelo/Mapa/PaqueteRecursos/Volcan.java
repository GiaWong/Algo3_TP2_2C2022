package edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos;

import edu.fiuba.algo3.modelo.Construccion.*;

public class Volcan implements Recurso{

    private int cantidad = 5000;

    public int recolectar(int cant) {
        if (cantidad > 0){
            cantidad -= cant;
            return cant;
        }
        return 0;
    }

    @Override
    public void esPosibleConstruir(ConstruccionProtoss unaConstruccion) {
        unaConstruccion.esPosibleConstruirEnRecurso(this);
    }


    public void esPosibleConstruir(ConstruccionZerg unaConstruccion) {
        unaConstruccion.esPosibleConstruirEnRecurso(this);
    }
}
