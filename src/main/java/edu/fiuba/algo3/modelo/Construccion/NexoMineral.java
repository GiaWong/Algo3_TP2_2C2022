package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.ErrorEsteEdificioSoloSeConstruyeEnUnRecurso;
import edu.fiuba.algo3.modelo.Exception.NoEstaEnergizado;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;

import java.util.ArrayList;
import java.util.List;

public class NexoMineral extends ConstruccionProtoss implements RefineriaMineral{

    public NexoMineral(){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(250);
        escudo = new Escudo(250);
        tiempoConstruccion = 4;
    }

    public NexoMineral(int tiempoDeConstruccion){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(250);
        escudo = new Escudo(250);
        tiempoConstruccion = tiempoDeConstruccion;
    }

    public void regenerarEscudo(){
        escudo.regenerarEscudo(10);
    }

    public int obtenerEscudo() {return 0; }

    public int obtenerVida() {return 0; }

    @Override
    public void avanzarTurno() {
        this.regenerarEscudo();

    }

    @Override
    public int recolectar(NodoMineral nodo) {
       if (this.estaDisponible()) {
            return nodo.recolectar(20);
        }
       return 0;
    }

    @Override
    public void esPosibleConstruirEn(Volcan volcan) {
        throw new ErrorEsteEdificioSoloSeConstruyeEnUnRecurso();
    }

    @Override
    public void esPosibleConstruirEn(NodoMineral nodoMineral) {

    }

    @Override
    public void esPosibleConstruirEn(SinRecurso sinRecurso) {
        throw new ErrorEsteEdificioSoloSeConstruyeEnUnRecurso();
    }

    @Override
    public void esPosibleConstruirEn(ConEnergia energia){

    }
    @Override
    public void esPosibleConstruirEn(ConMoho moho){
        throw new NoEstaEnergizado();
    }

    @Override
    public void esPosibleConstruirEn(SinTerreno nada) {
        throw new NoEstaEnergizado();
    }

    @Override
    public void aumentarSuministro(Suministro suministro) {

    }
}
