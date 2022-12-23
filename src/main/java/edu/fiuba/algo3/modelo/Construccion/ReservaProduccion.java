package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
public class ReservaProduccion extends ConstruccionZerg {

    public ReservaProduccion(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(1000);
        tiempoConstruccion = 12;
    }

    public ReservaProduccion(int tiempoDeConstruccion){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(1000);
        tiempoConstruccion = tiempoDeConstruccion;
    }

    public void verificarPrerequisito(Mapa mapa) {
    }

    public boolean esPrerequisito(Unidad unidad){
        return unidad.permiteCrear(this);
    }

    public boolean esPrerequisito(Construccion construccion){
        return construccion.permiteConstruir(this);
    }


    public int obtenerVida() {return vida.vidaActual(); }


    public void regenerarVida(){
        vida.regenerarSalud(10);
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
        throw new NoHayMoho();
    }

    @Override
    public void esPosibleConstruirEn(ConMoho moho) {

    }

    @Override
    public void esPosibleConstruirEn(SinTerreno nada) {
        throw new NoHayMoho();
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
