package edu.fiuba.algo3.modelo.Comandos;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Pilon;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.UnidadProtoss;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

public class CreacionPilon implements Acciones {
    private Coordenada locacion ;
    private Mapa mapa ;
    private Raza raza;


    public  CreacionPilon(Raza  unaRaza,Coordenada coordenada, Mapa unmapa){
        locacion = coordenada;
        mapa = unmapa;
        raza = unaRaza;
    }
    public void ejecutar (){
        Pilon pilon = new Pilon();
        raza.comprar(pilon);
        mapa.agregar(pilon, locacion);
    }
}

