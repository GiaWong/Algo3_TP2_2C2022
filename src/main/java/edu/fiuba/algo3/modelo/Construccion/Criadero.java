package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Acciones.Vida;
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
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class Criadero extends ConstruccionZerg {

    private int larvas = 3;
    private int tiempoAmpliacion = 2;
    //private int radio = 5;

    private Creador creacion;

    private int radio; // Este radio no deberia ir

    private Moho radio;

    public Criadero(){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(500);
        tiempoConstruccion = 4;
        creacion = new CrearUnidad();
    }

    public Criadero(int turnosParaEstarOperativo){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(500);
        tiempoConstruccion = turnosParaEstarOperativo;
        creacion = new CrearUnidad();
    }


    public void verificarDisponibilidadDeLarvas() throws NoHayLarvasDisponiblesParaEvolucionar {
        if(larvas < 0){
            throw new NoHayLarvasDisponiblesParaEvolucionar();
        }
    }

    public Unidad evolucionarLarva() throws NoHayLarvasDisponiblesParaEvolucionar {
        verificarEdificioOperativo();
        verificarDisponibilidadDeLarvas();
        return crearUnidad();
    }

    public Unidad crearUnidad(){
        return creacion.crearZangano();
    }

    public boolean equals(Criadero object){
        return object.tieneMismaCantidadDeLarvas(larvas);
    }

    public boolean tieneMismaCantidadDeLarvas(int cantidadDeLarvas) {
        return larvas == cantidadDeLarvas;
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
        if(larvas<3){
            larvas++;
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
}
