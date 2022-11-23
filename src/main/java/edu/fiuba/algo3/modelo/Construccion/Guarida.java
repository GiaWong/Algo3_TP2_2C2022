package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Unidades.Hidralisco;
import edu.fiuba.algo3.modelo.Unidades.Zerling;

import java.util.ArrayList;
import java.util.List;

public class Guarida extends ConstruccionZerg{

    private ConstruccionZerg preRequisito = new ReservaProduccion();
    private int Vida_Total = 1250;

    private Hidralisco hidralisco;

    private Creador creacion;

    public Guarida(){
        costos.add(200); //esto es para Mineral
        costos.add(100); //esto es para Gas
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
    @Override
    public void construir() {
        tiempoConstruccion--;
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

    public void crearHidralisco() {

    }

    public void conZerg(Hidralisco hidra) { //Esto seria el metodo de crearHidralisco()
        this.hidralisco = hidra;
        for(int i =0 ; i<=3;i++) {
            this.hidralisco.construir();
        }
    }

    public Hidralisco obtenerZerg() {
        return this.hidralisco;
    }
}
