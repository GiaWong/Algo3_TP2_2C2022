package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.CasillaOcupadaPorNexoMineral;
import edu.fiuba.algo3.modelo.Exception.EstaUnidadNoSeMuevePorAreaEspacial;
import edu.fiuba.algo3.modelo.Exception.UnidadNoTargeteable;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

import java.util.List;

public class Zealot extends UnidadProtoss{

    private int asesinatos = 0;
    private boolean visible;
    private Construccion preRequisito = new Acceso();

    public Zealot() {
        vida = new Vida(100);
        escudo = new Escudo(100);
        tiempoConstruccion = 4;
        rango = 1;
        costos.add(100); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
        superficie = new Tierra();
        atacador = new AtaqueTierra(8);
        defensa = new Detectable();
    }

    public void esPosibleConstruir(Construccion construccion){
        construccion.permiteConstruirConUnidad(this);

    }

    public void atacar(Unidad unaUnidad){
        if (unaUnidad.esPosibleSerAtacadoPor(atacador)){
            atacador.atacar(unaUnidad);
        }
        /*try {
            atacador.ultimoGolpe(unaUnidad);

        }catch (Exception UnidadMuerta){
            asesinatos++;
        }*/

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

        atacador.atacar(unaConstruccion);
        /*try {
            //atacador.ultimoGolpe(unaConstruccion);

        }catch (Exception ConstruccionDestruida){
            asesinatos++;
        }*/

    }

    @Override
    public void esPosibleMoverseEn(AreaEspacial areaEspacial) {
        throw new EstaUnidadNoSeMuevePorAreaEspacial();
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
    public int obtenerEscudo() {return escudo.escudoActual(); }

    public int obtenerVida() {return vida.vidaActual(); }

    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.aumentarCapacidad(2);
    }

    @Override
    public  void detectado(){
        visible = true;
    }
}
