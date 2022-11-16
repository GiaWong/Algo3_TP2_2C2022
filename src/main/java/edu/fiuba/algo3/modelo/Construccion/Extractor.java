package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.ArrayList;
import java.util.List;

public class Extractor implements RefineriaGas{

    private int Vida_Total = 750;
    private int vida  ;
    private int tiempoConstruccion = 6;
    private List<Zangano> zanganos = new ArrayList<Zangano>();
    private List<Integer> costos = new ArrayList<>();

    public Extractor(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = Vida_Total;
    }
    public void agregar(Zangano unZangano){
        if (this.estaDisponible() && zanganos.size() < 3){
            zanganos.add(unZangano);
        } else {
            //Lanzar un error o algo
        }
    }

    @Override
    public void construir() {
        tiempoConstruccion--;
    }

    @Override
    public void quitarVida(int cant) {
        vida  -= cant;
    }
    @Override
    public int obtenerVida() {return vida; }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();


    }
    public void regenerarVida(){
        if(vida <= (Vida_Total-10)){
            vida += 10;
        }
    }

    @Override
    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);

    }

    @Override
    public List<Integer> costo() {
        return costos;
    }

    @Override
    public int recolectar(Volcan volcan) {
        if (this.estaDisponible()) {
            return volcan.recolectar(zanganos.size() * 10);
        }
        return 0;
    }
}
