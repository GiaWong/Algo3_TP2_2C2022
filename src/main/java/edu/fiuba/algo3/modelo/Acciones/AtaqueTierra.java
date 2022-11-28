package edu.fiuba.algo3.modelo.Acciones;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Aire;
import edu.fiuba.algo3.modelo.Unidades.Superficie;
import edu.fiuba.algo3.modelo.Unidades.Tierra;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class AtaqueTierra implements Atacador { //Supuesto: TODAS LAS CONSTRUCCIONES RECIBEN SOLO ATAQUE TIERRA

    private Danio danio;
    private int danioTierra;

    public AtaqueTierra(int ataque){
        danio = new Danio(ataque);
    }

    @Override
    public void atacar(Unidad unidad) {
        unidad.recibirDanio(danio);
    }

    @Override
    public void atacar(Construccion construccion) {
        construccion.recibirDanio(danio);
    }

    @Override
    public boolean esPosibleAtacar(Superficie superficie) {
        return superficie.esPosibleSerAtacadoPorAtaqueTierra();
    }

}
/*
UnidadAtacante.atacar(unidadAtacada){
    UnidadAtacada.recibirdanio(ataqueTierra)
*/
