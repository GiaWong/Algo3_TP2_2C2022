package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
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

    private Creador creacion = new CrearUnidad();
    private Zerling zerling;

    public ReservaProduccion(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(1000);
        tiempoConstruccion = 12;
    }

    public Unidad crearUnidad(){
        return creacion.crearZerling();
    }

    public int obtenerVida() {return 0; }

    public void regenerarVida(){
        /*
        if(vida < (Vida_Total)){
            vida += 10;
        }

         */
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();

    }

    public void conZerg(Zerling zerg) { //Deberia ser el crearZerling()
        this.zerling = zerg;
        for(int i =0 ; i<=1;i++) {
            this.zerling.construir();
        }
    }

    public Zerling obtenerZerg() {
        return this.zerling;
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
}
