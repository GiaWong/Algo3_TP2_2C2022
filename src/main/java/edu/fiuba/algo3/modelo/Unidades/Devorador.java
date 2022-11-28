package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Atacador;
import edu.fiuba.algo3.modelo.Acciones.AtaqueAire;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Jugador.Suministro;

public class Devorador extends UnidadZerg{

    private int rango;

    public Devorador(){
        vida = new Vida(200);
        tiempoConstruccion = 4;
        rango = 5;
        costos.add(150); //Esto es para Minerales
        costos.add(50); // Esto es para Gas
        superficie = new Aire();
        atacador = new AtaqueAire(15);
    }

    public void atacar(Unidad unaUnidad){
        if (unaUnidad.esPosibleSerAtacadoPor(atacador)){
            atacador.atacar(unaUnidad);
        }
    }

    public void atacar(Construccion unaConstruccion){

    }

    @Override
    public void modificarSuministro(Suministro suministro) {

    }
}
