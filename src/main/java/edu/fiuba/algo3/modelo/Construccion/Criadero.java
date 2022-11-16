package edu.fiuba.algo3.modelo.Construccion;


import java.util.ArrayList;
import java.util.List;

public class Criadero implements ConstruccionConRadio { //antees era ConstruccionNormal

    private int Vida_Total = 500;
    private int vida ;
    private int larvas = 3;
    private int tiempoConstruccion = 4;
    private int tiempoAmpliacion = 2;
    private int radio = 5;
    private List<Integer> costos = new ArrayList<>();

    public Criadero(){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = Vida_Total;
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
    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    @Override
    public void recibeDanio(int cant) {
        vida -= cant;
    }//recibeDanio creo que es mejoor nombre

    @Override
    public void avanzarTurno(){
        if(larvas<3){
            larvas++;
        }
        tiempoAmpliacion--;
        this.regenerarVida();
        this.ampliarRadio();

    }
    @Override
    public boolean estaDisponible() {
        return tiempoConstruccion<=0;
    }

    @Override
    public List<Integer> costo() {
        return costos;
    }
}
