package edu.fiuba.algo3.controlador.mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class ControladorMapa {
    private int base;
    private int altura;
    private Mapa mapa;
    private Coordenada coordenada;
    public ControladorMapa(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.mapa = new Mapa(base, altura);
    }


    /**
     * Hay que vincular con el modelo!!!
     * Tengo las coordenadas (base y altura) y tengo la accion a realizar (atacar, construir, etc..)
     * */
    public void ejecutarAtaque(int unaAltura, int unaBase) {
        System.out.print("\tSe ejecuta un Ataque en Altura: " + unaAltura +" y Base: " + unaBase +"\n");
    }

    public void ejecutarCreacion(int unaAltura, int unaBase, Construccion tipoConstruccion) {
        System.out.print("\tSe ejecuta una Creacion en Altura: " + unaAltura +" y Base: " + unaBase +"\n");
    }

    public void ejecutarExtraer(int unaAltura, int unaBase) {
        System.out.print("\tSe ejecuta una Extraccion en Altura: " + unaAltura +" y Base: " + unaBase +"\n");
    }

    public void ejecutarConstruir(int unaAltura, int unaBase) {
        System.out.print("\tSe ejecuta una Construcion en Altura: " + unaAltura +" y Base: " + unaBase +"\n");
    }
}
