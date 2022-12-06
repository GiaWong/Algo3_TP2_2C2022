package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public class Coordenada {

    private final int fila;
    private final int columna;

    public Coordenada(int unaFila, int unaColumna){
        fila = unaFila;
        columna = unaColumna;
    }

    public boolean estaEnRango(Coordenada otraCoordenada, int rango){
        int filaMasRango = fila + rango;
        int filaMenosRango = fila - rango;
        int columnaMasRango = columna + rango;
        int columnaMenosRango = columna - rango;

        return otraCoordenada.estaDentroDe(filaMasRango, filaMenosRango, columnaMasRango, columnaMenosRango);

    }
    //  filaMenosRango <= fila <= filaMasRango,  columnaMenosRango <= columna <= columnaMasRango
    public boolean estaDentroDe(int filaMasRango, int filaMenosRango, int colMasRango, int colMenosRango){
        return (filaMasRango >= fila && filaMenosRango <= fila && colMasRango >= columna && colMenosRango <= columna);
    }

    public int calculoFilaSuperior(int radio, int altura) {
        int calculo = fila + radio;
        return Math.min(calculo, altura);
    }

    public int calculoFilaInferior(int radio, int base) {
        int calculo = fila - radio;
        return Math.max(calculo, 0);
    }

    public int calculoColumnaSuperior(int radio, int altura) {
        int calculo = columna + radio;
        return Math.min(calculo, altura);
    }

    public int calculoColumnaInferior(int radio, int base) {
        int calculo = columna - radio;
        return Math.max(calculo, 0);
    }

    public Casilla buscar(Casilla[][] mapa) {
        return mapa[fila][columna];
    }

    public void setTerreno(Casilla[][] mapa, ConMoho conMoho) {
        mapa[fila][columna].setTerreno(conMoho);
    }
}
