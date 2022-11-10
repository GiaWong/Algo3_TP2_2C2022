package edu.fiuba.algo3.modelo.Imperio;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Imperio.Exceptions.ErrorFaltaPrerequisito;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;

import java.util.ArrayList;
import java.util.List;


public class ImperioProtoss {

    private int mineral = 100;
    private List<Construccion> edificios = new ArrayList<Construccion>;
    private int gasVespeno = 100;
    //rivate List<Casilla> Columna = new ArrayList<>();

    public void nexoMineral(Mapa mapa, int i, int j) {
        if(mineral > 50) {
            NexoMineral nexo = new NexoMineral();
            mapa.agregar(nexo,i,j);
        }
    }

    public void pilon(Mapa mapa, int i, int j) {
        if(mineral > 100) {
            Pilon pilon = new Pilon();
            mapa.agregar(pilon,i,j);
        }
    }

    public void asimilador(Mapa mapa, int i, int j) {
        if(mineral > 100) {
            Asimilador asi = new Asimilador();
            mapa.agregar(asi,i,j);
        }
    }

    public void acceso(Mapa mapa, int i, int j) {
        if(mineral > 150) {
            Acceso acceso = new Acceso();
            mapa.agregar(acceso,i,j);
        }
    }

    public void puertoEstelar(Mapa mapa, int i, int j) {
        if(edificios.contains(new Acceso())){
            throw new ErrorFaltaPrerequisito();
        }
        if(mineral > 150 && gasVespeno>150) {
            PuertoEstelar puerto = new PuertoEstelar();
            mapa.agregar(puerto,i,j);
        }
    }
}
