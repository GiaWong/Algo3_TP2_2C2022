package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Exception.NoHayMoho;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;

import java.util.ArrayList;
import java.util.List;

public class Criadero extends ConstruccionZerg {

    private int Vida_Total = 500;
    private int larvas = 3;
    private int tiempoAmpliacion = 2;
    //private int radio = 5;

    private Creador creacion;

    private int radio; // Este radio no deberia ir

    private Moho radio;

    public Criadero(){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = Vida_Total;
        tiempoConstruccion = 4;
    }
    public void evolucionar() {
        larvas--;
    }
    public void ampliarRadio() {
        if (tiempoAmpliacion == 0) {
            radio++;
            tiempoAmpliacion =2;
        }
    }
    public void regenerarVida(){
        if(vida < (Vida_Total)){
            vida += 10;
        }
    }

    public int obtenerVida() {return vida; }
    public int obtenerRadio(){
        return radio;
    }
    public int obtenerCantidadLarvas(){
        return larvas;
    }


    public void recibeDanio(int cant) {
        vida -= cant;
    }

    @Override
    public void avanzarTurno(){
        if(larvas<3){
            larvas++;
        }
        tiempoAmpliacion--;
        this.regenerarVida();
        this.ampliarRadio();

    }

    public void esPosibleConstruirEnRecurso(Recurso recurso){
        throw new NoSePuedeConstruirEsteEdificioSobreUnRecurso();
    }

    public void esPosibleConstruirEn(ConEnergia energia){
        throw new NoHayMoho();

    }

    public void esPosibleConstruirEn(ConMoho moho){

    }
}
