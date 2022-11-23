package edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionProtoss;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionZerg;

public interface Recurso {

    void esPosibleConstruir(ConstruccionProtoss unaConstruccion);
    void esPosibleConstruir(ConstruccionZerg unaConstruccion);

}
