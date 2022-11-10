package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import java.util.List;
import java.util.ArrayList;

public class Criadero extends Construccion {

    private List<Larva> larvas = new ArrayList<Larva>();
    private int tiempoEnConstruccion = 0, turnosExpansion = 2;
    private  Moho moho;

    public Criadero() {
        super();
        crearLarvas();
    }

    private void crearLarvas(){
        for(int i = 0; i < 3; i++){
            larvas.add(new Larva());
        }
    }

    public boolean criaderoLleno(){
        return (larvas.size() == 3);
    }

    public void evolucionar(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            larvas.remove(i);
        }
    }

    public int obtenerCantidadLarvas() {
        return larvas.size();
    }


    @Override
    public void avanzarTurno(int i){
        tiempoEnConstruccion += i;
        turnosExpansion -=i;
        if(this.criaderoLleno()){
            larvas.add(new Larva());
        }

    }

    public int radioMoho() {
        return this.moho.obtenerRadio();
    }

    public boolean sePuedeConstruir(boolean hayVolcan, boolean hayNodoMineral){
        return (!hayVolcan && !hayNodoMineral);
    }

    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return true;
    }


    public void recibeDanio(int i) {
    }

    public int obtenerVida() {
        return 0;
    }
}