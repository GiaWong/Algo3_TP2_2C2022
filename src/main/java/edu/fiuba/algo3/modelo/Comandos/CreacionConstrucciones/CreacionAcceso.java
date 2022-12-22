package edu.fiuba.algo3.modelo.Comandos.CreacionConstrucciones;

import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.PuertoEstelar;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionAcceso {
    private final Coordenada coordenada ;
    private final Mapa mapa ;
    private final Raza raza;


    public  CreacionAcceso(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }

    public void ejecutar() {
        Acceso acceso = new Acceso();
        raza.comprar(acceso);
        mapa.agregar(acceso, coordenada);
    }
}
