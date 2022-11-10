package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import java.util.List;
import java.util.ArrayList;


public class Criadero extends Construccion {

    private final int TIEMPO_CONSTRUCCION = 4;

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

    public void evolucionar(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            larvas.remove(i);
        }
    }

    public int obtenerCantidadLarvas() {
        return larvas.size();
    }

    public void ampliarRadioMoho(){
        if(turnosExpansion <= 0){
            moho.ampliarRadio();
            turnosExpansion = 2;
        }
    }

    @Override
    public boolean estaDisponible() {
        return false;
    }

    @Override
    public void avanzarTurno(int i){
        tiempoEnConstruccion += i;
        turnosExpansion -=i;
        // this.larva.agreegarMasLarvas(i);
        this.ampliarRadioMoho();

    }


    public void recibeDanio(int i) {
    }

    public int obtenerVida() {
        return 0;
    }
}
