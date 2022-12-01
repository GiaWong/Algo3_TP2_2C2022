package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zerling;

import java.util.ArrayList;
import java.util.List;

public class ReservaProduccion extends ConstruccionZerg {

    private ArrayList<Larva> larvas = new ArrayList<>();

    public ReservaProduccion(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(1000);
        tiempoConstruccion = 12;
    }

    public void agregarLarva(Larva larva){
        larvas.add(larva);
    }

    public Unidad crearZerling() throws EdificioNoEstaOperativo {

        verificarEdificioOperativo();
        //return creacion.crearZerling();
        return null;
    }

    public int obtenerVida() {return vida.vidaActual(); }


    public void regenerarVida(){
        vida.regenerarSalud(10);
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();
        this.construir();
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
}
