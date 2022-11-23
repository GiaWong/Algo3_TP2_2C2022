package edu.fiuba.algo3.modelo.ConstruccionZerg;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import java.util.List;

public class Espiral extends  ConstruccionZerg {

    private Guarida preRequisito = new Guarida();
    private Mutalisco zerg;

    public Espiral(){
        costos.add(150); //esto es para Mineral
        costos.add(100); //esto es para Gas
        Vida_Total = 1300;
        vida = Vida_Total;
        tiempoConstruccion = 10;
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

    public void conZerg(Mutalisco mutalisco) {
        this.zerg = mutalisco;
        for(int i =0 ; i<=7;i++) {
            this.zerg.construir();
        }
    }
    public Mutalisco obtenerZerg() {
        return this.zerg;
    }
}
