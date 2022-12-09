package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

import java.util.ArrayList;
import java.util.List;

public abstract class Unidad {

    protected Vida vida;

    protected int tiempoConstruccion;

    protected int rango;

    protected Superficie superficie;

    protected Atacador atacador;

    protected Coordenada coordenada;

    protected Defensa defensa = new Detectable();

    protected List<Integer> costos = new ArrayList<>();

    public void construir() {
        tiempoConstruccion--;
    }

    public void asignarPosicion(Coordenada coord) { coordenada = coord; }

    public int vida() {return vida.vidaActual();}

    public List<Integer> costo() {
        return costos;
    }

    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    public boolean esPosibleSerAtacadoPor(Atacador ataque){
        return ataque.esPosibleAtacar(superficie);
    }

    public  void detectado(){

    }

    public boolean estaEnRango(Coordenada otrCoord){
        return coordenada.estaEnRango(otrCoord, rango);
    }

    public boolean estaVivo() {
        return vida.tieneVida();
    }



    public abstract void atacar(Unidad unaUnidad);

    public abstract void atacar(Construccion unaConstruccion);

    public abstract void recibirDanio(Danio danio);

    public abstract void esPosibleMoverseEn(AreaEspacial areaEspacial);

    public abstract void modificarSuministro(Suministro suministro);

    public abstract  void esPosibleConstruir(Construccion construccion);
}
