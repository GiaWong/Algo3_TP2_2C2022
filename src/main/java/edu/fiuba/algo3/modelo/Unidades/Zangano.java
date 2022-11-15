package edu.fiuba.algo3.modelo.Unidades;

public class Zangano implements Unidad{
    private int cantidad;

    private int tiempoDeConstruccion = 1;
    public int getCantidad (){
        return this.cantidad;
    }

    public int extraerMineral() {
        return 10;
    }

    @Override
    public void construir() {

    }
}
