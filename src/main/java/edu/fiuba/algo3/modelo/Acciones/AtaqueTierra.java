package edu.fiuba.algo3.modelo.Acciones;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Aire;
import edu.fiuba.algo3.modelo.Unidades.Superficie;
import edu.fiuba.algo3.modelo.Unidades.Tierra;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class AtaqueTierra implements Atacador { //Supuesto: TODAS LAS CONSTRUCCIONES RECIBEN SOLO ATAQUE TIERRA

    private final Danio danio;

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

    /*
    @Override
    void ultimoGolpe(Construccion construccion){
        construccion.estaOperativo();
    }
    @Override
    void ultimoGolpe(Unidad unidad){
        unidad.estaOperativo();
    }

     */


}

