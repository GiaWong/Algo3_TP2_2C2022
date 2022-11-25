package edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

public class NodoMineral implements Recurso{

    private int cantidad = 2000;

    public int recolectar(int cant) {
        if (cantidad > 0){
            cantidad -= cant;
            return cant;
        }
        return 0;
    }


    public void esPosibleConstruir(Construccion unaConstruccion) {
        unaConstruccion.esPosibleConstruirEn(this);
    }

}
