package edu.fiuba.algo3.modelo.ConstruccionProtoss;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;


public class  Asimilador extends ConstruccionProtoss {


    public Asimilador(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = 450;
        escudo =450;
        tiempoConstruccion =6;
    }

    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    public int recolectar(Volcan volcan) {
        if (this.estaDisponible()) {
            return volcan.recolectar(20);
        }
        return 0;
    }
}
