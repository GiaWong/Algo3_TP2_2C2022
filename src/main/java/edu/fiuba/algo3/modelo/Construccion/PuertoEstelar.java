package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.NoEstaEnergizado;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Scout;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.List;

public class PuertoEstelar extends ConstruccionProtoss {

    private final ConstruccionProtoss preRequisito = new Acceso();

    public PuertoEstelar(){
        costos.add(150); //esto es para Mineral
        costos.add(150); //esto es para Gas
        vida = new Vida(600);
        escudo = new Escudo(600);
        tiempoConstruccion = 10;
    }

    public PuertoEstelar(int tiempoDeConstruccion){
        costos.add(150); //esto es para Mineral
        costos.add(150); //esto es para Gas
        vida = new Vida(600);
        escudo = new Escudo(600);
        tiempoConstruccion = 10;
    }

    public boolean esPrerequisito(Construccion construccion){
        return false;
    }

    public void verificarPrerequisito(Mapa mapa) {
    }


    public boolean preRequisito(List<Construccion> lista){
        if(lista!=null) {
            for (Construccion construccion : lista) {
                if (construccion.getClass().equals(preRequisito.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }


    public void regenerarEscudo(){
        escudo.regenerarEscudo(10);
    }

    public int obtenerEscudo() {return escudo.escudoActual(); }

    public int obtenerVida() {return vida.vidaActual(); }


    public Unidad crearScout() throws EdificioNoEstaOperativo { //Creo que deberia pasarle la casilla. Y EL BANCO  DE RECURSOS tambien?
        verificarEdificioOperativo();
        return new Scout();
    }


    public void avanzarTurno() {
        this.regenerarEscudo();
        this.construir();
    }

    @Override
    public void avanzarTurno(Mapa mapa) {
        this.regenerarEscudo();
        this.construir();
    }

    public void permiteConstruirConUnidad(Unidad unidad){

    }

    public void permiteConstruirConUnidad(Zangano zangano){

    }

    @Override
    public boolean permiteConstruir(Construccion construccion){
        return false;
    }

    @Override
    public boolean permiteConstruir(ReservaProduccion reservaProduccion){
        return false;
    }

    @Override
    public boolean permiteConstruir(Guarida guarida){
        return false;
    }

    @Override
    public boolean permiteConstruir(Acceso acceso){
        return false;
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

    @Override
    public void esPosibleConstruirEn(ConMoho moho) {
        throw new NoEstaEnergizado();
    }

    @Override
    public void esPosibleConstruirEn(SinTerreno nada) {
        throw new NoEstaEnergizado();
    }

    @Override
    public void aumentarSuministro(Suministro suministro) {

    }

    public void destruir(Mapa mapa){
        mapa.disminuirEdificioProtoss();
    }

    public void esPosibleAgregarUnidad(Unidad unaUnidad){

    }
}
