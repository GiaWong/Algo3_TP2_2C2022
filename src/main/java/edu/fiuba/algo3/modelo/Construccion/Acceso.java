package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Exception.NoEstaEnergizado;
import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;

import java.util.ArrayList;
import java.util.List;

public  class Acceso extends ConstruccionProtoss{

    private int Vida_Total = 500;
    private int Escudo_total = 500;

    private Creador creacion;

    public Acceso(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = Vida_Total;
        escudo = Escudo_total;
        tiempoConstruccion = 8;
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

    public void esPosibleConstruirEnRecurso(Recurso recurso){
        throw new NoSePuedeConstruirEsteEdificioSobreUnRecurso();
    }

    public void esPosibleConstruirEn(ConEnergia energia){

    }

    public void esPosibleConstruirEn(ConMoho moho){
        throw new NoEstaEnergizado();
    }


    public void crearZealot(){ //Deberia ser un crearUnidad() solo?

    }

    public void crearDragon(){

    }
}
