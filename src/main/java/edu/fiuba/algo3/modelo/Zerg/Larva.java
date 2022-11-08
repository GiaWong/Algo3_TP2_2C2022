package edu.fiuba.algo3.modelo.Zerg;

public class Larva {
    private final int MaximoLarvasPorTurno = 3;
    private int cantidadLarva;
    public Larva(int cantidadInicial) {
        this.cantidadLarva = cantidadInicial;
    }

    public void restarCantidadLarva(int cantidadZangano) {
        this.cantidadLarva = this.cantidadLarva - cantidadZangano;
    }
    public int getCantidad (){
        return this.cantidadLarva;
    }

    public void agreegarMasLarvas(int cantidadTurno) {

        this.cantidadLarva = this.cantidadLarva + (cantidadTurno * MaximoLarvasPorTurno);
    }
}
