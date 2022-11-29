package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.NoHayLarvasDisponiblesParaEvolucionar;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

import java.util.ArrayList;

public class Criadero extends ConstruccionZerg implements ConstruccionConRadio{

    private ArrayList<Larva> larvas = new ArrayList<>();
    private int tiempoAmpliacion = 2;

    private Creador creacion;

    private int radio; // Este radio no deberia ir


    public Criadero(){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(500);
        tiempoConstruccion = 4;
        creacion = new CrearUnidad();
        larvas.add(new Larva());
        larvas.add(new Larva());
        larvas.add(new Larva());
    }

    public Criadero(int turnosParaEstarOperativo){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(500);
        tiempoConstruccion = turnosParaEstarOperativo;
        creacion = new CrearUnidad();
        larvas.add(new Larva());
        larvas.add(new Larva());
        larvas.add(new Larva());
    }


    public void verificarDisponibilidadDeLarvas() throws NoHayLarvasDisponiblesParaEvolucionar {
        if(larvas.size() == 0){
            throw new NoHayLarvasDisponiblesParaEvolucionar();
        }
    }

    public Unidad evolucionarLarva() throws NoHayLarvasDisponiblesParaEvolucionar, EdificioNoEstaOperativo {
        verificarEdificioOperativo();
        verificarDisponibilidadDeLarvas();
        return crearUnidad();
    }

    public Unidad crearUnidad(){
        return creacion.crearZangano();
    } //Como resuelvo esto? Tengo que usar larvas para que mute a zangano ahora. Como pongo la unidad en la casilla?

    public boolean equals(Criadero object){
        return object.tieneMismaCantidadDeLarvas(larvas.size());
    } //No entiendo pa que sirve este metodo

    public boolean tieneMismaCantidadDeLarvas(int cantidadDeLarvas) {
        return larvas.size() == cantidadDeLarvas;
    }

    public void ampliarRadio() {
        if (tiempoAmpliacion == 0) {
            radio++;
            tiempoAmpliacion = 2;
        }
    }

    public void regenerarVida(){
        vida.regenerarSalud(5);
    }

    public int obtenerVida() {return 0; }
    public int obtenerRadio(){
        return radio;
    }


    @Override
    public void avanzarTurno(){
        if(larvas.size() < 3){
            larvas.add(new Larva());
        }
        tiempoAmpliacion--;
        this.regenerarVida();
        this.ampliarRadio();

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
    public void esPosibleConstruirEn(SinTerreno nada) {
    }

    @Override
    public void esPosibleConstruirEn(ConEnergia energia){
        throw new NoHayMoho();

    }

    @Override
    public void esPosibleConstruirEn(ConMoho moho){
    }

    @Override
    public void aumentarSuministro(Suministro suministro) {
        suministro.aumentarCapacidadTotal(5);
    }

    @Override
    public void ampliarRadio(Turno turno) {

    }
}
