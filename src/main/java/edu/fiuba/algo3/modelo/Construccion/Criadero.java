package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.ArrayList;

public class Criadero extends ConstruccionZerg implements ConstruccionConRadio{

    private ArrayList<Larva> larvas = new ArrayList<>();

    private int radio;

    private int turnos = -4;

    public Criadero(){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(500);
        tiempoConstruccion = 4;
        radio = 5;
        larvas.add(new Larva());
        larvas.add(new Larva());
        larvas.add(new Larva());

    }

    public Criadero(Vida vida1){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = vida1;
        tiempoConstruccion = 4;
        radio = 5;
        larvas.add(new Larva());
        larvas.add(new Larva());
        larvas.add(new Larva());

    }

    public Criadero(int turnosParaEstarOperativo){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(500);
        tiempoConstruccion = turnosParaEstarOperativo;
        radio = 5;
        larvas.add(new Larva());
        larvas.add(new Larva());
        larvas.add(new Larva());

    }

    public Unidad evolucionarLarva(BancoDeRecursos bancoDeRecursos) throws EdificioNoEstaOperativo {
        verificarEdificioOperativo();
        Larva larva = larvas.get(0);
        larvas.remove(0);
        bancoDeRecursos.comprar(new Zangano()); //Esto puede ir en un futuro de distinta manera
        return larva.crearZangano();
    }

    public boolean tieneMismaCantidadDeLarvas(int cantidadDeLarvas) {
        return larvas.size() == cantidadDeLarvas;
    }

    public void ampliarRadio() {
        /*
        if (tiempoAmpliacion == 0) {
            radio++;
            tiempoAmpliacion = 2;
        }

         */
    }

    public void regenerarVida(){
        vida.regenerarSalud(5);
    }

    public int obtenerVida() {return vida.vidaActual(); }


    @Override
    public void avanzarTurno(){
        if(larvas.size() < 3){
            larvas.add(new Larva());
        }
        this.construir();
        this.regenerarVida();
        this.ampliarRadio();
        turnos++;
    }

    public void avanzarTurno(Mapa mapa, Coordenada coordenada){
        if(larvas.size() < 3){
            larvas.add(new Larva());
        }
        this.construir();
        this.regenerarVida();
        this.expandirMoho(mapa,coordenada);
        turnos++;
    }

    public void expandirMoho(Mapa mapa, Coordenada coordenada){
        if((turnos % 2 == 0) && (estaDisponible())){
            mapa.setearRadio(coordenada,radio, new ConMoho());
            radio++;
        }
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
        suministro.aumentarCapacidad(5);
    }

}
