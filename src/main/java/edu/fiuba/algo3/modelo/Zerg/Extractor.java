package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;

import java.util.ArrayList;
import java.util.List;


public class Extractor extends Construccion{

    private final int TIEMPO_CONSTRUCCION = 6;

    private final int GAS_POR_TURNO = 10;
    private int turnos;
    private int gasExtraido;

    private List<Zangano> zanganos = new ArrayList<>();



    public void avanzarTurno(int j) {

        this.turnos += j;
        if(vida<=750){
            vida = 750;
        }
        for(int i = 0; i < j; j++){

            this.recolectar();
        }
    }



    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }


    public void recibeDanio(int danio) {
        vida-= danio;
    }

    public  Extractor() {
        vida = 750;
        zanganos.clear();
    }



    public void cargarZerg(Zangano zangano) {
        zanganos.add(zangano);
    }

    public void recolectar() {
        gasExtraido += (GAS_POR_TURNO * zanganos.size());
    }


    public boolean sePuedeConstruir(boolean hayVolcan,boolean hayNodoMineral) {
        return (hayVolcan);
    }

    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return true;
    }


    public int gasRecolectado() {
        return 0;
    }
}
