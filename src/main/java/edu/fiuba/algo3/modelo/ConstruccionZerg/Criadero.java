package edu.fiuba.algo3.modelo.ConstruccionZerg;

import edu.fiuba.algo3.modelo.Construccion.Moho;

public class Criadero extends ConstruccionZerg {

    private int larvas = 3;
    private int tiempoAmpliacion = 2;
    private int radio = 5;
    private Moho moho = new Moho(radio, tiempoAmpliacion);


    public Criadero(){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        Vida_Total = 500;
        vida = Vida_Total;
        tiempoConstruccion = 4;
    }
    public void evolucionar() {
        larvas--;
    }

    /*public void ampliarRadio() {
        if (tiempoAmpliacion == 0) {
            radio++;
            tiempoAmpliacion =2;
        }
    }*/
    public void regenerarVida(){
        if(vida < (Vida_Total)){
            vida += 10;
        }
    }

    public int obtenerCantidadLarvas(){
        return larvas;
    }


    @Override
    public void avanzarTurno(){
        if(larvas<3){
            larvas++;
        }
        tiempoAmpliacion--;
        this.regenerarVida();
        //this.ampliarRadio();
        moho.ampliarRadio(tiempoAmpliacion,radio);

    }
    public int obtenerRadio(){
        return moho.obtenerRadio();
    }

}
