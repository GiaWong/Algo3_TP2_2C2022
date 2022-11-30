package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Unidades.Unidad;

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

    public boolean estaEnRango(Coordenada otraCoordenada, int rango){
        int filaMasRango = fila + rango;
        int filaMenosRango = fila - rango;
        int columnaMasRango = columna + rango;
        int columnaMenosRango = columna - rango;

        return otraCoordenada.estaDentroDe(filaMasRango, filaMenosRango, columnaMasRango, columnaMenosRango);

    }

    public boolean estaDentroDe(int filaMasRango, int filaMenosRango, int colMasRango, int colMenosRango){
        return (filaMasRango <= fila || filaMenosRango >= fila || colMasRango <= columna || colMenosRango >= columna);
    }

    public int calculoFilaSuperior(int radio, int altura) {
        int calculo = fila + radio;
        return Math.min(calculo, altura);
    }

    public int calculoFilaInferior(int radio, int base) {
        int calculo = fila - radio;
        return Math.max(calculo, base);
    }

    public int calculoColumnaSuperior(int radio, int altura) {
        int calculo = columna + radio;
        return Math.min(calculo, altura);
    }

    public int calculoColumnaInferior(int radio, int base) {
        int calculo = columna - radio;
        return Math.max(calculo, base);
    }

    public Casilla buscar(Casilla[][] mapa) {
        return mapa[fila][columna];
    }
}
