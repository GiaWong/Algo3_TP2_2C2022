package edu.fiuba.algo3.modelo.ConstruccionProtoss;

import edu.fiuba.algo3.modelo.Construccion.Energia;

public class Pilon extends ConstruccionProtoss{

    private int radio = 3;
    private Energia energia= new Energia(3, 0);

    public Pilon(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = 300;
        escudo = 300;
        tiempoConstruccion = 5 ;
    }
    @Override
    public void construir() {
        tiempoConstruccion--;
    }


    public void ampliarRadio() {
        energia.ampliarRadio(0,radio);
    }

    public int obtenerRadio() {
        return energia.obtenerRadio();
    }
}
