package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

import java.util.List;

public class Zerling extends Unidad{

    public Zerling(){
        vida = 35;
        tiempoConstruccion = 2;
        rango = 1;
        superficie = new Tierra();
        costos.add(25); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
        danio=4;
    }

    @Override
    public void construir() {
        tiempoConstruccion --;
    }

    @Override
    public void recibirDanio(int danio) {


    }
    @Override
    public List<Integer> costo() {
        return costos;
    }

    /*public void ataqueTierra(Construccion construccionEnemiga) {
        construccionEnemiga.recibeDanio(4);//cuanto daño recibe?

    }*/

    public void ataqueTierra(Mapa mapa, int fila, int columna) {
    }
}
