package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import edu.fiuba.algo3.modelo.Unidades.Zerling;

import java.util.ArrayList;
import java.util.List;

public class Espiral extends ConstruccionZerg {

    private ConstruccionZerg preRequisito = new Guarida();

    private int Vida_Total = 1300;
    private Mutalisco zerg;

    private Creador creacion;

    public Espiral(){
        costos.add(150); //esto es para Mineral
        costos.add(100); //esto es para Gas
        vida = Vida_Total;
        tiempoConstruccion = 10;
    }
    public boolean preRequisito(List<Construccion> lista){ //Hay que cambiar
        if(lista!=null) {
            for(int i =0; i<lista.size();i++){
                if(lista.get(i).getClass().equals(preRequisito.getClass())){
                    return true;
                }
            }
        }
        return false;
    }


    public void recibeDanio(int cant) {
        vida -= cant;
    }

    public int obtenerVida() {return vida; }

    public void regenerarVida(){
        if(vida <= (Vida_Total-10)){
            vida += 10;
        }
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();

    }

    public void conZerg(Mutalisco mutalisco) { //Esto seria el crearMutalisco()
        this.zerg = mutalisco;
        for(int i =0 ; i<=7;i++) {
            this.zerg.construir();
        }
    }
    public Mutalisco obtenerZerg() {
        return this.zerg;
    }

    public void crearMutalisco(){

    }
}
