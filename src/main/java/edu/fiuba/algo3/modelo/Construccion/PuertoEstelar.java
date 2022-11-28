package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.NoEstaEnergizado;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

import java.util.List;

public class PuertoEstelar extends ConstruccionProtoss {

    private ConstruccionProtoss preRequisito = new Acceso();

    private Creador creacion;

    public PuertoEstelar(){
        costos.add(150); //esto es para Mineral
        costos.add(150); //esto es para Gas
        vida = new Vida(600);
        escudo = new Escudo(600);
        tiempoConstruccion = 10;
    }

    public boolean preRequisito(List<Construccion> lista){
        if(lista!=null) {
            for(int i =0; i<lista.size();i++){
                if(lista.get(i).getClass().equals(preRequisito.getClass())){
                    return true;
                }
            }
        }
        return false;
    }


    public void regenerarEscudo(){
        escudo.regenerarEscudo(10);
    }

    public int obtenerEscudo() {return 0; }

    public int obtenerVida() {return 0; }

    @Override
    public void avanzarTurno() {
        this.regenerarEscudo();

    }

    public Unidad crearUnidad(){
        return creacion.crearScout();
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
}
