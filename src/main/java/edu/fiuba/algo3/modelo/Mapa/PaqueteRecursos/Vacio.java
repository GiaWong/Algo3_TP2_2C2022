package edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;

public class Vacio implements Recurso {


    @Override
    public void esPosibleConstruir(ConstruccionProtoss unaConstruccion) {
        unaConstruccion.esPosibleConstruirEnRecurso(this);
    }


    public void esPosibleConstruir(ConstruccionZerg unaConstruccion) {
        unaConstruccion.esPosibleConstruirEnRecurso(this);
    }
}
