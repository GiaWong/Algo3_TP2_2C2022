package edu.fiuba.algo3.modelo.Unidades;

import java.util.ArrayList;
import java.util.List;

public class Guardian extends Unidad{
    private int tiempoConstruccion;
    private int rango;
    private Superficie superficie;
    private List<Integer> costos = new ArrayList<>();

    public Guardian(){
        vida = new Vida(100);
        tiempoConstruccion = 4;
        rango = 10;
        costos.add(50);
        costos.add(100);
        superficie = new Aire();
        defendible =new AtaqueTierra(25);
        ;
    }

    @Override
    public void modificarEstadisticas(int danio) {
        //vida -= danio;

    }
}
