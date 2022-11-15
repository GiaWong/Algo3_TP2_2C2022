package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Recursos.Volcan;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.List;

public class Extractor implements RefineriaGas{

    private List<Zangano> zanganos;
    private int tiempoConstruccion = 6;
    private int vida =750 ;

    public void agregar(Zangano unZangano){
        if (this.estaDisponible()){
            zanganos.add(unZangano);
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
        return volcan.recolectar(zanganos.size() * 10);
    }
}
