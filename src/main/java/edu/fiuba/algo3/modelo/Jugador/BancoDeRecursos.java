package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.ArrayList;
import java.util.List;

public class BancoDeRecursos {
    private int bancoMineral = 200;
    private  int bancoGasvespeno = 0;

    public void comprarConstuccion(Construccion construccion) {
        List<Integer>costos = construccion.costo();
        int mineral = bancoMineral - costos.get(0);
        int gas =  bancoGasvespeno - costos.get(1);
        if(!(bancoGasvespeno<0)&&!(bancoMineral<0)){
            System.out.println("edu");
        }

    }
}
