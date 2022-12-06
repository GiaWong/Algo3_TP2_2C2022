package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionNexoMineral implements Accion {
    private final Coordenada coordenada;
    private final Mapa mapa;
    private final Raza raza;


    public  CreacionNexoMineral(){

    }
    public  CreacionNexoMineral(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }
    public void ejecutar() {
        Construccion nexo = new NexoMineral();
        raza.comprar(nexo);
        mapa.agregar(nexo, coordenada);
    }
}

