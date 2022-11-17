package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

import java.util.ArrayList;
import java.util.List;

public abstract class Raza {

    protected BancoDeRecursos banco = new BancoDeRecursos();
    protected List<Unidad> unidades = new ArrayList<>();
    protected List<Construccion> construcciones = new ArrayList<>();

    private void agregar(Construccion construccion){
        construcciones.add(construccion);
    }
    private void agregar(Unidad unidad){
        unidades.add(unidad);
    }


    public void comprar(Construccion construccion) {
        if (banco.esPosibleComprar(construccion)){
            banco.comprar(construccion);
            this.agregar(construccion);
        }
    }
    public void comprar(Unidad unidad) {
        if (banco.esPosibleComprar(unidad)){
            banco.comprar(unidad);
            this.agregar(unidad);
        }
    }
    public int obtenerCantidadConstrucciones(){
        return construcciones.size();
    }
    public int obtenerCantidadUnidades(){
       return unidades.size();
    }

    public abstract void recolectar();




}
