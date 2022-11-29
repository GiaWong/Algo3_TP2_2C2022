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

public  class Acceso extends ConstruccionProtoss{

    private Creador creacion;

    public Acceso(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(500);
        escudo = new Escudo(500);
        tiempoConstruccion = 8;
        creacion = new CrearUnidad();
    }

    public Acceso(int tiempoDeConstruccion){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(500);
        escudo = new Escudo(500);
        tiempoConstruccion = tiempoDeConstruccion;
        creacion = new CrearUnidad();
    }

    public void regenerarEscudo(){
        escudo.regenerarEscudo(10);
    }

    public void crearUnidad(){

    }

    public int obtenerEscudo() {return 0; }

    public int obtenerVida() {return 0; }

    @Override
    public void avanzarTurno() {
        this.regenerarEscudo();

    }

    @Override
    public void esPosibleConstruirEn(Volcan volcan){
        throw new NoSePuedeConstruirEsteEdificioSobreUnRecurso();
    }

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

    }

    @Override
    public void aumentarSuministro(Suministro suministro) {

    }

}
