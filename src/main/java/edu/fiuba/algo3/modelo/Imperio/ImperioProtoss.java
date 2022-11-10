package edu.fiuba.algo3.modelo.Imperio;

import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;

import java.util.ArrayList;

public class ImperioProtoss {

    private int mineral = 100;
    private int gasVespeno = 100;
    //rivate List<Casilla> Columna = new ArrayList<>();

    public void nexoMineral(Mapa mapa, int i, int j) {
        if(mineral > 50) {
            NexoMineral nexo = new NexoMineral();
            mapa.agregar(nexo,i,j);
        }
    }

    public void pilon(Mapa mapa, int i, int i1) {
    }

    public void asimilador(Mapa mapa, int i, int i1) {
    }

    public void acceso(Mapa mapa, int i, int i1) {
    }

    public void puertoEstelar(Mapa mapa, int i, int i1) {
    }
}
