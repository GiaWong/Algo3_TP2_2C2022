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

    public boolean esPrerequisito(Unidad unidad){
        return unidad.permiteCrear(this);
    }

    public void permiteConstruirConUnidad(Unidad unidad){

    }

    public boolean hayLarvaParaEvolucionar(){
        return false;
    }

    public void permiteConstruirConUnidad(Zangano zangano){

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

    @Override
    public void avanzarTurno(Mapa mapa) {
        construir();
        regenerarVida();
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

    public void destruir(Mapa mapa){
        mapa.disminuirEdificioZerg();
    }

    public void esPosibleAgregarUnidad(Unidad unaUnidad){

    }
}
