package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

public class AtaqueTierra implements Atacador {

    private Danio danio;
    private int danioTierra; //Danio es un objeto?

    public AtaqueTierra(int tierra){
        danioTierra = tierra;
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
