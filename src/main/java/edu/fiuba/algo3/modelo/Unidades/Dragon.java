package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.EstaUnidadNoSeMuevePorAreaEspacial;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

import java.util.List;

public class Dragon extends UnidadProtoss{

    private Construccion preRequisito = new Acceso();
    private Atacador ataqueTierra;

    public Dragon(){

        vida = new Vida(100);
        escudo = new Escudo(60);
        tiempoConstruccion = 6;
        rango = 4;
        costoMineral = 125;
        costoGas = 50;
        superficie = new Tierra();
        atacador = new AtaqueAire(20);
        ataqueTierra = new AtaqueTierra(20);
        costoSuministro = 3;
    }

    public void esPosibleConstruir(Construccion construccion){
        construccion.permiteConstruirConUnidad(this);

    }

    public void permiteAgregarConstruccion(NexoMineral nexoMineral){

    }

    public boolean permiteCrear(Acceso acceso){
        return true;
    }

    public boolean permiteCrear(PuertoEstelar puertoEstelar){
        return false;
    }

    public boolean permiteCrear(ReservaProduccion reservaProduccion){
        return false;
    }

    public boolean permiteCrear(Guarida guarida){
        return false;
    }

    public boolean permiteCrear(Espiral espiral){
        return false;
    }

    public boolean permiteCrear(Criadero criadero){
        return false;
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
    public void atacar(Unidad unaUnidad){
        if (!estaDisponible()){
            throw  new UnidadNoOperativa();
        }
        if (unaUnidad.esPosibleSerAtacadoPor(ataqueTierra)){
            ataqueTierra.atacar(unaUnidad);

        } else if (unaUnidad.esPosibleSerAtacadoPor(atacador)){
            atacador.atacar(unaUnidad);
        }
    }

    public void atacar(Construccion unaConstruccion){

        if (!estaDisponible()){
            throw  new UnidadNoOperativa();
        }
        ataqueTierra.atacar(unaConstruccion);
    }

    @Override
    public void esPosibleMoverseEn(AreaEspacial areaEspacial) {
        throw new EstaUnidadNoSeMuevePorAreaEspacial();
    }

    @Override
    public void recibirDanio(Danio danio) {
        defensa.recibirDanio(danio, vida, escudo);
    }

    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.disminuirCapacidad(costoSuministro);
    }

}
