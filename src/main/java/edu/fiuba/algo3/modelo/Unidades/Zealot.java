package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Atacador;
import edu.fiuba.algo3.modelo.Acciones.AtaqueTierra;
import edu.fiuba.algo3.modelo.Acciones.Detectable;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.List;

public class Zealot extends UnidadProtoss{

    private int rango;
    private Atacador ataqueTierra;
    private Construccion preRequisito = new Acceso();

    public Zealot() {
        vida = new Vida(100);
        tiempoConstruccion = 4;
        rango = 1;
        costos.add(100); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
        superficie = new Tierra();
        ataqueTierra = new AtaqueTierra(8);
        defensa = new Detectable();
    }

    public void setDetectable(){
        defensa = new Detectable();
    }

    @Override
    public void modificarEstadisticas(int danio) {
       // escudo-= danio;
       // if (escudo<0){
       //     vida += escudo;
        //    escudo = 0;
        //}
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
