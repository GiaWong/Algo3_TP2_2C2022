package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.List;

public class Dragon extends Unidad{

    private Construccion preRequisito = new Acceso();

    private int escudo = 60;
    public Dragon(){
        vida = new Vida(100);
        tiempoConstruccion = 6;
        rango = 4;
        costos.add(125); //Esto es para Minerales
        costos.add(50); // Esto es para Gas
        superficie = new Tierra();
        danio=new AtaqueAireyTierra(20,20);
    }

    @Override
    public void modificarEstadisticas(int danio) {
        //escudo-= danio;
        //if (escudo<0){
          //  vida += escudo;
          //  escudo = 0;
       // }

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
