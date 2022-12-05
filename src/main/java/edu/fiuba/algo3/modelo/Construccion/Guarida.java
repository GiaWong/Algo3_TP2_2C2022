package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.*;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Hidralisco;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

import java.util.ArrayList;
import java.util.List;

public class Guarida extends ConstruccionZerg {

    private ConstruccionZerg preRequisito = new ReservaProduccion();
    private Unidad hidralisco = new Hidralisco();

    private ArrayList<Larva> larvas = new ArrayList<>();

    public boolean esPrerequisito(Construccion construccion){
        return false;
    }

    public boolean esPrerequisito(ReservaProduccion reservaProduccion){
        return true;
    }

    public void verificarPrerequisito(Mapa mapa) throws NoCumplePrerequisito {
        if(!mapa.cumplePrerequisito(this)){
            throw new NoCumplePrerequisito();
        }
    }


    public Guarida(){
        costos.add(200); //esto es para Mineral
        costos.add(100); //esto es para Gas
        vida = new Vida(1250);
        tiempoConstruccion = 12;
    }

    public Guarida(int tiempoDeConstruccion){
        costos.add(200); //esto es para Mineral
        costos.add(100); //esto es para Gas
        vida = new Vida(1250);
        tiempoConstruccion = tiempoDeConstruccion;
    }
    public boolean esRequisitoDe(Construccion construccion){
        return false;
    }

    public boolean esRequisitoDe(Guarida guarida){
        return true;
    }

    public int obtenerVida() { return vida.vidaActual(); }

    public void regenerarVida(){
        vida.regenerarSalud(5);
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();
        this.construir();
    }

    public void agregarLarva(Larva larva){
        larvas.add(larva);
    }

    public Unidad crearHidralisco() throws EdificioNoEstaOperativo { //Deberia pasarle la casilla y asignarle la unidad a casilla
        verificarEdificioOperativo();
        return new Hidralisco();
    }

    public void construirUnidad() { //Esto seria el metodo de crearUnidad()
        this.hidralisco.construir();

    }

    @Override
    public void esPosibleConstruirEn(ConEnergia energia){
        throw new NoHayMoho();

    }
    @Override
    public void esPosibleConstruirEn(ConMoho moho){

    }

    @Override
    public void esPosibleConstruirEn(SinTerreno nada) {
        throw new NoSePuedeConstruirEnEsteTerreno();
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
    public void aumentarSuministro(Suministro suministro) {

    }
}
