package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

import java.util.ArrayList;
import java.util.List;

public abstract class Raza {

    protected BancoDeRecursos banco = new BancoDeRecursos();
    protected List<Unidad> unidades = new ArrayList<>();
    protected List<Construccion> construcciones = new ArrayList<>();

    private void agregarConstruccion(Construccion construccion){
        construcciones.add(construccion);
    }

    public void comprarConstruccion(Construccion construccion) {
        if (banco.esPosibleComprar(construccion)){
            banco.comprarConstuccion(construccion);
            this.agregarConstruccion(construccion);
        }
    }
    public int obtenerCantidadConstrucciones(){
        return construcciones.size();
    }

    public abstract void recolectar();

    public abstract void evolucionar();
}
