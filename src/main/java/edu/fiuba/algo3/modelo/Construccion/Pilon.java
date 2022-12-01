package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.NoEstaEnergizado;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEnEsteTerreno;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Turno.Turno;

import java.util.ArrayList;
import java.util.List;

public class Pilon extends ConstruccionProtoss implements ConstruccionConRadio{

    private int radio = 3; //El radio es mejor que sea un entero o un objeto?
    //private Energia radio;

    public Pilon(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(300);
        escudo = new Escudo(300);
        tiempoConstruccion = 5;
    }

    public Pilon(Vida vida1){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = vida1;
        escudo = new Escudo(300);
        tiempoConstruccion = 5;
    }

    public void regenerarEscudo(){
        escudo.regenerarEscudo(10);
    }

    public int obtenerEscudo() {return escudo.escudoActual(); }

    public int obtenerVida() {return vida.vidaActual(); }

    @Override
    public void avanzarTurno() {
        this.regenerarEscudo();
        this.construir();
    }

    @Override
    public void esPosibleConstruirEn(Volcan volcan) {
        throw new NoSePuedeConstruirEsteEdificioSobreUnRecurso();
    }

    @Override
    public void esPosibleConstruirEn(NodoMineral nodoMineral) {
        throw new NoSePuedeConstruirEsteEdificioSobreUnRecurso();
    }

    @Override
    public void esPosibleConstruirEn(SinRecurso sinRecurso) {

    }

    @Override
    public void esPosibleConstruirEn(ConEnergia energia) {

    }

    public void esPosibleConstruirEn(ConMoho moho){
        throw new NoSePuedeConstruirEnEsteTerreno();
    }

    @Override
    public void esPosibleConstruirEn(SinTerreno nada) {

    }

    @Override
    public void aumentarSuministro(Suministro suministro) {
        suministro.aumentarCapacidadTotal(5);
    }

    public void energizar(Mapa mapa, Coordenada coordenada) throws EdificioNoEstaOperativo{
        verificarEdificioOperativo();
    }

    @Override
    public void ampliarRadio(Turno turno) {

    }

    @Override
    public int obtenerRadio() {
        return radio;
    }
}
