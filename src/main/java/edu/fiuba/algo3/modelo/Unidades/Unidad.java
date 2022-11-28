package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Unidad {

    protected Vida vida;

    protected int tiempoConstruccion;

    protected Superficie superficie;

    protected Defensa defensa = new Detectable();

    protected List<Integer> costos = new ArrayList<>();

    public void construir() {
        tiempoConstruccion--;
    }

    public int vida() {return vida.vidaActual();}

    public List<Integer> costo() {
        return costos;
    }

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    public abstract void modificarEstadisticas(int danio); //Este metodo no deberia existir

    public abstract void recibirDanio(Danio danio);

    public boolean esPosibleSerAtacadoPor(Atacador ataque){
        return ataque.esPosibleAtacar(superficie);
    }

    public  void detectado(){
        return;
    }


}
