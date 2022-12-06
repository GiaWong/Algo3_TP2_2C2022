package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionPilon implements Accion {
    private  Coordenada coordenada ;
    private  Mapa mapa ;
    private  Raza raza;


    public  CreacionPilon(){

    }

    public  CreacionPilon(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }
    public void cambiarParametros(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }
    public void ejecutar() {
        Pilon pilon = new Pilon();
        raza.comprar(pilon);
        mapa.agregar(pilon, coordenada);
    }
}

