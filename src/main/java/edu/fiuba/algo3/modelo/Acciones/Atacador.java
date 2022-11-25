package edu.fiuba.algo3.modelo.Acciones;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public interface Atacador {

    void atacar(Unidad unidad);

    void atacar(Construccion construccion);
}
