package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Unidades.Zerling;

import java.util.ArrayList;
import java.util.List;

public class ReservaProduccion extends ConstruccionZerg {

    private int Vida_Total = 1000;
    private Zerling zerling;

    public ReservaProduccion(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = Vida_Total;
        tiempoConstruccion = 12;
    }

    public void crearZerling(){

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

    public void conZerg(Zerling zerg) { //Deberia ser el crearZerling()
        this.zerling = zerg;
        for(int i =0 ; i<=1;i++) {
            this.zerling.construir();
        }
    }

    public Zerling obtenerZerg() {
        return this.zerling;
    }
}
