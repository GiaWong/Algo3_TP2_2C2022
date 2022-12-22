package edu.fiuba.algo3.modelo.Comandos.CreacionConstrucciones;

import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionGuarida implements Accion {

    private final Coordenada coordenada ;
    private final Mapa mapa ;
    private final Raza raza;


    public  CreacionGuarida(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }

    @Override
    public void ejecutar() {
        Acceso acceso = new Acceso();
        raza.comprar(acceso);
        mapa.agregar(acceso, coordenada);
    }
}
