package edu.fiuba.algo3.modelo.ConstruccionProtoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import java.util.List;

public class PuertoEstelar extends ConstruccionProtoss {

    private Acceso preRequisito = new Acceso();
    public boolean preRequisito(List<Construccion> lista){
        if(lista!=null) {
            for(int i =0; i<lista.size();i++){
                if(lista.get(i).getClass().equals(preRequisito.getClass())){
                    return true;
                }
            }
        }
        return false;
    }


    public PuertoEstelar(){
        costos.add(150); //esto es para Mineral
        costos.add(150); //esto es para Gas
        vida = 600;
        escudo = 600;
        tiempoConstruccion = 10;
    }
    @Override
    public void construir() {
        tiempoConstruccion--;
    }


    public void evolucionar() {

    }
}
