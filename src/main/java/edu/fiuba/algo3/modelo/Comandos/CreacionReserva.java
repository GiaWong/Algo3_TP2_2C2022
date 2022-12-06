package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class CreacionReserva implements Accion {
    private final Coordenada coordenada;
    private final Mapa mapa;
    private final Raza raza;

    public  CreacionReserva(Raza unaRaza,Coordenada unaCoordenada, Mapa unMapa){
        coordenada = unaCoordenada;
        mapa = unMapa;
        raza = unaRaza;
    }
    public void ejecutar() {
        Construccion reserva = new ReservaProduccion();
        raza.comprar(reserva);
        mapa.agregar(reserva, coordenada);
    }
}

