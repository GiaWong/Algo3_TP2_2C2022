package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Jugador.Suministro;

public class AmoSupremo extends UnidadZerg{

    // Necesitaria tener algo para poder detectar unidades
    private int rango; //Este seria el rango para detectar las unidades, no para atacar

    public AmoSupremo(){
        vida = new Vida(200);;
        tiempoConstruccion = 5;
        rango = 4;
        costos.add(50); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
        superficie = new Aire();
    }

    @Override
    public void modificarSuministro(Suministro suministro) {
        int aumentoDeSuministro = 5;
        suministro.aumentarCapacidadTotal(aumentoDeSuministro);
    }
}