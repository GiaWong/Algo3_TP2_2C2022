package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.List;

public class BancoDeRecursos {
    private int bancoMineral = 200;
    private int bancoGasVespeno = 0;

    public void comprarConstuccion(Construccion construccion) {
        List<Integer>costos = construccion.costo();
        bancoMineral -= costos.get(0);
        bancoGasVespeno -= costos.get(1);
    }

    public boolean esPosibleComprar(Construccion construccion){
        List<Integer> costos = construccion.costo();
        int mineral = bancoMineral - costos.get(0);
        int gas =  bancoGasVespeno - costos.get(1);
        if((gas < 0) || (mineral < 0)){
            return false;
        }
        return true;
    }
}
