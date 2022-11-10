package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;

import java.util.ArrayList;
import java.util.List;

public class Casilla {
    private int energia;
    private boolean hayMoho;
    //private ProveedorDeRecursoNatural proveedor;
    private Construccion construccion;
    private List<Unidad> unidades = new ArrayList<>();

    public void Casilla(){
        this.energia = 0;
        this.hayMoho = false;
        //this.proveedor = new NadaRecurso();
        this.construccion = new Nada();

    }
}
