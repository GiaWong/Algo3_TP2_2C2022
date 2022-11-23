package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Exception.NoEstaEnergizado;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;

import java.util.ArrayList;
import java.util.List;

public class NexoMineral extends ConstruccionProtoss {

    private int Vida_Total = 250;
    private int Escudo_total = 250;

    private RefineriaMineral refineria;

    public NexoMineral(){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = Vida_Total;
        escudo =Escudo_total;
        tiempoConstruccion = 4;
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

    public int recolectar(NodoMineral nodo) {
       if (this.estaDisponible()) {
            return nodo.recolectar(20);
        }
       return 0;
    }

    public void esPosibleConstruirEnRecurso(Volcan volcan){
        throw new NoSePuedeConstruirEsteEdificioSobreUnRecurso();
    }
    public void esPosibleConstruirEnRecurso(NodoMineral mineral){
        return;
    }

    public void esPosibleConstruirEn(ConEnergia energia){

    }

    public void esPosibleConstruirEn(ConMoho moho){
        throw new NoEstaEnergizado();
    }
}
