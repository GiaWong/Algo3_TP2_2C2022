package edu.fiuba.algo3.modelo.Acciones;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Aire;
import edu.fiuba.algo3.modelo.Unidades.Superficie;
import edu.fiuba.algo3.modelo.Unidades.Tierra;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public interface Atacador {

    void atacar(Unidad unidad);

    void atacar(Construccion construccion);

    boolean esPosibleAtacar(Superficie superficie);
    /*

    //void ultimoGolpe(Construccion construccion);
    //void ultimoGolpe(Unidad unidad);

     */

}
