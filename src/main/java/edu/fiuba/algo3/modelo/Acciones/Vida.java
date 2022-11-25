package edu.fiuba.algo3.modelo.Acciones;

public class Vida { //Esto podria usarse para Construccion tambien, deberia estar en otra carpeta
    protected int salud;
    protected int saludMaxima;

    public Vida(int vidaTotal){
        salud = vidaTotal;
        saludMaxima = vidaTotal;

    }

    public void inflijirDanio(int danio){
        salud -= danio;
    }

    public boolean estaVivo(){
        return salud >0;
    }

    public void regenerarSalud(int regeneracion){
        salud += regeneracion;
        if(salud > saludMaxima){
            salud = saludMaxima;
        }
    }

    public int vidaActual(){
        return salud;
    }

}
