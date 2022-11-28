package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Guarida;
import edu.fiuba.algo3.modelo.Jugador.Suministro;

import java.util.List;

public class Hidralisco extends UnidadZerg{

    private int rango;

    private Atacador ataqueAire;
    private Atacador ataqueTierra;
    private Construccion preRequisito = new Guarida();

    private Guardian guardian = new Guardian(); //Habria que cambiar esto...

    public Hidralisco(){
        vida = new Vida(80);
        tiempoConstruccion = 4;
        rango = 4;
        costos.add(75); //Esto es para Minerales
        costos.add(25); // Esto es para Gas
        ataqueAire = new AtaqueAire(10);
        ataqueTierra = new AtaqueTierra(10);
        superficie = new Tierra();

    }

    public void atacar(Unidad unaUnidad){
        if (unaUnidad.esPosibleSerAtacadoPor(ataqueTierra)){
            ataqueTierra.atacar(unaUnidad);

        } else if (unaUnidad.esPosibleSerAtacadoPor(ataqueAire)){
            ataqueAire.atacar(unaUnidad);
        }
    }

    public void atacar(Construccion unaConstruccion){
        ataqueTierra.atacar(unaConstruccion);
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
    public void modificarSuministro(Suministro suministro) {
        suministro.aumentarCapacidad(2);
    }
}
