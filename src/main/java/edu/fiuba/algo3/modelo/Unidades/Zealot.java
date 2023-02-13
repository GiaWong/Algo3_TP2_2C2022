package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupadaPorNexoMineral;
import edu.fiuba.algo3.modelo.Exception.EstaUnidadNoSeMuevePorAreaEspacial;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Exception.UnidadNoTargeteable;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

import java.util.List;

public class Zealot extends UnidadProtoss{

    private int asesinatos = 0;

    public Zealot() {
        vida = new Vida(100);
        escudo = new Escudo(100);
        tiempoConstruccion = 4;
        rango = 1;
        costoMineral = 100;
        costoGas = 0;
        superficie = new Tierra();
        atacador = new AtaqueTierra(8);
        defensa = new Detectable();
        costoSuministro = 2;
    }

    public void detectarUnidadesInvisibles(Mapa mapa, Coordenada coord){

    }

    public void esPosibleConstruir(Construccion construccion){
        construccion.permiteConstruirConUnidad(this);

    }

    public void atacar(Unidad unaUnidad){
        if (!estaDisponible()){
            throw  new UnidadNoOperativa();
        }
        if (unaUnidad.esPosibleSerAtacadoPor(atacador) && unaUnidad.estaVivo()){

            atacador.atacar(unaUnidad);
            if(!unaUnidad.estaVivo()){
                asesinatos++;
                if(asesinatos > 2){
                    tornarInvisible();
                }
            }
        }

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



    public void atacar(Construccion unaConstruccion){
        if (!estaDisponible()){
            throw  new UnidadNoOperativa();
        }
        if (unaConstruccion.obtenerVida() > 0){

            atacador.atacar(unaConstruccion);
            if(unaConstruccion.obtenerVida()  <= 0){
                asesinatos++;
                if(asesinatos > 2){
                    tornarInvisible();
                }
            }
        }


    }

    @Override
    public void esPosibleMoverseEn(AreaEspacial areaEspacial) {
        throw new EstaUnidadNoSeMuevePorAreaEspacial();
    }

    public void setDetectable(){
        defensa = new Detectable();
    }

    @Override
    public void  recibirDanio(Danio danio){
        if(esVisible()){
            defensa.recibirDanio(danio, vida);
        }
        else{
            throw new UnidadNoTargeteable();
        }
    }


    public int obtenerEscudo() {return escudo.escudoActual(); }

    public int obtenerVida() {return vida.vidaActual(); }


    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.disminuirCapacidad(costoSuministro);
    }

    @Override
    public  void detectado(){
        tornarVisible();
    }
}
