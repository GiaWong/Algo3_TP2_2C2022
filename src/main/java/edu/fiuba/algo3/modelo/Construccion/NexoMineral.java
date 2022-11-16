package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;

import java.util.ArrayList;
import java.util.List;

public class NexoMineral implements RefineriaMineral {

    private int Vida_Total = 250;
    private int Escudo_total = 250;
    private int vida  ;
    private int escudo ;
    private int tiempoConstruccion = 4 ;
    private List<Integer> costos = new ArrayList<>();

    public NexoMineral(){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = Vida_Total;
        escudo =Escudo_total;
    }
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    public void regenerarEscudo(){
        if(escudo < (Escudo_total)){
            escudo += 10;
        }
    }

    public int obtenerEscudo() {return escudo; }
    @Override
    public void recibeDanio(int cant) {
        escudo-= cant;
        if (escudo<0){
            vida += escudo;
            escudo = 0;
        }


    }
    @Override
    public int obtenerVida() {return vida; }

    @Override
    public void avanzarTurno() {
        this.regenerarEscudo();

    }

    @Override
    public List<Integer> costo() {
        return costos;
    }

    @Override
    public int recolectar(NodoMineral nodo) {
       if (this.estaDisponible()) {
            return nodo.recolectar(20);
        }
       return 0;
    }
}
