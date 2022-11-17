package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Espiral;

import java.util.List;

public class Mutalisco extends Unidad{

    // Deberia poder evolucionarse a Guardian.
    private Construccion preRequisito = new Espiral();

    public Mutalisco(){
        vida = 120;
        tiempoConstruccion = 7;
        rango = 3;
        superficie = new Aire();
        costos.add(100); //Esto es para Minerales
        costos.add(100); // Esto es para Gas
        danio=new AtaqueAireyTierra(9,9);
    }

    @Override
    public void construir() {
        tiempoConstruccion--;


    }

    @Override
    public void modificarEstadisticas(int danio) {
        vida-=danio;

    }

    @Override
    public List<Integer> costo() {
        return costos;
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

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }
}
