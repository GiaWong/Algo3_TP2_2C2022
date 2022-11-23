package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;

import java.util.List;

public class Zerling extends Unidad{
    private Construccion preRequisito = new ReservaProduccion();
    public Zerling(){

        vida = new Vida(35);
        tiempoConstruccion = 2;
        rango = 1;
        costos.add(25); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
        superficie = new Tierra();
        danio=new AtaqueTierra(4);
        ;
    }

    @Override
    public void modificarEstadisticas(int danio) {
       // vida -= danio;
    }

    public boolean preRequisito(List<Construccion> lista) {
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getClass().equals(preRequisito.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }
}

