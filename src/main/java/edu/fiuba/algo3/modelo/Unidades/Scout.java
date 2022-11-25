package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.PuertoEstelar;

import java.util.List;

public class Scout extends UnidadProtoss{

    private int rango;

    private Atacador ataqueAire;
    private Atacador ataqueTierra;
    private Construccion preRequisito = new PuertoEstelar();

    public Scout(){
        vida = new Vida(150);
        escudo = new Escudo(100);
        tiempoConstruccion = 9;
        rango = 4;
        costos.add(300); //Esto es para Minerales
        costos.add(150); // Esto es para Gas
        superficie = new Aire();
        ataqueAire = new AtaqueAire(14);
        ataqueTierra = new AtaqueTierra(8);

    }

    @Override
    public void modificarEstadisticas(int danio) {
        //escudo-= danio;

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
