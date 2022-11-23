package edu.fiuba.algo3.modelo.ConstruccionZerg;
import edu.fiuba.algo3.modelo.Unidades.Zerling;

public class ReservaProduccion extends ConstruccionZerg {
    private Zerling zerling;

    public ReservaProduccion(){
        costos.add(150); //esto es para Mineral
        costos.add(0); //esto es para Gas
        Vida_Total = 1000;
        vida =Vida_Total;
        tiempoConstruccion = 12;
    }

    public void evolucionar() {
    }


    public void regenerarVida(){
        if(vida < (Vida_Total)){
            vida += 10;
        }
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();

    }


    public void conZerg(Zerling zerg) {
        this.zerling = zerg;
        for(int i =0 ; i<=1;i++) {
            this.zerling.construir();
        }
    }

    public Zerling obtenerZerg() {
        return this.zerling;
    }
}
