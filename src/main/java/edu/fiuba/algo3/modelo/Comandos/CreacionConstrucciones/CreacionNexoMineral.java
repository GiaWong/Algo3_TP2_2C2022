package edu.fiuba.algo3.modelo.Comandos.CreacionConstrucciones;

import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionNexoMineral implements Accion {
    private  Coordenada coordenada;
    private  Mapa mapa;
    private Raza raza ;



    public  CreacionNexoMineral(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }

    public  CreacionNexoMineral(){

    }
    public void ejecutar() {
        Construccion nexo = new NexoMineral();
        raza.comprar(nexo);
        mapa.agregar(nexo, coordenada);
    }
}

