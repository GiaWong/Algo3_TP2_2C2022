package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Jugador.Suministro;

import java.util.List;

public class Dragon extends UnidadProtoss{

    private Construccion preRequisito = new Acceso();
    private Atacador ataqueTierra;

    public Dragon(){

        vida = new Vida(100);
        escudo = new Escudo(60);
        tiempoConstruccion = 6;
        rango = 4;
        costos.add(125); //Esto es para Minerales
        costos.add(50); // Esto es para Gas
        superficie = new Tierra();
        atacador = new AtaqueAire(20);
        ataqueTierra = new AtaqueTierra(20);
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

    public void atacar(Unidad unaUnidad){
        if (unaUnidad.esPosibleSerAtacadoPor(ataqueTierra)){
            ataqueTierra.atacar(unaUnidad);

        } else if (unaUnidad.esPosibleSerAtacadoPor(atacador)){
            atacador.atacar(unaUnidad);
        }
    }

    public void atacar(Construccion unaConstruccion){
        ataqueTierra.atacar(unaConstruccion);
    }

    @Override
    public void recibirDanio(Danio danio) {
        defensa.recibirDanio(danio, vida, escudo);
    }

    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.aumentarCapacidad(3);
    }

}
