package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.UnidadNoOperativa;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

public class Mutalisco extends UnidadZerg implements Evolucionador{

    // Deberia poder evolucionarse a Guardian.
    private Atacador ataqueTierra;
    //private Construccion preRequisito = new Espiral();

    public Mutalisco(){
        vida = new Vida(120);;
        tiempoConstruccion = 7;
        rango = 3;
        costoMineral = 100;
        costoGas = 100;
        superficie = new Aire();
        atacador = new AtaqueAire(9);
        ataqueTierra = new AtaqueTierra(9);
        costoSuministro = 4;
    }

    public void esPosibleConstruir(Construccion construccion){
        construccion.permiteConstruirConUnidad(this);

    }

    public void permiteAgregarConstruccion(NexoMineral nexoMineral){

    }

    public boolean permiteCrear(Acceso acceso){
        return false;
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
        return true;
    }

    public boolean permiteCrear(Criadero criadero){
        return false;
    }

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

    }


    public int obtenerVida() {return vida.vidaActual(); }


    /*
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

     */

    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.disminuirCapacidad(costoSuministro);
    }


    public Guardian evolucionarGuardian(BancoDeRecursos banco, Mapa mapa) {
        Guardian guardian = new Guardian();
        banco.comprar(guardian);
        mapa.destruirUnidad(coordenada);
        mapa.agregar(guardian,coordenada);
        return guardian;
    }



    public Devorador evolucionarDevorador(BancoDeRecursos banco, Mapa mapa) {
        Devorador devorador = new Devorador();
        banco.comprar(devorador);
        mapa.destruirUnidad(coordenada);
        mapa.agregar(devorador,coordenada);
        return devorador;
    }
}
