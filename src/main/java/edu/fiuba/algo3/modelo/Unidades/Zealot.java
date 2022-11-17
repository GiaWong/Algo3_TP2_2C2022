package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.List;

public class Zealot extends Unidad{

    private Construccion preRequisito = new Acceso();
    private int escudo = 60;
    public Zealot(){
        vida = 100;
        danio=new AtaqueTierra(8);
        tiempoConstruccion = 4;
        rango = 3;
        superficie = new Tierra();
        costos.add(100); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
    }

    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    @Override
    public void modificarEstadisticas(int danio) {
        escudo-= danio;
        if (escudo<0){
            vida += escudo;
            escudo = 0;
        }

    }
    @Override
    public List<Integer> costo() {
        return costos;
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
