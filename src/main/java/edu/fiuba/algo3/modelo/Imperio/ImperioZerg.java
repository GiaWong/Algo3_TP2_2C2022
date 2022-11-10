package edu.fiuba.algo3.modelo.Imperio;

import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.Zerg.*;

public class ImperioZerg {
    private int mineral = 100;
    private int gasVespeno = 100;
    public void criadero(Mapa mapa, int i, int j) {
        if(mineral > 50) {
            Criadero criadero = new Criadero();
            mapa.agregar(criadero,i,j);
        }
    }

    public void reserva(Mapa mapa, int i, int j) {
        if(mineral > 150 ) {
            ReservaProduccion reserva = new ReservaProduccion();
            mapa.agregar(reserva,i,j);
        }
    }

    public void extractor(Mapa mapa, int i, int j) {
        if(mineral > 100) {
            Extractor extractor = new Extractor();
            mapa.agregar(extractor,i,j);
        }
    }

    public void guarida(Mapa mapa, int i, int j) {
        if(mineral > 200 && gasVespeno>100) {
            Guarida guarida = new Guarida();
            mapa.agregar(guarida,i,j);
        }
    }

    public void espiral(Mapa mapa, int i, int j) {
        if(mineral > 150 && gasVespeno>100) {
            Espiral espiral = new Espiral();
            mapa.agregar(espiral,i,j);
        }
    }
}
