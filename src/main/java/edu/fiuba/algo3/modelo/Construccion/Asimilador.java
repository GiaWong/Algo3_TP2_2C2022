package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;

public class  Asimilador implements RefineriaGas {

    private int vida = 450;
    private int escudo = 450;
    private int tiempoConstruccion =6 ;


    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    @Override
    public void quitarVida(int cant) {

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
            return volcan.recolectar(20);
        }
        return 0;
    }
}
