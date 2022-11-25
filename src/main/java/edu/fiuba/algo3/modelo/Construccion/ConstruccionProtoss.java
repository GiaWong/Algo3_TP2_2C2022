package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Recurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;

import java.util.ArrayList;
import java.util.List;

public abstract class ConstruccionProtoss extends Construccion {

    protected int escudo;

    public abstract void avanzarTurno();

}
