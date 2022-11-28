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
import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

import java.util.List;

public class Espiral extends ConstruccionZerg {

    private ConstruccionZerg preRequisito = new Guarida();

    private Mutalisco zerg;

    private Creador creacion;

    public Espiral(){
        costos.add(150); //esto es para Mineral
        costos.add(100); //esto es para Gas
        vida = new Vida(1300);
        tiempoConstruccion = 10;
    }
    public boolean preRequisito(List<Construccion> lista){ //Hay que cambiar
        if(lista!=null) {
            for(int i =0; i<lista.size();i++){
                if(lista.get(i).getClass().equals(preRequisito.getClass())){
                    return true;
                }
            }
        }
        return false;
    }

    public int obtenerVida() {return 0; }

    public void regenerarVida(){
        /*
        if(vida <= (Vida_Total-10)){
            vida += 10;
        }

         */
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();

    }

    public void conZerg(Mutalisco mutalisco) { //Esto seria el crearMutalisco()
        this.zerg = mutalisco;
        for(int i =0 ; i<=7;i++) {
            this.zerg.construir();
        }
    }

    public Unidad crearUnidad(){
        return creacion.crearMutalisco();
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
        throw new NoHayMoho();
    }
    @Override
    public void esPosibleConstruirEn(ConEnergia energia){
        throw new NoHayMoho();
    }

    @Override
    public void esPosibleConstruirEn(ConMoho moho){

    }


}
