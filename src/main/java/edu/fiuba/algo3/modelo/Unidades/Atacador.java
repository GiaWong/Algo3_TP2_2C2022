package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionZerg;

public interface Atacador {

    void atacar(Unidad unidad);

    void atacar(Construccion construccion);
}
