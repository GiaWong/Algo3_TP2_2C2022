package edu.fiuba.algo3.modelo.ConstruccionZerg;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Hidralisco;
import java.util.List;

public class Guarida extends ConstruccionZerg {

    private ReservaProduccion preRequisito = new ReservaProduccion();
    private Hidralisco hidralisco;

    public Guarida(){
        costos.add(200); //esto es para Mineral
        costos.add(100); //esto es para Gas
        Vida_Total = 1250;
        vida = Vida_Total;
        tiempoConstruccion = 12;
    }
    public boolean preRequisito(List<Construccion> lista){
        if(lista!=null) {
            for(int i =0; i<lista.size();i++){
                if(lista.get(i).getClass().equals(preRequisito.getClass())){
                    return true;
                }
            }
        }
        return false;
    }


    public void regenerarVida(){
        if(vida <= (Vida_Total-10)){
            vida += 10;
        }
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();

    }

    public void evolucionar() {

    }

    public void conZerg(Hidralisco hidra) {
        this.hidralisco = hidra;
        for(int i =0 ; i<=3;i++) {
            this.hidralisco.construir();
        }
    }

    public Hidralisco obtenerZerg() {
        return this.hidralisco;
    }
}
