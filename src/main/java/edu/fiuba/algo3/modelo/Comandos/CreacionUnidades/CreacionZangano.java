package edu.fiuba.algo3.modelo.Comandos.CreacionUnidades;

import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionZangano implements Accion {

    private Raza raza;
    private Mapa mapa;

    public CreacionZangano(Raza zerg, Mapa unMapa){
        this.raza = zerg;
        this.mapa = unMapa;
    }
    @Override
    public void ejecutar() {


    }
}
