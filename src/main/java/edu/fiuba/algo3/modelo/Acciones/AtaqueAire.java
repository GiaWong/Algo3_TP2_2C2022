package edu.fiuba.algo3.modelo.Acciones;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Superficie;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class AtaqueAire implements Atacador {

    private Danio danio;

    public AtaqueAire(int ataque) {
        danio = new Danio(ataque);
    }

    @Override
    public void atacar(Unidad unidad) {
        unidad.recibirDanio(danio); //El "danio" tengo pensado que sea un objeto con los atributos de danio, y que despues danio se encargue de bajarle la vida/escudo a unidad.
    }

    @Override
    public void atacar(Construccion construccion) {
        construccion.recibirDanio(danio); //La interaz de Defendible la deberia tener la Construccion Madre tambien, porque todas las construcciones reciben Danio.
    }

    @Override
    public boolean esPosibleAtacar(Superficie superficie) {
        return superficie.esPosibleSerAtacadoPorAtaqueAire();
    }

    @Override
    void ultimoGolpe(Construccion construccion){
        construccion.estaOperativo();
    }
    @Override
    void ultimoGolpe(Unidad unidad){
        unidad.estaOperativo();
    }
}
