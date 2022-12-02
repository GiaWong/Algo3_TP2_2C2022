package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Acciones.Detectable;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Construccion {

    protected Coordenada coordenada;
    protected Vida vida;
    protected int tiempoConstruccion;
    protected Detectable defensa = new Detectable();
    protected List<Integer> costos = new ArrayList<>();

    public void construir() {
        tiempoConstruccion--;
    }


    public void verificarEdificioOperativo() throws EdificioNoEstaOperativo {
        if(tiempoConstruccion > 0 ){
            throw new EdificioNoEstaOperativo();
        }
    }

    public void asignarPosicion(Coordenada coord) { coordenada = coord; }


    public List<Integer> costo() {
        return costos;
    }

    public boolean estaDisponible() {
        return tiempoConstruccion<=0;
    }

    public abstract void esPosibleConstruirEn(Volcan volcan);

    public abstract void esPosibleConstruirEn(NodoMineral nodoMineral);

    public abstract void esPosibleConstruirEn(SinRecurso sinRecurso);


    public abstract void esPosibleConstruirEn(ConEnergia energia);

    public abstract void esPosibleConstruirEn(ConMoho moho);

    public abstract void esPosibleConstruirEn(SinTerreno nada);

    public abstract void recibirDanio(Danio danio);

    public abstract void aumentarSuministro(Suministro suministro);

    public abstract boolean esPrerequisito(Construccion construccion);
}
