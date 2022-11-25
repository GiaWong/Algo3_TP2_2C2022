package edu.fiuba.algo3.modelo.Acciones;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class AtaqueTierra implements Atacador {

    private Danio danio;
    private int danioTierra; //Danio es un objeto?

    public AtaqueTierra(int ataque){
        //danioTierra = ataque;
        danio = new Danio(ataque);
    }

    public int danioTierra() {
        return danioTierra;
    }

    @Override
    public void atacar(Unidad unidad) {
        unidad.recibirDanio(danio); //Aca tambien, pensar que danio es un objeto
    }

    @Override
    public void atacar(Construccion construccion) {
        construccion.recibirDanio(danio);
    }
}
/*
UnidadAtacante.atacar(unidadAtacada){
    UnidadAtacada.recibirdanio(ataqueTierra)
*/
