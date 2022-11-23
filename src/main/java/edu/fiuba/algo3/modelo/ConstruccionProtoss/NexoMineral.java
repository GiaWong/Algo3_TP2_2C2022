package edu.fiuba.algo3.modelo.ConstruccionProtoss;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;

public class NexoMineral extends ConstruccionProtoss {

    public NexoMineral(){
        costos.add(50); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = 250;
        escudo =250;
        tiempoConstruccion = 4 ;
    }

    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    public int recolectar(NodoMineral nodo) {
       if (this.estaDisponible()) {
            return nodo.recolectar(20);
        }
       return 0;
    }
}
