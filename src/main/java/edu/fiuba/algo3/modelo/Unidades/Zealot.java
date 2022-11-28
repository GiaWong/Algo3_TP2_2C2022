package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Exception.UnidadNoTargeteable;
import edu.fiuba.algo3.modelo.Jugador.Suministro;

import java.util.List;

public class Zealot extends UnidadProtoss{

    private boolean visible;
    private Construccion preRequisito = new Acceso();

    public Zealot() {
        vida = new Vida(100);
        tiempoConstruccion = 4;
        rango = 1;
        costos.add(100); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
        superficie = new Tierra();
        atacador = new AtaqueTierra(8);
        defensa = new Detectable();
    }

    public void atacar(Unidad unaUnidad){
        if (unaUnidad.esPosibleSerAtacadoPor(atacador)){
            atacador.atacar(unaUnidad);
        }
    }

    public void atacar(Construccion unaConstruccion){
        atacador.atacar(unaConstruccion);
    }

    public void setDetectable(){
        defensa = new Detectable();
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
    @Override
    public void  recibirDanio(Danio danio){
        if(visible){
            defensa.recibirDanio(danio, vida);
        }
        else{
            throw new UnidadNoTargeteable();
        }
    }

    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.aumentarCapacidad(2);
    }

    @Override
    public  void detectado(){
        visible = true;
    }
}
