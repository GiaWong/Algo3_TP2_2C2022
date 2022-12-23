package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.*;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.*;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

public class  Asimilador extends ConstruccionProtoss implements RefineriaGas {

    public Asimilador(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(450);
        escudo = new Escudo(450);
        tiempoConstruccion =6;
    }

    public Asimilador(int tiempoDeConstruccion){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(450);
        escudo = new Escudo(450);
        tiempoConstruccion = tiempoDeConstruccion;
    }

    public boolean esPrerequisito(Construccion construccion){
        return false;
    }

    public void verificarPrerequisito(Mapa mapa) {
    }

    public void regenerarEscudo(){
        escudo.regenerarEscudo(10);
    }

    public int obtenerEscudo() {return escudo.escudoActual(); }

    public int obtenerVida() { return vida.vidaActual(); }

    @Override
    public void avanzarTurno(Mapa mapa) {
        this.regenerarEscudo();
        this.construir();
    }

    public void permiteConstruirConUnidad(Unidad unidad){

    }

    public void permiteConstruirConUnidad(Zangano zangano){

    }

    public void esPosibleAgregarUnidad(Unidad unaUnidad){

    }


    @Override
    public boolean permiteConstruir(Construccion construccion){
        return false;
    }

    public boolean esPrerequisito(Unidad unidad){
        return false;
    }

    public boolean hayLarvaParaEvolucionar(){
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
    public int recolectar(Volcan volcan) throws EdificioNoEstaOperativo{
        verificarEdificioOperativo();
        return volcan.recolectar(20);
    }

    @Override
    public void esPosibleConstruirEn(Volcan volcan) {}

    @Override
    public void esPosibleConstruirEn(NodoMineral nodoMineral) {
        throw new NoSePuedeConstruirEsteEdificioSobreUnRecurso();
    }

    @Override
    public void esPosibleConstruirEn(SinTerreno nada) { throw new NoEstaEnergizado(); }

    @Override
    public void esPosibleConstruirEn(ConEnergia energia){}

    @Override
    public void esPosibleConstruirEn(ConMoho moho){
        throw new NoEstaEnergizado();
    }

    @Override
    public void esPosibleConstruirEn(SinRecurso sinRecurso) {
        throw new ErrorEsteEdificioSoloSeConstruyeEnUnRecurso();
    }

    public void destruir(Mapa mapa){
        mapa.disminuirEdificioProtoss();
    }

    @Override
    public void aumentarSuministro(Suministro suministro) {

    }
}
