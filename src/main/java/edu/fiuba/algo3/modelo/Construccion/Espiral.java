package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.ArrayList;
import java.util.List;

public class Espiral extends ConstruccionZerg {

    private ConstruccionZerg preRequisito = new Guarida();

    private Mutalisco zerg;

    private ArrayList<Larva> larvas = new ArrayList<>();

    public Espiral(){
        costos.add(150); //esto es para Mineral
        costos.add(100); //esto es para Gas
        vida = new Vida(1300);
        tiempoConstruccion = 10;
    }

    public Espiral(int tiempoDeConstruccion){
        costos.add(150); //esto es para Mineral
        costos.add(100); //esto es para Gas
        vida = new Vida(1300);
        tiempoConstruccion = tiempoDeConstruccion;
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
        vida.regenerarSalud(5);
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

    public void agregarLarva(Larva larva){
        larvas.add(larva);
    }

    public Unidad crearUnidad(){ //Nose si pasarle por parametro la casilla y que la misma agregue la unidad (y que sea un metodo void)
        //return creacion.crearMutalisco();
        return null;
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

    @Override
    public void aumentarSuministro(Suministro suministro) {

    }


}
