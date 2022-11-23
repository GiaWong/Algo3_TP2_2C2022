package edu.fiuba.algo3.modelo.Construccion;

public class Moho implements Radio{
    private int radio;
    private int tiempo;
    public Moho(int unRadio, int unTiempo){
        this.radio = unRadio;
        this.tiempo = unTiempo;

    }
    @Override
    public void ampliarRadio(int tiempoAmpliacion, int unradio) {
        this.tiempo = tiempoAmpliacion;
        this.radio = unradio;

        if (this.tiempo == 0) {
            this.radio++;
            this.tiempo = 2;
        }

    }
    public int obtenerRadio(){
        return this.radio;
    }
}
