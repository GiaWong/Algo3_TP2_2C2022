package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;

public class Zangano extends UnidadZerg{

    public Zangano(){
        vida = new Vida(25);
        tiempoConstruccion = 1;
        costos.add(25); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
        superficie = new Tierra();
        defensa = new Detectable();
    }

    public int recolectar(NodoMineral nodo) {
        return nodo.recolectar(10);
    }

    @Override
    public void modificarEstadisticas(int danio) {
       // vida -=danio;

    }
}
