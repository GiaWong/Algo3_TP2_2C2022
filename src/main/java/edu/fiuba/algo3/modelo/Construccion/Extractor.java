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
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.ArrayList;
import java.util.List;

public class Extractor extends ConstruccionZerg implements RefineriaGas{

    private final List<Zangano> zanganos = new ArrayList<>();

    public Extractor(){
        costoMineral = 100;
        costoGas = 0;
        vida = new Vida(750);
        tiempoConstruccion = 6;
    }
    public boolean esPrerequisito(Construccion construccion){
        return false;
    }

    public void verificarPrerequisito(Mapa mapa) {
    }

    public Extractor(int tiempoDeConstruccion){
        costoMineral = 100;
        costoGas = 0;
        vida = new Vida(750);
        tiempoConstruccion = tiempoDeConstruccion;
    }

    public void agregarZangano(Zangano unZangano) throws EdificioNoEstaOperativo, NoSePuedeAgregarOtroZangano {

        verificarEdificioOperativo();
        if (zanganos.size() < 3){
            zanganos.add(unZangano);
        } else {
            throw new NoSePuedeAgregarOtroZangano();
        }
    }

    public int obtenerVida() {return vida.vidaActual(); }

    @Override
    public int recolectar(Volcan volcan) throws EdificioNoEstaOperativo, FaltaUnZanganoParaRecolectar{
        verificarEdificioOperativo();
        if (!zanganos.isEmpty() && estaDisponible()) {
            return volcan.recolectar(zanganos.size() * 10);
        } else {
            throw new FaltaUnZanganoParaRecolectar();
        }
    }

    @Override
    public void avanzarTurno(Mapa mapa) {
        construir();
        regenerarVida();
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

    }

    @Override
    public void esPosibleConstruirEn(NodoMineral nodoMineral) {
        throw new ErrorEsteEdificioSoloSeConstruyeEnUnRecurso();
    }

    @Override
    public void esPosibleConstruirEn(SinRecurso sinRecurso) {
        throw new ErrorEsteEdificioSoloSeConstruyeEnUnRecurso();
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

    public boolean hayLarvaParaEvolucionar(){
        return false;
    }

    public boolean esPrerequisito(Unidad unidad){
        return false;
    }


}
