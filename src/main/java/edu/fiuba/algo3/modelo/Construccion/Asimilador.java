package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.*;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.*;

public class  Asimilador extends ConstruccionProtoss implements RefineriaGas {

    public Asimilador(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(450);
        escudo = new Escudo(450);
        tiempoConstruccion =6;
    }

    public Asimilador(int tiempoDeConstruccion){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(450);
        escudo = new Escudo(450);
        tiempoConstruccion = tiempoDeConstruccion;
    }

    public void regenerarEscudo(){
        escudo.regenerarEscudo(10);
    }

    public int obtenerEscudo() {return 0; }

    public int obtenerVida() { return 0; }

    @Override
    public void avanzarTurno() {
        this.regenerarEscudo();

    }
    @Override
    public int recolectar(Volcan volcan) {
        if (this.estaDisponible()) {
            return volcan.recolectar(20);
        }
        return 0;
    }

    @Override
    public void esPosibleConstruirEn(Volcan volcan) {}

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
        throw new ErrorEsteEdificioSoloSeConstruyeEnUnRecurso();
    }

    @Override
    public void aumentarSuministro(Suministro suministro) {

    }
}
