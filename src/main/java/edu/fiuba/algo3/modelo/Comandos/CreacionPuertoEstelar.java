package edu.fiuba.algo3.modelo.Comandos;


import edu.fiuba.algo3.modelo.Construccion.PuertoEstelar;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionPuertoEstelar implements Accion  {
    private final Coordenada coordenada ;
    private final Mapa mapa ;
    private final Raza raza;


    public  CreacionPuertoEstelar(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }

    public void ejecutar() {
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        raza.comprar(puertoEstelar);
        mapa.agregar(puertoEstelar, coordenada);
    }
}

