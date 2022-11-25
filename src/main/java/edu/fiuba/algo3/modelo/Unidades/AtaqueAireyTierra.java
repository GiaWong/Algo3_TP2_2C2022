package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionZerg;

public class AtaqueAireyTierra implements Atacador {

    private Danio danio;
    private int danioTierra;
    private int danioAire;
    private int danioInfligir;

    public AtaqueAireyTierra(int tierra,int aire){
        danioAire = aire;
        danioTierra = tierra;
    }

    public boolean esPosibleAtacar(Superficie sup) {
        Superficie air = new Aire();
        if(air.getClass().equals(sup.getClass())){
            danioInfligir = danioAire;
        }
        else {
            danioInfligir = danioTierra;
        }
        return true;
    }


    @Override
    public void atacar(Unidad unidad) {
        unidad.recibirDanio(danio); //El "danio" tengo pensado que sea un objeto con los atributos de danio, y que despues danio se encargue de bajarle la vida/escudo a unidad.
    }

    @Override
    public void atacar(Construccion construccion) {
        construccion.recibirDanio(danio); //La interaz de Defendible la deberia tener la Construccion Madre tambien, porque todas las construcciones reciben Danio.
    }
}
