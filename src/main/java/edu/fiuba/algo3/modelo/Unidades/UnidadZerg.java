package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Jugador.Suministro;

public abstract class UnidadZerg extends Unidad{


    public void recibirDanio(Danio danio){
        defensa.recibirDanio(danio, vida);
    }

    public abstract void modificarSuministro(Suministro suministro);




}
