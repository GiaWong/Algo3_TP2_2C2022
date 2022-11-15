package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.ArrayList;
import java.util.List;

public class Extractor implements RefineriaGas{

    private List<Zangano> zanganos = new ArrayList<Zangano>();
    private int tiempoConstruccion = 6;
    private int vida = 750 ;

    public Extractor(){

    }
    public void agregar(Zangano unZangano){
        if (this.estaDisponible() && zanganos.size() < 3){
            zanganos.add(unZangano);
        } else {
            //Lanzar un error o algo
        }
    }

    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    @Override
    public void quitarVida(int cant) {
        vida  -= 750;
    }

    @Override
    public void avanzarTurno() {

    }

    @Override
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }

    @Override
    public int recolectar(Volcan volcan) {
        if (this.estaDisponible()) {
            return volcan.recolectar(zanganos.size() * 10);
        }
        return 0;
    }
}
