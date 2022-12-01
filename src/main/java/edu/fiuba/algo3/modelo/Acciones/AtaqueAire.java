package edu.fiuba.algo3.modelo.Acciones;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Superficie;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class AtaqueAire implements Atacador {

    private final Danio danio;

    public AtaqueAire(int ataque) {
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
        return superficie.esPosibleSerAtacadoPorAtaqueAire();
    }

    /*
    /*@Override
    void ultimoGolpe(Construccion construccion){
        construccion.estaOperativo();
    }
    @Override
    void ultimoGolpe(Unidad unidad){
        unidad.estaOperativo();
    }*/


}
