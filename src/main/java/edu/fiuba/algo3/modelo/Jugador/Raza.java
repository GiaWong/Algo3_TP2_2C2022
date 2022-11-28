package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public abstract class Raza {

    protected Suministro suministro = new Suministro(200);
    protected BancoDeRecursos banco = new BancoDeRecursos();


    public void comprar(Construccion construccion) {
        if (banco.esPosibleComprar(construccion)){
            banco.comprar(construccion);
            suministro.agregar(construccion);
        }
    }
    public void comprar(Unidad unidad) {
        if (banco.esPosibleComprar(unidad)){
            banco.comprar(unidad);
            suministro.agregar(unidad);
        }
    }

    public abstract void recolectar();

}
