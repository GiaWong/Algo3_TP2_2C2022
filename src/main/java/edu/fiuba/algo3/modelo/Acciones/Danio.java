package edu.fiuba.algo3.modelo.Acciones;

public class Danio {

    private int danio;

    public Danio(int cant){
        danio = cant;
    }

    public void hacerDanio(Vida vida){
        vida.inflijirDanio(danio);
    }
    public void hacerDanio(Vida vida, Escudo escudo){
        escudo.inflijirDanio(danio, vida);
    }
}
