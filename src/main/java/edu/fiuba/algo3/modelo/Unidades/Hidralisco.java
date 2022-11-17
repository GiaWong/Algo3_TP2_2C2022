package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Guarida;

import java.util.List;

public class Hidralisco extends Unidad{

    private Construccion preRequisito = new Guarida();
    private Guardian guardian;

    public Hidralisco(){
        vida = 80;
        tiempoConstruccion = 4;
        rango = 4;
        superficie = new Tierra();
        guardian = new Guardian();
        costos.add(75); //Esto es para Minerales
        costos.add(25); // Esto es para Gas
        danio=new AtaqueAireyTierra(10,10);

    }

    @Override
    public void construir() {
        tiempoConstruccion --;
    }

    @Override
    public void modificarEstadisticas(int danio) {
        vida -=danio;

    }

    @Override
    public List<Integer> costo() {
        return costos;
    }

    public void ataqueTierra(Construccion construccionEnemiga) {
        construccionEnemiga.recibeDanio(1);//cuanto daño recibe?
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
