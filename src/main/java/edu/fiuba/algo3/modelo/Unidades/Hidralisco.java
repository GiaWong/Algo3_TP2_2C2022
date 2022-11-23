package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Guarida;

import java.util.List;

public class Hidralisco extends Unidad{

    private Construccion preRequisito = new Guarida();
    private Guardian guardian;

    public Hidralisco(){
        vida = new Vida(80);
        tiempoConstruccion = 4;
        rango = 4;
        costos.add(75); //Esto es para Minerales
        costos.add(25); // Esto es para Gas
        defendible =new AtaqueAireyTierra(10,10);
        superficie = new Tierra();
        guardian = new Guardian();

    }

    @Override
    public void modificarEstadisticas(int danio) {
       // vida -=danio;
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
