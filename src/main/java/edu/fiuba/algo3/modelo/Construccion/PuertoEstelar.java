package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Exception.NoEstaEnergizado;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;

import java.util.ArrayList;
import java.util.List;

public class PuertoEstelar extends ConstruccionProtoss {

    private ConstruccionProtoss preRequisito = new Acceso();
    private int Vida_Total = 600;

    private int Escudo_total = 600;

    private Creador creacion;

    public PuertoEstelar(){
        costos.add(150); //esto es para Mineral
        costos.add(150); //esto es para Gas
        vida = Vida_Total;
        escudo = Escudo_total;
        tiempoConstruccion = 10;
    }

    public boolean preRequisito(List<Construccion> lista){
        if(lista!=null) {
            for(int i =0; i<lista.size();i++){
                if(lista.get(i).getClass().equals(preRequisito.getClass())){
                    return true;
                }
            }
        }
        return false;
    }


    public void regenerarEscudo(){
        if(escudo < (Escudo_total)){
            escudo += 10;
        }
    }

    public int obtenerEscudo() {return escudo; }

    public void recibeDanio(int cant) {
        escudo-= cant;
        if (escudo<0){
            vida += escudo;
            escudo = 0;
        }


    }
    public int obtenerVida() {return vida; }

    @Override
    public void avanzarTurno() {
        this.regenerarEscudo();

    }

    public void crearScout(){

    }

    public void esPosibleConstruirEnRecurso(NodoMineral mineral){
        throw new NoSePuedeConstruirEsteEdificioSobreUnRecurso();
    }

    public void esPosibleConstruirEn(ConEnergia energia){

    }

    public void esPosibleConstruirEn(ConMoho moho){
        throw new NoEstaEnergizado();
    }
}
