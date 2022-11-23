package edu.fiuba.algo3.modelo.ConstruccionProtoss;

public  class Acceso extends ConstruccionProtoss {


    public Acceso(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = 500;
        escudo = 500;
        tiempoConstruccion = 8 ;
    }
    @Override
    public void construir() {
        tiempoConstruccion--;
    }


    public void evolucionar() {

    }
}
