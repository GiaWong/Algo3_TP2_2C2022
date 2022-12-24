package edu.fiuba.algo3.modelo.Comandos.CreacionUnidades;

import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zerling;

public class CreacionZerling implements Accion {

    private final Unidad zerling = new Zerling();
    private final Raza raza;

    private final Coordenada coordenada;
    private final Mapa mapa;

    public CreacionZerling(Raza zerg, Coordenada unaCoordenada, Mapa unMapa){
        this.raza = zerg;
        this.mapa = unMapa;
        this.coordenada = unaCoordenada;
    }
    @Override
    public void ejecutar() {
        raza.comprar(zerling);
        //mapa.agregar(zerling, coordenada);
    }
}
