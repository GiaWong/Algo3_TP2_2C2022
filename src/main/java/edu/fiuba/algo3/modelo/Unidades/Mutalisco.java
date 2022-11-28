package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Espiral;
import edu.fiuba.algo3.modelo.Jugador.Suministro;

import java.util.List;

public class Mutalisco extends UnidadZerg{

    // Deberia poder evolucionarse a Guardian.
    private int rango;

    private Atacador ataqueAire;
    private Atacador ataqueTierra;
    private Construccion preRequisito = new Espiral();

    public Mutalisco(){
        vida = new Vida(120);;
        tiempoConstruccion = 7;
        rango = 3;
        costos.add(100); //Esto es para Minerales
        costos.add(100); // Esto es para Gas
        superficie = new Aire();
        ataqueAire =new AtaqueAire(9);
        ataqueTierra = new AtaqueTierra(9);
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

    public Unidad evolucionar() {
        return new Guardian();
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
        suministro.aumentarCapacidad(4);
    }
}
