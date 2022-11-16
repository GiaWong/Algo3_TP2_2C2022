package edu.fiuba.algo3.modelo.Construccion;

import java.util.ArrayList;
import java.util.List;

public class PuertoEstelar implements ConstruccionNormal{

    private Construccion preRequisito = new Acceso();
    private int Vida_Total = 600;

    private int Escudo_total = 600;
    private int vida ;
    private int escudo ;
    private int tiempoConstruccion = 10;
    private List<Integer> costos = new ArrayList<>();

    public boolean PreRequisito(List<Construccion> lista){
        if(lista!=null) {
            for(int i =0; i<lista.size();i++){
                if(lista.get(i).getClass().equals(preRequisito.getClass())){
                    return true;
                }
            }
        }
        return false;
    }
    public PuertoEstelar(){
        costos.add(150); //esto es para Mineral
        costos.add(150); //esto es para Gas
        vida = Vida_Total;
        escudo = Escudo_total;
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
    public void evolucionar() {

    }
}
