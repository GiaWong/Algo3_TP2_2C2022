package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.FaltaUnZanganoParaRecolectar;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;

public interface RefineriaGas {

    int recolectar(Volcan volcan) throws EdificioNoEstaOperativo, FaltaUnZanganoParaRecolectar;
}
