package edu.fiuba.algo3.modelo.Unidades;

public class Escudo {

    protected int Escudo;
    protected int EscudoMaximo;

    public Escudo(int vida){
        Escudo = vida;
        EscudoMaximo = vida;

    }

    public void inflijirDanio(int danio){
        Escudo-= danio;
    }

    public boolean estaVivo(){
        return Escudo>0;
    }

    public void regenerarSalud(int regeneracion){
        Escudo += regeneracion;
        if(Escudo>EscudoMaximo){
            Escudo=EscudoMaximo;
        }
    }

    public int escudoActual(){
        return Escudo;
    }
}
