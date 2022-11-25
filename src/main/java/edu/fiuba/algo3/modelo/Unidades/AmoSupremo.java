package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.AtaqueAire;
import edu.fiuba.algo3.modelo.Acciones.AtaqueTierra;
import edu.fiuba.algo3.modelo.Acciones.Detectable;
import edu.fiuba.algo3.modelo.Acciones.Vida;

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
    public void modificarEstadisticas(int danio) {

    }
}
