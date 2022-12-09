package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Construccion.PuertoEstelar;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupadaPorNexoMineral;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

import java.util.List;

public class Scout extends UnidadProtoss{

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
        atacador = new AtaqueAire(14);
        ataqueTierra = new AtaqueTierra(8);

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
    public void esPosibleMoverseEn(AreaEspacial areaEspacial) {

    }

    public void esPosibleConstruir(Construccion construccion){
        construccion.permiteConstruirConUnidad(this);

    }

    public void permiteAgregarConstruccion(NexoMineral nexoMineral){

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
    public int obtenerEscudo() {return escudo.escudoActual(); }

    public int obtenerVida() {return vida.vidaActual(); }

    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.aumentarCapacidad(4);
    }
}
