package edu.fiuba.algo3.modelo.Mapa;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.Nada;
import edu.fiuba.algo3.modelo.Exceptions.ErrorNoEsPosibleConstruir;
import edu.fiuba.algo3.modelo.Recursos.NadaProveedor;
import edu.fiuba.algo3.modelo.Recursos.NodoMineral;
import edu.fiuba.algo3.modelo.Recursos.ProveedorDeRecursoNatural;
import edu.fiuba.algo3.modelo.Recursos.Volcan;
import edu.fiuba.algo3.modelo.Zerg.*;

import java.util.ArrayList;
import java.util.List;

public class Casilla {
    private int energia;
    private boolean hayMoho;
    private ProveedorDeRecursoNatural proveedor;
    private boolean hayVolcan;

    private boolean hayNodoMineral;
    private Construccion construccion;
    private List<Zangano> zanganos = new ArrayList<>();

    public void Casilla(){
        this.energia = 0;
        this.hayMoho = false;
        this.proveedor = new NadaProveedor();
        this.construccion = new Nada();
        this.hayVolcan = false;
        this.hayNodoMineral = false;

    }

    public void agregarConstruccion(Construccion construccion) {
        if(!construccion.sePuedeConstruir(hayVolcan,hayNodoMineral)){
            throw new ErrorNoEsPosibleConstruir();
        }
        if(!construccion.sePuedeConstruir(hayMoho,energia)){
            throw new ErrorNoEsPosibleConstruir();
        }
        this.construccion = construccion;
    }


    public void agregarVolcan() {
        this.proveedor = new Volcan();
        this.hayVolcan= true;
    }

    public void agregarNodoMineral() {
        this.proveedor = new NodoMineral();
        this.hayNodoMineral = true;
    }

    public void fijarMoho(){
        if(!hayVolcan){
            this.hayMoho = true;
        }
    }

    public void sumarEnergia(){
        this.energia++;
    }

}
