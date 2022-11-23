package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.ConstruccionZerg;

public interface Atacador {

    void atacarZerg(UnidadZerg unidad); //Capaz conviene que sea un atacar Unidad y atacar Construccion

    void atacarProtoss(UnidadProtoss unidad);

    void atacarConstruccionZerg(ConstruccionZerg construccion);

    void atacarConstruccionProtoss(UnidadZerg unidad);
}
