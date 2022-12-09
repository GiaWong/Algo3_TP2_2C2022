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
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.ArrayList;
import java.util.List;

public class Guarida extends ConstruccionZerg {

    private final ConstruccionZerg preRequisito = new ReservaProduccion();
    private final Unidad hidralisco = new Hidralisco();

    private final ArrayList<Larva> larvas = new ArrayList<>();

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

    public boolean esPrerequisito(Construccion construccion){
        return construccion.permiteConstruir(this);
    }



    @Override
    public boolean permiteConstruir(Construccion construccion){
        return false;
    }

    @Override
    public boolean permiteConstruir(ReservaProduccion reservaProduccion){
        return true;
    }

    @Override
    public boolean permiteConstruir(Guarida guarida){
        return false;
    }

    @Override
    public boolean permiteConstruir(Acceso acceso){
        return false;
    }

    public void permiteConstruirConUnidad(Unidad unidad){

    }

    public void permiteConstruirConUnidad(Zangano zangano){

    }

    public void destruir(Mapa mapa){
    }

    public void esPosibleAgregarUnidad(Unidad unaUnidad){

    }






    public void verificarPrerequisito(Mapa mapa) throws NoCumplePrerequisito {
        if(!mapa.cumplePrerequisito(this)){
            throw new NoCumplePrerequisito();
        }
    }


    public int obtenerVida() { return vida.vidaActual(); }

    public void regenerarVida(){
        vida.regenerarSalud(5);
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

    public void avanzarTurno() {
        this.regenerarVida();
        this.construir();
    }
    @Override
    public void avanzarTurno(Mapa mapa) {
        this.regenerarVida();
        this.construir();
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
