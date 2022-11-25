package edu.fiuba.algo3.modelo.Unidades;

public class Vida { //Esto podria usarse para Construccion tambien, deberia estar en otra carpeta
    protected int Salud;
    protected int SaludMaxima;

    public Vida(int vida){
        Salud = vida;
        SaludMaxima = vida;

    }

    public void inflijirDanio(int danio){
        Salud -= danio;
    }

    public boolean estaVivo(){
        return Salud>0;
    }

    public void regenerarSalud(int regeneracion){
        Salud += regeneracion;
        if(Salud>SaludMaxima){
            Salud=SaludMaxima;
        }
    }

    public int vidaActual(){
        return Salud;
    }

}
