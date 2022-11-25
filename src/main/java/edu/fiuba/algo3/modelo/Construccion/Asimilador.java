package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Exception.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.*;

public class  Asimilador extends ConstruccionProtoss {

    private int Vida_Total = 450;
    private int Escudo_total = 450;

    private RefineriaGas refineria;

    public Asimilador(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = Vida_Total;
        escudo =Escudo_total;
        tiempoConstruccion =6;
    }

    public void regenerarEscudo(){
        if(escudo < (Escudo_total)){
            escudo += 10;
        }
    }

    public int obtenerEscudo() {return escudo; }

    public void recibeDanio(int cant) {
        escudo-= cant;
        if (escudo<0){
            vida += escudo;
            escudo = 0;
        }
    }

    public int obtenerVida() {return vida; }

    @Override
    public void avanzarTurno() {
        this.regenerarEscudo();

    }

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

    public void esPosibleConstruirEn(ConEnergia energia){}

    public void esPosibleConstruirEn(ConMoho moho){
        throw new NoEstaEnergizado();
    }

    @Override
    public void esPosibleConstruirEn(SinRecurso sinRecurso) {
        throw new ErrorEsteEdificioSoloSeConstruyeEnUnRecurso();
    }
}
