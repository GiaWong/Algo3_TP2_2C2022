package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Nada;
import edu.fiuba.algo3.modelo.Recursos.NadaProveedor;
import edu.fiuba.algo3.modelo.Recursos.NodoMineral;
import edu.fiuba.algo3.modelo.Recursos.ProveedorDeRecursoNatural;
import edu.fiuba.algo3.modelo.Recursos.Volcan;
import edu.fiuba.algo3.modelo.Zerg.Zangano;

import java.util.ArrayList;
import java.util.List;

public class Casilla {
    private int energia;
    private boolean hayMoho;
    private ProveedorDeRecursoNatural proveedor;
    private boolean hayProveedor;
    private Construccion construccion;
    private List<Zangano> zanganos = new ArrayList<>();

    public void Casilla(){
        this.energia = 0;
        this.hayMoho = false;
        this.proveedor = new NadaProveedor();
        this.construccion = new Nada();
        this.hayProveedor = false;

    }

    public void agregarConstruccion(Construccion construccion) {

        this.construccion = construccion;
    }

    public void agregarVolcan() {
        this.proveedor = new Volcan();
        this.hayProveedor= true;
    }

    public void agregarNodoMineral() {
        this.proveedor = new NodoMineral();
        this.hayProveedor = true;
    }
}
