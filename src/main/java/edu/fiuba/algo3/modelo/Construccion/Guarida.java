package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEnEsteTerreno;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Hidralisco;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

import java.util.List;

public class Guarida extends ConstruccionZerg{

    private ConstruccionZerg preRequisito = new ReservaProduccion();
    private Unidad hidralisco = new Hidralisco();

    private Creador creacion;

    public Guarida(){
        costos.add(200); //esto es para Mineral
        costos.add(100); //esto es para Gas
        vida = new Vida(1250);
        tiempoConstruccion = 12;
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

    public int obtenerVida() {return 0; }

    public void regenerarVida(){
        vida.regenerarSalud(5);
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();

    }

    public Unidad crearUnidad(){
        return creacion.crearHidralisco();
    }

    public void construirUnidad() { //Esto seria el metodo de crearUnidad()

        this.hidralisco.construir();
    }

    public Unidad obtenerZerg() {
        return this.hidralisco;
    }

    @Override
    public void esPosibleConstruirEn(ConEnergia energia){
        throw new NoHayMoho();

    }
    @Override
    public void esPosibleConstruirEn(ConMoho moho){

    }

    @Override
    public void esPosibleConstruirEn(SinTerreno nada) {
        throw new NoSePuedeConstruirEnEsteTerreno();
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
    public void aumentarSuministro(Suministro suministro) {

    }
}
