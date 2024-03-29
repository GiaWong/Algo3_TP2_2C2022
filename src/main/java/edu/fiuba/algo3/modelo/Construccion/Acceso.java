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
import edu.fiuba.algo3.modelo.Unidades.Dragon;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import edu.fiuba.algo3.modelo.Unidades.Zealot;

public  class Acceso extends ConstruccionProtoss{

    public Acceso() {
        costoMineral = 150;
        costoGas = 0;
        vida = new Vida(500);
        escudo = new Escudo(500);
        tiempoConstruccion = 8;
        energizada = true;
    }

    public Acceso(int tiempoDeConstruccion){
        costoMineral = 150;
        costoGas = 0;
        vida = new Vida(500);
        escudo = new Escudo(500);
        tiempoConstruccion = tiempoDeConstruccion;
        energizada = true;
    }

    public boolean esPrerequisito(Construccion construccion){
        return false;
    }

    public boolean esPrerequisito(Unidad unidad){
        return unidad.permiteCrear(this);
    }

    public boolean hayLarvaParaEvolucionar(){
        return false;
    }
    public void verificarPrerequisito(Mapa mapa) {
    }

    public int obtenerVida() {return vida.vidaActual(); }

    @Override
    public void avanzarTurno(Mapa mapa) {
        if(energizada){
            construir();
            regenerarEscudo();
        }
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
    public void esPosibleConstruirEn(SinTerreno nada) {
        throw new NoEstaEnergizado();
    }

    @Override
    public void esPosibleConstruirEn(ConEnergia energia){}

    @Override
    public void esPosibleConstruirEn(ConMoho moho){
        throw new NoEstaEnergizado();
    }

    @Override
    public void esPosibleConstruirEn(SinRecurso sinRecurso) {}

    @Override
    public void aumentarSuministro(Suministro suministro) {}

    public void destruir(Mapa mapa){
        mapa.disminuirEdificioProtoss();
    }

    public void esPosibleAgregarUnidad(Unidad unaUnidad){

    }

}
