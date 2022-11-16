package edu.fiuba.algo3.modelo.Construccion;

import java.util.ArrayList;
import java.util.List;

public class ReservaProduccion implements ConstruccionNormal{

    private int Vida_Total = 1000;
    private int vida ;
    private int tiempoConstruccion = 12;
    private List<Integer> costos = new ArrayList<>();

    public ReservaProduccion(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida =Vida_Total;
    }

    public void evolucionar() {
    }

    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    @Override
    public void recibeDanio(int cant) {
        vida -= cant;
    }
    @Override
    public int obtenerVida() {return vida; }

    public void regenerarVida(){
        if(vida < (Vida_Total)){
            vida += 10;
        }
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();

    }

    @Override
    public boolean estaDisponible() { return (tiempoConstruccion<=0); }

    @Override
    public List<Integer> costo() {
        return costos;
    }

}
