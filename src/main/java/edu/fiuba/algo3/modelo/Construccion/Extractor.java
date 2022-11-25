package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Exception.ErrorEsteEdificioSoloSeConstruyeEnUnRecurso;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.ArrayList;
import java.util.List;

public class Extractor extends ConstruccionZerg{

    private int Vida_Total = 750;

    private List<Zangano> zanganos = new ArrayList<Zangano>();

    private RefineriaGas refineria;

    public Extractor(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = Vida_Total;
        tiempoConstruccion = 6;
    }
    public void agregar(Zangano unZangano){
        if (this.estaDisponible() && zanganos.size() < 3){
            zanganos.add(unZangano);
        } else {
            //Lanzar un error o algo
        }
    }

    public void recibeDanio(int cant) {
        vida  -= cant;
    }

    public int obtenerVida() {return vida; }

    public void regenerarVida(){
        if(vida <= (Vida_Total-10)){
            vida += 10;
        }
    }
    public int recolectar(Volcan volcan) {
        if (this.estaDisponible()) {
            return volcan.recolectar(zanganos.size() * 10);
        }
        return 0;
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();

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

}
