package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
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

import java.util.ArrayList;

public class Criadero extends ConstruccionZerg{

    private final ArrayList<Larva> larvas = new ArrayList<>();

    private int radio;

    private int turnos = 0;

    public Criadero(){
        costoMineral = 50;
        costoGas = 0;
        vida = new Vida(500);
        tiempoConstruccion = 4;
        radio = 5;
        larvas.add(new Larva());
        larvas.add(new Larva());
        larvas.add(new Larva());

    }

    public Criadero(Vida vida1){
        costoMineral = 50;
        costoGas = 0;
        vida = vida1;
        tiempoConstruccion = 4;
        radio = 5;
        larvas.add(new Larva());
        larvas.add(new Larva());
        larvas.add(new Larva());

    }

    public Criadero(int turnosParaEstarOperativo){
        costoMineral = 50;
        costoGas = 0;
        vida = new Vida(500);
        tiempoConstruccion = turnosParaEstarOperativo;
        radio = 5;
        larvas.add(new Larva());
        larvas.add(new Larva());
        larvas.add(new Larva());

    }

    public Unidad crearZangano(BancoDeRecursos bancoDeRecursos) throws EdificioNoEstaOperativo {
        verificarEdificioOperativo();
        Larva larva = larvas.get(0);
        larvas.remove(0);
        Unidad zangano = larva.crearZangano();
        bancoDeRecursos.comprar(zangano); //Esto puede ir en un futuro de distinta manera
        return zangano;
    }
    public Unidad crearZerling(BancoDeRecursos bancoDeRecursos) throws EdificioNoEstaOperativo{
        verificarEdificioOperativo();
        Larva larva = larvas.get(0);
        larvas.remove(0);
        Unidad zerling = larva.crearZerling();
        bancoDeRecursos.comprar(zerling); //Esto puede ir en un futuro de distinta manera
        return zerling;
    }
    
    public Unidad crearHidralisco() {
        return null;
    }
    
    public Unidad crearMutalisco() {
        return null;
    }

    public boolean tieneMismaCantidadDeLarvas(int cantidadDeLarvas) {
        return larvas.size() == cantidadDeLarvas;
    }

    public int obtenerVida() {return vida.vidaActual(); }

    public boolean esPrerequisito(Unidad unidad){
        return unidad.permiteCrear(this);
    }

    public boolean hayLarvaParaEvolucionar(){
        if(larvas.size() > 0 ){
            larvas.remove(0);
            return true;
        } else {
            return false;
        }
    }


    public void esPosibleAgregarUnidad(Unidad unaUnidad){

    }

    public boolean esPrerequisito(Construccion construccion){
        return false;
    }

    public void verificarPrerequisito(Mapa mapa) {
    }

    private void infectarConMoho(Mapa mapa){
        mapa.setearRadio(coordenada,radio, new ConMoho());
    }

    private void expandirMoho(){ //Supuesto: se setea el moho siempre, mas alla de si esta el criadero o no
        if(turnos % 2 == 0){
            radio++;
        }
    }

    private void agregarLarva(){
        if(larvas.size() < 3){
            larvas.add(new Larva());
        }
    }

    @Override
    public void avanzarTurno(Mapa mapa){
        construir();
        expandirMoho();
        agregarLarva();
        regenerarVida();
        infectarConMoho(mapa);
        turnos++;
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

    public void destruir(Mapa mapa){
        mapa.disminuirEdificioZerg();
    }
}
