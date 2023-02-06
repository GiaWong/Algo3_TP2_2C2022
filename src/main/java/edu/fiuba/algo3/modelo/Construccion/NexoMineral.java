package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.*;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.ArrayList;
import java.util.List;

public class NexoMineral extends ConstruccionProtoss implements RefineriaMineral{

    public NexoMineral(){
        costoMineral = 50;
        costoGas = 0;
        vida = new Vida(250);
        escudo = new Escudo(250);
        tiempoConstruccion = 4;
    }

    public NexoMineral(int tiempoDeConstruccion){
        costoMineral = 50;
        costoGas = 0;
        vida = new Vida(250);
        escudo = new Escudo(250);
        tiempoConstruccion = tiempoDeConstruccion;
    }

    public boolean esPrerequisito(Construccion construccion){
        return false;
    }

    public void verificarPrerequisito(Mapa mapa) {
    }

    public int obtenerVida() {return vida.vidaActual(); }

    @Override
    public void avanzarTurno(Mapa mapa) {
        construir();
        regenerarEscudo();
        //Podria recolectar por cada turno, sin tener una opcion que recolecte directamente...
        //haciendo: mapa.recolectar(coordenada, this) o algo asi
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

    public void permiteConstruirConUnidad(Unidad unidad){

    }

    public void permiteConstruirConUnidad(Zangano zangano){
        throw new CasillaOcupadaPorZangano();
    }

    @Override
    public int recolectar(NodoMineral nodo) throws EdificioNoEstaOperativo {
        verificarEdificioOperativo();
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

    public void destruir(Mapa mapa){
        mapa.disminuirEdificioProtoss();
    }

    public boolean hayLarvaParaEvolucionar(){
        return false;
    }

    public boolean esPrerequisito(Unidad unidad){
        return false;
    }

    public void esPosibleAgregarUnidad(Unidad unaUnidad){
        unaUnidad.permiteAgregarConstruccion(this);
    }
}
