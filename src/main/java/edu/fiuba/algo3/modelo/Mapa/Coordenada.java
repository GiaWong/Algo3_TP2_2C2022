package edu.fiuba.algo3.modelo.Mapa;

public class Coordenada {

    private int fila;
    private int columna;

    public Coordenada(int unaFila, int unaColumna){
        fila = unaFila;
        columna = unaColumna;
    }

    public boolean esIgual(Coordenada otraCoord){
        return (otraCoord.tieneMismaFilaColumna(fila, columna));
    }

    public boolean tieneMismaFilaColumna(int unaFila, int unaCol){
        return (fila == unaFila && columna == unaCol);
    }
}
