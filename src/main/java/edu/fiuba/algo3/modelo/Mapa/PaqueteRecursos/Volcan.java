package edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos;

import edu.fiuba.algo3.modelo.Construccion.Asimilador;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Extractor;

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
    public boolean esPosibleConstruir(Construccion unaConstruccion) {
        //Devuelve True si la construccion es una RefineriaGas.

        unaConstruccion.esPosibleConstruirEn(this);
        /*
        Asimilador asimilador = new Asimilador();
        Extractor extractor = new Extractor();
        return ((unaConstruccion.getClass().equals(asimilador.getClass()))||(unaConstruccion.getClass().equals(extractor.getClass())));

         */
    }
}
