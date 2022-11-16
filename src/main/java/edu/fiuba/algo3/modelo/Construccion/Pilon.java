package edu.fiuba.algo3.modelo.Construccion;


import java.util.ArrayList;
import java.util.List;

public class Pilon implements ConstruccionConRadio {

    private int Vida_Total = 300;
    private int Escudo_total = 300;

    private int vida ;
    private int escudo ;
    private int tiempoConstruccion = 5 ;
    private List<Integer> costos = new ArrayList<>();

    public Pilon(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = Vida_Total;
        escudo =Escudo_total;
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
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }

    @Override
    public List<Integer> costo() {
        return costos;
    }

    @Override
    public void ampliarRadio() {

    }
}
