package edu.fiuba.algo3.modelo.Construccion;

public class Energia implements Radio{
    private int radio;
    private int tiempo;
    public Energia(int unRadio, int tiempoAmpliacion){
        this.radio = unRadio;
        this.tiempo = tiempoAmpliacion;

    }
    @Override
    public void ampliarRadio(int tiempoAmpliacion, int radio) {

    }
    public int obtenerRadio(){
        return this.radio;
    }
}
