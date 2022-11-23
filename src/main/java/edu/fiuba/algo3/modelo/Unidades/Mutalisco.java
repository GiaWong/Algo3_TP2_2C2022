package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Espiral;

import java.util.List;

public class Mutalisco extends Unidad{

    // Deberia poder evolucionarse a Guardian.
    private Construccion preRequisito = new Espiral();

    public Mutalisco(){
        vida = new Vida(120);;
        tiempoConstruccion = 7;
        rango = 3;
        costos.add(100); //Esto es para Minerales
        costos.add(100); // Esto es para Gas
        superficie = new Aire();
        defendible =new AtaqueAireyTierra(9,9);
    }

    @Override
    public void modificarEstadisticas(int danio) {
       // vida-=danio;

    }

    public Unidad evolucionar() {
        return new Guardian();
    }

    public boolean preRequisito(List<Construccion> lista) {
        if(lista!=null) {
            for(int i =0; i<lista.size();i++){
                if(lista.get(i).getClass().equals(preRequisito.getClass())){
                    return true;
                }
            }
        }
        return false;
    }
}
