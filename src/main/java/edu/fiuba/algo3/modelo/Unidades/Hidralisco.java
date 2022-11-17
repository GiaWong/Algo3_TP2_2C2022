package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.Construccion;

public class Hidralisco extends Unidad{

    private Guardian guardian;

    public Hidralisco(){
        vida = 80;
        tiempoConstruccion = 4;
        rango = 4;
        superficie = new Tierra();
        guardian = new Guardian();
        costos.add(75); //Esto es para Minerales
        costos.add(25); // Esto es para Gas
        danio=4;
    }

    @Override
    public void construir() {
        tiempoConstruccion --;
    }

    @Override
    public void recibirDanio(int danio) {

    }

    public void ataqueTierra(Construccion construccionEnemiga) {
        construccionEnemiga.recibeDanio(1);//cuanto daño recibe?
    }
}
