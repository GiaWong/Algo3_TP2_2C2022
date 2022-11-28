package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Exception.UnidadMuerta;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;

import java.util.ArrayList;
import java.util.List;

public abstract class Unidad {

    protected Vida vida;

    protected int tiempoConstruccion;

    protected int rango;

    protected Superficie superficie;

    protected Atacador atacador;

    protected Defensa defensa = new Detectable();

    protected Coordenada coordenada;

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
        return;
    }

    public boolean estaEnRango(Coordenada otrCoord){
        return coordenada.estaEnRango(otrCoord, rango);
    }

    public abstract void modificarSuministro(Suministro suministro); //Este metodo no deberia existir

    public abstract void recibirDanio(Danio danio);

    public abstract void atacar(Unidad unaUnidad);

    public abstract void atacar(Construccion unaConstruccion);

    public void estaOperativo() throws Exception{
        if(!vida.estaVivo()){
            throw new UnidadMuerta();
        }
    }

}
