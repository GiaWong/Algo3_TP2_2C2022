package edu.fiuba.algo3.modelo.Acciones;

public class Escudo {

    protected int escudo;
    protected int escudoMaximo;

    public Escudo(int vidaEscudo){
        escudo = vidaEscudo;
        escudoMaximo = vidaEscudo;
    }

    public void inflijirDanio(int danio, Vida vida){

        escudo -= danio;
        if (escudo <= 0){
            int danioNuevo = (-1) * escudo;
            vida.inflijirDanio(danioNuevo);
            escudo = 0;
        }
    }

    public boolean estaVivo(){
        return escudo > 0;
    }

    public void regenerarEscudo(int regeneracion){
        escudo += regeneracion;
        if(escudo > escudoMaximo){
            escudo = escudoMaximo;
        }
    }

    public int escudoActual(){
        return escudo;
    }
}
