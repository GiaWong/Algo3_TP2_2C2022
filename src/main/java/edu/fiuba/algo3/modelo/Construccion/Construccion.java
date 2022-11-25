package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Detectable;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Construccion {

    protected Vida vida;
    protected int tiempoConstruccion;
    protected Detectable defensa = new Detectable();
    protected List<Integer> costos = new ArrayList<>();

    public void construir() {
        tiempoConstruccion--;
    }

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
}
