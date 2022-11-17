package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.PuertoEstelar;

import java.util.List;

public class Scout extends Unidad{

    private Construccion preRequisito = new PuertoEstelar();

    private int escudo = 100;

    public Scout(){
        vida = 150;
        tiempoConstruccion = 9;
        rango = 4;
        superficie = new Aire();
        costos.add(300); //Esto es para Minerales
        costos.add(150); // Esto es para Gas
        danio=new AtaqueAireyTierra(8,14);

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
